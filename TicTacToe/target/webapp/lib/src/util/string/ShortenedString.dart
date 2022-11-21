import 'StringBuilder.dart';

class ShortenedString implements StringBuilder {
  final String _text;
  final int _maxLength;

  ShortenedString(this._text, this._maxLength) {
    RangeError.checkNotNegative(_maxLength, '_maxlength');
  }

  @override
  String toString() {
    return _text.substring(0, _maxLength) + '...';
  }
}
