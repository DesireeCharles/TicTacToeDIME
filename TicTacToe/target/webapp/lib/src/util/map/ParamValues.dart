import 'package:app/src/util/map/MapBuilder.dart';

class ParamValues extends MapBuilder<String, String> {
  final Map<String, dynamic> _args;

  ParamValues(this._args);

  @override
  Map<String, String> map() {
    if (_args == null) {
      return {};
    }
    return _args.map((key, value) => MapEntry(key, value.toString()));
  }
}
