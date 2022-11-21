import 'package:app/src/util/string/StringBuilder.dart';

class LengthAdjustedString implements StringBuilder {
  final String _string;
  final int _length;

  LengthAdjustedString(this._string, this._length) {
    ArgumentError.checkNotNull(_string, '_string');
    RangeError.checkNotNegative(_length, '_length');
  }

  LengthAdjustedString.fromInt(int value, int length)
      : this(value.toString(), length);

  @override
  String toString() {
    if (_string.length < _length) {
      return _string.padLeft(_length, '0');
    }
    if (_string.length > _length) {
      return _string.substring(_string.length - _length);
    }
    return _string;
  }
}
