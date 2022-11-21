import 'dart:async';

import 'package:angular/angular.dart';

@Component(
    selector: 'notification',
    templateUrl: 'notification_component.html',
    styleUrls: ['notification_component.css'],
    directives: [coreDirectives])
class NotificationComponent implements OnInit {
  String message;

  String type = '';

  String animation = 'dime-alter-show';

  Timer timer;

  bool visible = false;

  NotificationComponent() {
    message = '';
  }

  @override
  void ngOnInit() {}

  void displayMessage(String m, AlertType type) {
    message = m;
    animation = 'dime-alter-show';
    this.type = type.toString().toLowerCase().substring(10);
    visible = true;
  }

  String getClass() {
    return 'alert alert-${type} ${animation}';
  }

  void close() {
    animation = 'dime-alter-hidden';
    Timer(Duration(seconds: 1), hide);
  }

  void hide() {
    visible = false;
  }
}

enum AlertType { SUCCESS, WARNING, INFO, DANGER }

class NotificationService {
  NotificationComponent component;

  void showError(String message) {
    component.displayMessage(message, AlertType.DANGER);
  }
}
