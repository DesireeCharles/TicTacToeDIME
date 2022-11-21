import 'package:app/src/util/string/ShortenedString.dart';
import 'package:test/test.dart';

void main() {
  group('ShortenedString', () {
    test('Constructor throws RangeError', () {
      try {
        ShortenedString('', -1);
        fail('Expected RangeError to be thrown');
      } on RangeError catch (e) {
        expect(e.toString(), 'RangeError (_maxlength): Invalid value: Not greater than or equal to 0: -1');
      }
    });
    test('.toString() returns just dots', () {
      expect(ShortenedString('', 0).toString(), '...');
      expect(ShortenedString('s', 0).toString(), '...');
    });
    test('.toString() returns original string and dots', () {
      expect(ShortenedString('s', 1).toString(), 's...');
      expect(ShortenedString('string', 6).toString(), 'string...');
    });
    test('.toString() returns shortened string and dots', () {
      expect(ShortenedString('st', 1).toString(), 's...');
      expect(ShortenedString('string', 5).toString(), 'strin...');
    });
  });
}
