import 'dart:html';

import 'package:angular/core.dart';

import 'fileuploader.dart';

@Directive(selector: '[ng2-file-select]')
class FileSelect {
  Element element;

  FileSelect(this.element);

  @Input('uploader')
  FileUploader uploader;

  Map<String, dynamic> getOptions() {
    return uploader.options;
  }

  bool isEmptyAfterSelection() {
    return !!element.attributes.containsKey('multiple');
  }

  @HostListener('change')
  void onChange() {
    InputElement input = element;
    final files = input.files;
    final options = getOptions();
    uploader.addToQueue(files, options);
  }
}
