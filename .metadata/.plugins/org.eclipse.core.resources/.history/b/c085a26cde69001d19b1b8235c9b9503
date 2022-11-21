import 'dart:async';
import 'dart:html';

import 'package:angular/angular.dart';

import '../core/dime_process_service.dart';

@Component(
    selector: 'dime-modal',
    directives: [coreDirectives],
    templateUrl: 'Modal.html'
)
class Modal implements OnInit, OnDestroy {

  @Input()
  bool isLink;

  @Input()
  bool isDisabled = false;

  @Input()
  String label;

  @Input()
  String title;

  @Input()
  String modalClass;
  
  @Input()
  String modalSizeClass = '';
  
  @Input()
  bool reload = false;

  @Input()
  bool hasBeforeIcon = false;

  @Input()
  String beforeIconClass;

  @Input()
  bool hasAfterIcon = false;

  @Input()
  String afterIconClass;

  @Output('opened')
  Stream<dynamic> get evt_opened => openedctrl.stream;
  StreamController<dynamic> openedctrl = StreamController<dynamic>();
  
  final DIMEProcessService _processService;
  
  final HtmlElement _hostEl;
  
  bool isShown = false;

  bool isLoaded = false;
  
  HtmlElement modalEl;
  
  Modal(this._processService, this._hostEl);

  @override
  void ngOnInit() {
    isShown = false;
  }
  
  @override
  void ngOnDestroy() {
    if (modalEl != null) {
      modalEl.remove();
    }
    close();
  }
  
  void appendModalToBody() {
  	modalEl = _hostEl.querySelector('.modal');
  	if (modalEl != null) {
  	  // append to the end of the body so that modal stacking works
  	  document.querySelector('body').append(modalEl);
  	}
  }
  
  void showModal(dynamic e) {   
    e.preventDefault();
    isShown = true;
    // trigger the change detection after setting 'isShown' to 'true'
    // so the modal element is accessible in the DOM and therefore in 'appendModalToBody'
    Timer(Duration(milliseconds: 1), () => appendModalToBody());
    openedctrl.add(hashCode);
    if (!reload) {
      isLoaded = true;
    }
  }

  void close() {
    isShown = false;
  }

  void closeModal(dynamic e) {
    e.preventDefault();
    close();
  }
  
  bool get disabled => isDisabled || _processService.isAnyProcessActive;
}
