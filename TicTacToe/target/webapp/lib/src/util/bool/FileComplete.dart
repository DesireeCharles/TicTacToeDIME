import 'package:app/src/util/bool/BoolBuilder.dart';

class FileComplete extends BoolBuilder {
  final dynamic _file;

  FileComplete(this._file);

  @override
  bool toBool() {
    return _file != null && _file.progress >= 100;
  }
}
