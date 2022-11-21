import 'package:app/src/util/string/FileExtensionString.dart';
import 'package:test/test.dart';

void main() {
  group('FileExtensionString', () {
    test('.toString() returns lowercase file extension', () {
      expect(FileExtensionString('avatar.jpg').toString(), 'jpg');
      expect(FileExtensionString('avatar.png.jpg').toString(), 'jpg');
      expect(FileExtensionString('avatar.JPG').toString(), 'jpg');
      expect(FileExtensionString('avatar.png.JPG').toString(), 'jpg');
    });
    test('.toString() returns empty string', () {
      expect(FileExtensionString('avatar').toString(), '');
      expect(FileExtensionString('avatar.').toString(), '');
    });
  });
}
