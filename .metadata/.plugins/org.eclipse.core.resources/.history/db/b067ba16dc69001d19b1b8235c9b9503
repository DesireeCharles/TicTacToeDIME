import 'package:app/src/util/string/StringBuilder.dart';

class FileExtensionString implements StringBuilder {
  final String _path;

  FileExtensionString(this._path);

  @override
  String toString() {
    if (!_path.contains('.')) {
      return '';
    }
    return _path.substring(_path.lastIndexOf('.') + 1).toLowerCase();
  }
}
