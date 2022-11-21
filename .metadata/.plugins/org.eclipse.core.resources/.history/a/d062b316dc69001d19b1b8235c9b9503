import 'dart:convert';

class FileReference {
  int dywa_id;
  String fileName;
  String contentType;

  FileReference({jsog}) {
    // default constructor
    if (jsog == null) {
      dywa_id = -1;
      fileName = '';
      contentType = '';
    }
    // from jsog
    else {
      dywa_id = jsog['dywaId'];
      fileName = jsog['fileName'];
      contentType = jsog['contentType'];
    }
  }

  static FileReference fromId(int id) {
    final fr = FileReference();
    fr.dywa_id = id;
    return fr;
  }

  Map<String, dynamic> toJSOG([Map<Object, dynamic> objects]) {
    return {
      'dywaId': dywa_id,
      'fileName': fileName,
      'contentType': contentType
    };
  }

  String toJSON() {
    return jsonEncode(toJSOG(<Object, dynamic>{}));
  }

  @override
  String toString() {
    return fileName;
  }
}
