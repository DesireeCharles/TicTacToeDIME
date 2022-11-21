import 'package:angular_forms/angular_forms.dart';
import 'package:app/src/core/validator/AbstractValidatedDynamic.dart';
import 'package:app/src/core/validator/AbstractValidatedString.dart';
import 'package:app/src/core/validator/DynamicToStringGuard.dart';
import 'package:app/src/core/validator/NotEmptyStringGuard.dart';
import 'package:app/src/core/validator/NotNullGuard.dart';
import 'package:app/src/core/validator/RegExpValidator.dart';

abstract class DIMEValidators {
  static Map<String, dynamic> typeColorValidator(AbstractControl control) {
    return _guard(RegExpValidator.color()).validated(control.value);
  }

  static Map<String, dynamic> typeDateValidator(AbstractControl control) {
    return _guard(RegExpValidator.date()).validated(control.value);
  }

  static Map<String, dynamic> typeMonthValidator(AbstractControl control) {
    return _guard(RegExpValidator.month()).validated(control.value);
  }

  static Map<String, dynamic> typeWeekValidator(AbstractControl control) {
    return typeDateValidator(control);
  }

  static Map<String, dynamic> typeTimeValidator(AbstractControl control) {
    return _guard(RegExpValidator.time()).validated(control.value);
  }

  static Map<String, dynamic> typeDatetimeValidator(AbstractControl control) {
    return _guard(RegExpValidator.dateTime()).validated(control.value);
  }

  static Map<String, dynamic> typeURLValidator(AbstractControl control) {
    return _guard(RegExpValidator.url()).validated(control.value);
  }

  static Map<String, dynamic> typeTelValidator(AbstractControl control) {
    return _guard(RegExpValidator.tel()).validated(control.value);
  }

  static Map<String, dynamic> typeNumberValidator(AbstractControl control) {
    return _guard(RegExpValidator.number()).validated(control.value);
  }

  static Map<String, dynamic> typeEmailValidator(AbstractControl control) {
    return _guard(RegExpValidator.email()).validated(control.value);
  }

  static AbstractValidatedDynamic _guard(AbstractValidatedString validator) {
    return NotNullGuard(DynamicToStringGuard(NotEmptyStringGuard(validator)));
  }
}
