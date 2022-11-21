import 'dart:async';

import 'package:angular/angular.dart';
import 'package:angular_forms/angular_forms.dart';
import 'package:app/src/core/Authentication.dart';

var jQuery;

@Component(
    selector: 'login-form',
    directives: [formDirectives, coreDirectives],
    viewProviders: [FORM_BINDINGS],
    templateUrl: 'Login.html')
class Login implements OnInit {
  @Output('signedin')
  Stream<dynamic> get evt_signedin => signedin.stream;

  final StreamController<dynamic> signedin = StreamController<dynamic>();

  @Input()
  bool modal = false;

  String containerClass = '';
  String rowClass = '';
  String colClass = '';
  String col3Class = '';
  String col6Class = '';
  String col12Class = '';

  bool correct;

  //FORM
  ControlGroup loginForm;

  //Form Inputs:
  String username;
  String password;

  Login() {
    correct = true;
  }

  @override
  void ngOnInit() {
    //FORM Field grouping and validation

    loginForm = FormBuilder.controlGroup({
      'username': [
        '',
        Validators.compose([Validators.required])
      ],
      'password': [
        '',
        Validators.compose([Validators.required])
      ],
    });

    if (!modal) {
      containerClass = 'container';
      rowClass = 'row';
      colClass = 'col';
      col3Class = 'col-sm-3';
      col6Class = 'col-sm-6';
      col12Class = 'col-sm-12';
    }
  }

  // Triggered on Form Submit
  void submitForm(Map formValues) async {
    username = formValues['username'];
    password = formValues['password'];
    correct = await Authentication.performLogin(username, password);
    if (correct) {
      signedin.add(true);
    }
  }
}
