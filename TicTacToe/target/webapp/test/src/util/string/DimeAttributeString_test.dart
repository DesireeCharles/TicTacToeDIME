import 'package:app/src/util/string/DimeAttributeString.dart';
import 'package:test/test.dart';

void main() {
  group('DimeAttributeString', () {
    test('.toString() returns key', () {
      expect(DimeAttributeString(MapEntry('key', null)).toString(), 'key');
    });
    test('.toString() returns key:value', () {
      expect(DimeAttributeString(MapEntry('key', 'value')).toString(),
          'key:value');
    });
  });
}
