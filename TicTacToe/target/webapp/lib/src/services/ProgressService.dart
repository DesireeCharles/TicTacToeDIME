import 'dart:html';

import 'package:app/src/core/dime_process_service.dart';

class ProgressService {

  final DIMEProcessService _processService;
  
  bool _processActive = false;
  bool _showLoginForm = false;

  ProgressService(this._processService) {
    _processService.anyProcessActive$.listen((active) {
  	  _processActive = active;
  	  update();
  	});
  	
    _processService.showLoginForm$.listen((show) {
      _showLoginForm = show;
      update();
	});
  }
  
  void update() {
  	if (_processActive && !_showLoginForm) {
  	  window.document.querySelector('body').classes.add('dime-progress');
    } else {
  	  window.document.querySelector('body').classes.remove('dime-progress');
  	}
  }
}
