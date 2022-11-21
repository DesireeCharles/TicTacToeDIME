import 'package:app/src/util/string/LengthAdjustedString.dart';
import 'package:test/test.dart';

void main() {
  group('LengthAdjustedString', () {
    test('Constructor throws ArgumentError', () {
      try {
        LengthAdjustedString(null, 0);
        fail('Expected ArgumentError to be thrown');
      } on ArgumentError catch (e) {
        expect(e.toString(), 'Invalid argument(s) (_string): Must not be null');
      }
    });
    test('Constructor throws RangeError', () {
      try {
        LengthAdjustedString('', -1);
        fail('Expected RangeError to be thrown');
      } on RangeError catch (e) {
        expect(e.toString(), 'RangeError (_length): Invalid value: Not greater than or equal to 0: -1');
      }
    });
    test('.toString() returns zero filled string', () {
      expect(LengthAdjustedString('', 1).toString(), '0');
      expect(LengthAdjustedString('a', 2).toString(), '0a');
      expect(LengthAdjustedString('ab', 4).toString(), '00ab');
      expect(LengthAdjustedString.fromInt(12, 4).toString(), '0012');
    });
    test('.toString() returns empty string', () {
      expect(LengthAdjustedString('a', 0).toString(), '');
      expect(LengthAdjustedString('', 0).toString(), '');
      expect(LengthAdjustedString.fromInt(0, 0).toString(), '');
    });
    test('.toString() returns original value', () {
      expect(LengthAdjustedString('a', 1).toString(), 'a');
      expect(LengthAdjustedString('ab', 2).toString(), 'ab');
      expect(LengthAdjustedString.fromInt(12, 2).toString(), '12');
    });
    test('.toString() returns substring', () {
      expect(LengthAdjustedString('ab', 1).toString(), 'b');
      expect(LengthAdjustedString('abcde', 4).toString(), 'bcde');
      expect(LengthAdjustedString.fromInt(1234, 4).toString(), '1234');
    });
  });
}
