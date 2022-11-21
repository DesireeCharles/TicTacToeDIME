import 'dart:html';

import 'package:angular/core.dart';
import 'package:app/src/util/string/JoinedDimeAttributes.dart';

@Directive(selector: '[dimeAttributes]')
class DimeCustomeAttributes {
  Element el;

  DimeCustomeAttributes(this.el);

  @Input('dimeAttributes')
  set dimeAttrs(Map<String, String> map) {
    el.attributes['dime'] = JoinedDimeAttributes(map).toString();
  }
}
