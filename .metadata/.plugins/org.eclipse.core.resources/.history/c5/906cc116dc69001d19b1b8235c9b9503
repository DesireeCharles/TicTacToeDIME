import 'package:app/src/util/map/ParamValues.dart';
import 'package:test/test.dart';

void main() {
  group('ParamValued', () {
    test('.map() returns an empty map', () {
      expect(ParamValues(null).map(), {});
    });
    test('.map() returns a map where all values are converted to Strings', () {
      const args = {'int': 1, 'double': 1.1, 'string': 'string', 'null': null};
      var actual = ParamValues(args).map();
      var expected = {
        'int': '1',
        'double': '1.1',
        'string': 'string',
        'null': 'null'
      };
      expect(actual, expected);
    });
  });
}
