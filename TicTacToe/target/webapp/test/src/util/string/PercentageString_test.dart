import 'package:app/src/util/string/PercentageString.dart';
import 'package:test/test.dart';

void main() {
  group('PercentageString', () {
    test('.toString() returns String with % suffix', () {
      expect(PercentageString.fromNum(0).toString(), '0%');
      expect(PercentageString.fromNum(50).toString(), '50%');
      expect(PercentageString.fromNum(100).toString(), '100%');
    });
  });
}
