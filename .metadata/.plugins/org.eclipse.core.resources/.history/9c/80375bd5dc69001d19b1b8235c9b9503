import 'package:app/src/core/validator/AbstractValidatedDynamic.dart';
import 'package:app/src/core/validator/AbstractValidatedString.dart';
import 'package:app/src/core/validator/ValidatorException.dart';

/// A guard protecting [_next] to validate dynamic typed inputs.
///
/// It's not a validator which decides if a type is a valid input, but rather
/// make sure [_next] will be called by passing a string. Therefore it will
/// the return value of the encapsulated [_next] or throw an [ValidatorException]
/// in case the value can't be converted to string.
class DynamicToStringGuard implements AbstractValidatedDynamic {
  final AbstractValidatedString _next;

  DynamicToStringGuard(this._next);

  @override
  Map<String, dynamic> validated(dynamic value) {
    if (value is num) {
      return _next.validated(value.toString());
    }
    if (value is String) {
      return _next.validated(value);
    }
    // fail-fast strategy, in case the input field passes a type which
    // is not yet supported by this class to be converted to string
    throw ValidatorException('The passed value can\'t be converted to string');
  }
}
