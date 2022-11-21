import 'package:app/src/util/string/JoinedDimeAttributes.dart';
import 'package:test/test.dart';

void main() {
  group('JoinedDimeAttributes', () {
    test('.joined() returns joined entries, based on empty map', () {
      expect(JoinedDimeAttributes({}).toString(), '');
    });
    test('.joined() returns joined entries, based on map', () {
      expect(JoinedDimeAttributes({'key': 'value'}).toString(), 'key:value');
    });
    test('.joined() returns joined entries, based on map with null values', () {
      expect(
          JoinedDimeAttributes({'key': 'value', 'key2': 'value2', 'key3': null})
              .toString(),
          'key:value key2:value2 key3');
    });
  });
}
