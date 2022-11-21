import 'dart:convert';
import 'dart:html';

import 'package:app/src/models/FileReference.dart';

import 'filelikeobject.dart';
import 'fileuploader.dart';

class FileItem {
  FileLikeObject file;
  File _file;
  FileReference fileReference;
  String alias = 'file';
  String url = '/';
  String method = 'POST';
  List headers = [];
  bool withCredentials = true;
  List formData = [];
  bool isReady = false;
  bool isUploading = false;
  bool isUploaded = false;
  bool isSuccess = false;
  bool isCancel = false;
  bool isError = false;
  num progress = 0;
  int index;

  FileUploader uploader;
  HttpRequest xhr;

  FileItem(this.uploader, dynamic some) {
    if (some != null) {
      file = FileLikeObject(some);
      _file = some;
    }
    url = uploader.url;
  }

  File get rawfile => _file;

  void upload() {
    try {
      uploader.uploadItem(this);
    } catch (e) {
      uploader.onCompleteItem(this);
      uploader.onErrorItem(this);
    }
  }

  void deleteFileOnServer() {
    if (fileReference != null) {
      return;
    }
    final request = HttpRequest();
    request.open(
        'DELETE', 'rest/files/delete/' + fileReference.dywa_id.toString());
    request.onLoad.listen((event) {
      fileReference = null;
    });
    request.send();
  }

  void cancel() {
    // Delete File
    deleteFileOnServer();
    uploader.cancelItem(this);
  }

  void remove() {
    // Delete File
    deleteFileOnServer();
    uploader.removeFromQueue(this);
  }

  void onBeforeUpload() {
    isReady = true;
    isUploading = true;
    isUploaded = false;
    isSuccess = false;
    isCancel = false;
    isError = false;
    progress = 0;
  }

  void onProgress(num progress) {
    this.progress = progress;
  }

  void onSuccess(response) {
    isReady = false;
    isUploading = false;
    isUploaded = true;
    isSuccess = true;
    isCancel = false;
    isError = false;
    progress = 100;
    index = null;
    fileReference = FileReference(jsog: jsonDecode(response));
  }

  void onError() {
    isReady = false;
    isUploading = false;
    isUploaded = true;
    isSuccess = false;
    isCancel = false;
    isError = true;
    progress = 0;
    index = null;
    fileReference = null;
  }

  void onCancel() {
    isReady = false;
    isUploading = false;
    isUploaded = false;
    isSuccess = false;
    isCancel = true;
    isError = false;
    progress = 0;
    index = null;
    fileReference = null;
  }

  void onComplete() {
    if (uploader.removeAfterUpload) {
      remove();
    }
  }

  void prepareToUploading() {
    isReady = true;
  }
}
