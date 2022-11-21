import 'package:app/src/util/string/FileExtensionString.dart';

bool isElement(dynamic node) {
  return !!(node && (node.nodeName || node.prop && node.attr && node.find));
}

class FileLikeObject {
  dynamic lastModifiedDate;
  dynamic size;
  String type;
  String name;

  FileLikeObject(fileOrInput) {
    final isInput = false;
    final fakePathOrObject = isInput ? fileOrInput.value : fileOrInput;
    final postfix = (fakePathOrObject is String) ? 'FakePath' : 'Object';
    if (postfix == 'Object') {
      createFromObject(fakePathOrObject);
    } else {
      createFromFakePath(fakePathOrObject);
    }
  }

  void createFromFakePath(String path) {
    lastModifiedDate = null;
    size = null;
    type = 'like/${FileExtensionString(path)}';
    name = path.substring(path.lastIndexOf('/') + path.lastIndexOf('\\') + 2);
  }

  void createFromObject(dynamic object) {
    size = object.size;
    type = object.type;
    name = object.name;
  }

  @override
  String toString() {
    return name;
  }
}
