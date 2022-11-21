import 'package:app/src/core/validator/AbstractValidatedString.dart';

/// A guard protecting [_next] to validate empty strings.
///
/// It's not a validator which decides if an empty string is a valid input,
/// therefore it will either return NULL (which means no validation error)
/// or the return value of the encapsulated [_next].
class NotEmptyStringGuard implements AbstractValidatedString {
  final AbstractValidatedString _next;

  NotEmptyStringGuard(this._next);

  @override
  Map<String, dynamic> validated(String value) {
    if (value.isNotEmpty) {
      return _next.validated(value);
    }
    return null;
  }
}
