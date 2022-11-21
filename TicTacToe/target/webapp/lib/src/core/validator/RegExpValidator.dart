import 'package:app/src/core/validator/AbstractValidatedString.dart';

/// A validator which will validate a string value against a regular expression.
///
/// It will either return NULL in case the value matches the regular expression
/// or a Map<String, bool> in case it doesn't.
class RegExpValidator extends AbstractValidatedString {
  final String _regExp;
  final String _type;
  final bool _caseSensitive;

  RegExpValidator(this._type, this._regExp, this._caseSensitive);

  RegExpValidator.color()
      : this('Color', r'^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})', true);

  RegExpValidator.dateTime()
      : this('Datetime', r'[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}', true);

  RegExpValidator.date() : this('Date', r'[0-9]{4}-[0-9]{2}-[0-9]{2}', true);

  RegExpValidator.email()
      : this(
            'Email',
            r'^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$',
            true);

  RegExpValidator.month() : this('Month', r'[0-9]{4}-[0-9]{2}', true);

  RegExpValidator.number() : this('Number', r'^-*[0-9,\.]+', true);

  RegExpValidator.tel() : this('Tel', r'^[\+]?[0-9]{9,15}', true);

  RegExpValidator.time() : this('Time', r'[0-9]{2}:[0-9]{2}', true);

  RegExpValidator.url()
      : this(
            'URL',
            r'(https?|ftp)://([-A-Z0-9.]+)(:[0-9]+)?(/[-A-Z0-9+&@#/%=~_|!:,.;]*)?(\?[A-Z0-9+&@#/%=~_|!:,.;]*)?',
            false);

  @override
  Map<String, bool> validated(String value) {
    if (_notValid(value)) {
      return {'type${_type}Validator': true};
    }
    return null;
  }

  bool _notValid(String value) {
    return _matchedString(value) != value;
  }

  String _matchedString(String value) =>
      RegExp(_regExp, caseSensitive: _caseSensitive).stringMatch(value);
}
