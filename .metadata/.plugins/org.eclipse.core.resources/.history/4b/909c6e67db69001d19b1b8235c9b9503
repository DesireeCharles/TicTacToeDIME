import 'package:app/src/util/string/CheckedText.dart';
import 'package:test/test.dart';

void main() {
  group('CheckedText', () {
    test('.checked() returns false', () {
      expect(CheckedText(null).checked(), false);
      expect(CheckedText('').checked(), false);
    });
    test('.checked() returns true', () {
      expect(CheckedText('valid text').checked(), true);
      expect(CheckedText(' ').checked(), true);
    });
  });
}
