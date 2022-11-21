import 'package:app/src/util/iterable/NotNullItems.dart';
import 'package:test/test.dart';

void main() {
  group('NotNullItems', () {
    test('Constructor throws ArgumentError', () {
      try {
        NotNullItems(null);
        fail('Expected ArgumentError to be thrown');
      } on ArgumentError catch (e) {
        expect(e.toString(), 'Invalid argument(s) (_items): Must not be null');
      }
    });
    test('.iterable() returns an iterable without null-items', () {
      expect(NotNullItems(<String>['foo', null, 'bar']).iterable(), ['foo', 'bar']);
    });
  });
}
