import 'package:angular/angular.dart';

import 'package:app/src/core/dime_process_service.dart';

@Component(
    selector: 'progress-bar',
    templateUrl: 'progress_bar_component.html',
    styleUrls: ['progress_bar_component.css'],
    directives: [coreDirectives]
)
class ProgressBarComponent {
  
  final DIMEProcessService _processService;
  
  bool _processActive = false;
  bool _showLoginForm = false;

  ProgressBarComponent(this._processService) {
    _processService.anyProcessActive$.listen((active) => _processActive = active);
    _processService.showLoginForm$.listen((show) => _showLoginForm = show);
  }
  
  bool get visible => _processActive && !_showLoginForm;
}
