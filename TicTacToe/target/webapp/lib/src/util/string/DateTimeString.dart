import 'package:app/src/util/string/LengthAdjustedString.dart';

class DateTimeString {
  final DateTime _dt;

  DateTimeString(this._dt);

  String toJSON() {
    if (_dt == null) {
      return '';
    }
    var iso = _dt.toIso8601String();
    var hh = LengthAdjustedString.fromInt(_dt.timeZoneOffset.inHours.abs(), 2);
    var mm = LengthAdjustedString.fromInt(_dt.timeZoneOffset.inMinutes % 60, 2);
    var op = _dt.timeZoneOffset.isNegative ? '-' : '+';
    return '${iso}${op}${hh}:${mm}';
  }

  String toFORM() {
    if (_dt == null) {
      return '';
    }
    return '${toFORMDate()} ${toFORMTime()}';
  }

  String toFORMTime() {
    if (_dt == null) {
      return '';
    }
    var h = LengthAdjustedString.fromInt(_dt.hour, 2);
    var i = LengthAdjustedString.fromInt(_dt.minute, 2);
    return '${h}:${i}';
  }

  String toFORMDate() {
    if (_dt == null) {
      return '';
    }
    var d = LengthAdjustedString.fromInt(_dt.day, 2);
    return '${toFORMMonth()}-${d}';
  }

  String toFORMMonth() {
    if (_dt == null) {
      return '';
    }
    var y = LengthAdjustedString.fromInt(_dt.year, 4);
    var m = LengthAdjustedString.fromInt(_dt.month, 2);
    return '${y}-${m}';
  }

  String toSeconds() {
    if (_dt == null) {
      return '';
    }
    return (_dt.millisecondsSinceEpoch / 1000).toString();
  }
}
