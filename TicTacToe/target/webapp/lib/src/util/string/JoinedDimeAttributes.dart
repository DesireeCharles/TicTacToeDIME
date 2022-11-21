import 'package:app/src/util/string/DimeAttributeString.dart';
import 'package:app/src/util/string/StringBuilder.dart';

class JoinedDimeAttributes implements StringBuilder {
  final Map<String, String> _map;

  JoinedDimeAttributes(this._map);

  @override
  String toString() {
    return _map.entries.map((entry) => DimeAttributeString(entry)).join(' ');
  }
}
