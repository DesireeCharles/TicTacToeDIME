import 'package:app/src/util/string/StringBuilder.dart';

class DimeAttributeString implements StringBuilder {
  final MapEntry<String, String> _entry;

  DimeAttributeString(this._entry);

  @override
  String toString() {
    if (_entry.value == null) {
      return _entry.key;
    }
    return _entry.key + ':' + _entry.value;
  }
}
