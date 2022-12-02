import 'dart:html';

import 'package:app/src/models/FileReference.dart';
import 'package:app/src/util/int/Progress.dart';
import 'package:app/src/util/iterable/NotNullItems.dart';
import 'package:app/src/util/string/PercentageString.dart';

import 'fileitem.dart';
import 'filelikeobject.dart';

bool isFile(value) {
  return value is File;
}

bool isFileLikeObject(value) {
  return value is FileLikeObject;
}

class FileUploader {
  String url;
  bool isUploading = false;
  List<FileItem> queue;
  num progress = 0;
  bool autoUpload = false;
  bool isHTML5 = true;
  bool removeAfterUpload = false;
  int queueLimit;
  List<FileReference> fileReferences;
  num nextIndex = 0;
  List filters;
  Map<String, dynamic> options;
  bool _error;
  String _errorMessage;
  String accept;
  int maxMB = 100;

  FileUploader(this.options,
      {this.autoUpload = false, accept, this.maxMB = 100}) {
    _error = false;
    queueLimit = 1;
    if (options.containsKey('url')) {
      url = options['url'];
    }
    fileReferences = <FileReference>[];
    queue = [];
    filters = [];
  }

  String get percentProgress {
    return PercentageString.fromNum(progress).toString();
  }

  List<FileReference> getFileReferences() {
    return NotNullItems(queue.map((i) => i.fileReference)).iterable();
  }

  void addToQueue(List files, dynamic options) {
    final list = [];
    list.addAll(files);
    _error = false;

    if (queueLimit <= queue.length) {
      clearQueue();
    }

    final count = queue.length;
    final addedFileItems = [];

    list.forEach((some) {
      final temp = FileLikeObject(some);

      if (_isValidFile(temp, [], options)) {
        final fileItem = FileItem(this, some);
        fileItem.file = temp;
        addedFileItems.add(fileItem);
        queue.add(fileItem);
      }
    });

    if (queue.length != count) {
      progress = _getTotalProgress(progress);
    }

    if (autoUpload) {
      uploadAll();
    }
  }

  void removeFromQueue(FileItem value) {
    final index = _getIndexOfItem(value);
    final item = queue[index];
    if (item.isUploading) {
      item.cancel();
    }

    queue.removeAt(index);
    progress = _getTotalProgress(progress);
  }

  void clearQueue() {
    _error = false;
    queue.forEach((item) => item.deleteFileOnServer());
    queue.clear();
    fileReferences.clear();
    progress = 0;
  }

  void uploadItem(FileItem value) {
    isUploading = true;
    _xhrTransport(value);
  }

  void cancelItem(FileItem value) {
    if (value != null && value.isUploading) {
      if (isHTML5) {
        value.xhr.abort();
      }
    }
  }

  void uploadAll() {
    _error = false;
    final items =
        getNotUploadedItems().where((item) => !item.isUploading).toList();
    items.forEach((item) => item.prepareToUploading());
    items.forEach((item) => item.upload());
  }

  void cancelAll() {
    _error = false;
    List items = getNotUploadedItems();
    items.map((item) => item.cancel());
  }

  int _getIndexOfItem(value) {
    return value is num ? value : queue.indexOf(value);
  }

  List<FileItem> getNotUploadedItems() {
    if (queue == null) return <FileItem>[];
    return queue.where((item) => !item.isUploaded).toList();
  }

  int _getTotalProgress(value) {
    if (removeAfterUpload) {
      return value;
    }
    return Progress(queue, getNotUploadedItems()).toInt();
  }

  bool _isValidFile(file, List filters, options) {
    if (filters == null) return true;
    if (filters.isEmpty) return true;
    return filters.every((filter) {
      return filter.fn.call(this, file, options);
    });
  }

  bool _isSuccessCode(status) {
    return (status >= 200 && status < 300) || status == 304;
  }

  bool hasError() {
    return _error;
  }

  String errorMessage() {
    return _errorMessage;
  }

  void _xhrTransport(FileItem item) {
    final xhr = HttpRequest();
    item.xhr = xhr;
    xhr.withCredentials = true;
    final form = FormData();
    form.appendBlob('file', item.rawfile, item.file.name);

    _onBeforeUploadItem(item);

    if (item.file.size is! num) {
      throw StateError('The file specified is no longer valid');
    }
    //check file size
    if (item.file.size / 1000000 > maxMB) {
      queue.remove(item);
      isUploading = false;
      progress = 0;
      _errorMessage = 'file exceeded the file limit of ${maxMB.toString()} MB';
      _error = true;
      return;
    }
    //check file type
    if (accept != null) {
      final fileEx = item.file.type;
      if (accept
          .split(',')
          .map((s) => s.replaceAll('\.', ''))
          .where((s) => fileEx.contains(s))
          .isEmpty) {
        queue.remove(item);
        isUploading = false;
        progress = 0;
        _errorMessage = 'file has invalid file extension. Accepted: ${accept}';
        _error = true;
        return;
      }
    }

    xhr.onProgress.listen((event) {
      num progress =
          (event.lengthComputable ? event.loaded * 100 / event.total : 0)
              .round();
      _onProgressItem(item, progress);
    });

    xhr.onLoad.listen((event) {
      if ((event.currentTarget as HttpRequest).status != 200) {
        _errorMessage =
            'uploaded file exceeded the file limit of ${maxMB.toString()} MB';
        _error = true;
        isUploading = false;
      } else {
        final gist = _isSuccessCode(xhr.status) ? 'Success' : 'Error';
        if (gist == 'Error') {
          onErrorItem(item);
        } else {
          _onSuccessItem(item, xhr.response);
        }
        isUploading = false;
      }
      onCompleteItem(item);
    });

    xhr.onError.listen((event) {
      if ((event.currentTarget as HttpRequest).status != 200) {
        _errorMessage =
            'uploaded file exceeded the file limit of ${maxMB.toString()} MB';

        _error = true;
        isUploading = false;
      }

      onErrorItem(item);
    });

    xhr.onAbort.listen((event) {
      if ((event.currentTarget as HttpRequest).status != 200) {
        _errorMessage = 'file upload has been aborted';
        _error = true;
      }
      isUploading = false;
      _onCancelItem(item);
    });

    xhr.open(item.method, url, async: true);
    final jwt = window.localStorage['jwt'];
    if (jwt != null) {
      xhr.setRequestHeader('Authorization', 'Bearer ${jwt}');
    }
    xhr.send(form);
  }

  void _onBeforeUploadItem(FileItem item) {
    item.onBeforeUpload();
  }

  void _onProgressItem(FileItem item, progress) {
    final total = _getTotalProgress(progress);
    this.progress = total;
    item.onProgress(progress);
  }

  void _onSuccessItem(FileItem item, response) {
    item.onSuccess(response);
  }

  void onErrorItem(FileItem item) {
    item.onError();
    queue.remove(item);
    isUploading = false;
    progress = 0;
  }

  void _onCancelItem(FileItem item) {
    item.onCancel();
  }

  void onCompleteItem(FileItem item) {
    item.onComplete();
    progress = _getTotalProgress(progress);
    if (progress >= 100.0) {
      isUploading = false;
    }
  }
}
