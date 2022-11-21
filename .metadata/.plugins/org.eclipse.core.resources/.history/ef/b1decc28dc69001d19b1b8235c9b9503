import 'dart:html';
import 'dart:js' as js;

import 'package:angular/core.dart';
import 'package:app/src/util/string/ShortenedString.dart';

@Directive(selector: '[maxLength]')
class MaxLength {
  String title;
  String toggle;
  final Element _el;

  MaxLength(this._el) {
    title = '';
    toggle = '';
  }

  @Input('maxLength')
  set mode(int size) {
    final text = _el.text;
    if (text.length >= size) {
      _el.text = ShortenedString(text, size).toString();
      title = text;
      toggle = 'tooltip';
    }
    _el.attributes['data-original-title'] = title;
    _el.attributes['data-toggle'] = toggle;
    js.context.callMethod(r'jQuery', [_el]).callMethod('tooltip');
  }
}
