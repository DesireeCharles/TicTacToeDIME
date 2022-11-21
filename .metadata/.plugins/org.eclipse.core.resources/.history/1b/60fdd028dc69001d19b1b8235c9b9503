import 'package:app/src/util/int/Progress.dart';
import 'package:test/test.dart';

void main() {
  group('Progress', () {
    test('.toInt()', () {
      expect(Progress([], []).toInt(), 0);
      expect(Progress([1], [1]).toInt(), 0);
      expect(Progress([1, 2, 3, 4], [1, 2, 3]).toInt(), 25);
      expect(Progress([1, 2], [1]).toInt(), 50);
      expect(Progress([1, 2, 3, 4], [1]).toInt(), 75);
      expect(Progress([1, 2], []).toInt(), 100);
    });
  });
}
