import 'package:app/src/util/string/StringBuilder.dart';

class PercentageString implements StringBuilder {
  final String _string;

  PercentageString(this._string);

  PercentageString.fromNum(num number) : this(number.toString());

  @override
  String toString() {
    return '${_string}%';
  }
}
