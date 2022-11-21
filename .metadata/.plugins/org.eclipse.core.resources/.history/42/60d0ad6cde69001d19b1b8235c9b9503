import 'package:app/src/util/string/CssClass.dart';
import 'package:test/test.dart';

void main() {
  group('CssClass', () {
    test('.toString() returns concatenated classes', () {
      expect(CssClass.fromBool('a', 'b', true).toString(), 'a b');
    });
    test('.checked() returns base class', () {
      expect(CssClass.fromBool('a', 'b', false).toString(), 'a');
    });
  });
}
