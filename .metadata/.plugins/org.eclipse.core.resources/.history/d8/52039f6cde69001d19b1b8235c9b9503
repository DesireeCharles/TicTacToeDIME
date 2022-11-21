import 'package:app/src/core/validator/AbstractValidatedDynamic.dart';

/// A guard protecting [_next] to validate a NULL value.
///
/// It's not a validator which decides if NULL is a valid input, therefore it
/// will either return NULL (which means no validation error) or the return
/// value of the encapsulated [_next].
class NotNullGuard implements AbstractValidatedDynamic {
  final AbstractValidatedDynamic _next;

  NotNullGuard(this._next);

  @override
  Map<String, dynamic> validated(dynamic value) {
    if (value != null) {
      return _next.validated(value);
    }
    return null;
  }
}
