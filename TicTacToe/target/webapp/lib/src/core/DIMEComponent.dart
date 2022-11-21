import 'dart:html' as html;

import 'package:angular/security.dart';
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/modal/Modal.dart' as modal;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/util/bool/FileComplete.dart';
import 'package:app/src/util/map/ParamValues.dart';
import 'package:app/src/util/string/CheckedText.dart';
import 'package:app/src/util/string/CssClass.dart';
import 'package:markdown/markdown.dart' as markdown;

import 'dime_process_service.dart' as service;

abstract class DIMEComponent {
  final DomSanitizationService domSanitizationService;
  final service.DIMEProcessService _processService;
  final AbstractRoutes routes;
  List<modal.Modal> modals;

  DIMEComponent(
      this.domSanitizationService, this._processService, this.routes) {
    imageHash = hashCode.toString();
  }

  String getRuntimeId();

  String imageHash = '';

  void updateImageHash() {
    imageHash = DateTime.now().millisecondsSinceEpoch.toString();
  }

  bool checkText(String text) {
    return CheckedText(text).checked();
  }

  DIMEList newList() {
    return DIMEList();
  }

  String getRestBaseUrl() => service.DIMEProcessService.getBaseUrl();

  bool isBusy() {
    if (_processService.activeProcesses.containsKey(getRuntimeId())) {
      return _processService.activeProcesses[getRuntimeId()].runtime.busy;
    }
    return false;
  }

  String renderMarkdown(String m) => markdown.markdownToHtml(m,
      extensionSet: markdown.ExtensionSet.gitHubFlavored);

  SafeHtml getSafeHtml(String s) {
    if (s == null) {
      return domSanitizationService.bypassSecurityTrustHtml('');
    }
    return domSanitizationService.bypassSecurityTrustHtml(s);
  }

  String get getLogoutURL {
    return '${service.DIMEProcessService.getBaseUrl()}/logout';
  }

  html.Window get window => html.window;

  dynamic closeModalTrigger(dynamic e) {
    modals.forEach((m) => m.close());
    return e;
  }

  Object trackSelective(int index, dynamic selective) {
    return selective.hashCode;
  }

  /// checks if a file is present
  bool isFileAvailable(FileReference fileRef) {
    if (fileRef != null) {
      if (fileRef.fileName != null) {
        return true;
      }
    }
    return false;
  }

  /// returns the file name if present
  String getFileName(FileReference fileRef) {
    if (isFileAvailable(fileRef)) {
      return fileRef.fileName;
    }
    return '';
  }

  String getUrl(String typeName, Map<String, dynamic> args) {
    return routes.getByName(typeName).toUrl(ParamValues(args).map());
  }

  /// returns the uploader CSS class if a file is present
  String getUploaderClass(dynamic file) {
    return CssClass('progress-bar', 'progress-bar-success', FileComplete(file))
        .toString();
  }

  void downloadURI(String uri) {
    html.AnchorElement link = html.document.createElement('a');
    link.href = uri;
    html.document.body.append(link);
    link.click();
    link.remove();
  }

  DateTime getStaticDate(int ts) => DateTime.fromMillisecondsSinceEpoch(ts);
}
