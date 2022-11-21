import 'package:app/src/util/bool/BasicBoolBuilder.dart';
import 'package:app/src/util/bool/BoolBuilder.dart';
import 'package:app/src/util/string/StringBuilder.dart';

class CssClass implements StringBuilder {
  String _baseClass;
  String _additionalClass;
  BoolBuilder _boolBuilder;

  CssClass(this._baseClass, this._additionalClass, this._boolBuilder);

  CssClass.fromBool(_baseClass, _additionalClass, _bool)
      : this(_baseClass, _additionalClass, BasicBoolBuilder(_bool));

  @override
  String toString() {
    if (_boolBuilder.toBool()) {
      return '${_baseClass} ${_additionalClass}';
    }
    return _baseClass;
  }
}
