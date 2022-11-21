import 'dart:async';

import 'package:angular/angular.dart';
import 'package:app/src/directives/DimeCustomeAttributes.dart';

@Component(
    selector: 'dime-panel',
    directives: [DimeCustomeAttributes, coreDirectives],
    templateUrl: 'Panel.html')
class Panel implements OnInit {
  @Input()
  Map<String, String> styling = {};

  @Input()
  Map<String, String> attributes = {};

  @Input()
  String coloring = '';

  @Input()
  String cincoId = '';

  @Input()
  bool hasHeading = false;

  @Input()
  bool collapsable = false;

  @Input()
  bool initial;

  @Input()
  bool isDisabled;

  bool isCollapsed = false;

  bool isLoaded = false;

  @Output('clickHeading')
  Stream<dynamic> get clickHeading => _clickHeading.stream;
  final _clickHeading = StreamController();

  String get colorClass => 'panel-${coloring}';

  @override
  void ngOnInit() {
    isCollapsed = !initial;

    if (!isCollapsed) {
      isLoaded = true;
    }
  }

  void triggerCollapse(dynamic e) {
    e.preventDefault();
    if (collapsable) {
      isLoaded = true;
      isCollapsed = !isCollapsed;
      _clickHeading.add(isCollapsed);
    }
  }
}
