import 'package:app/src/util/bool/FileComplete.dart';
import 'package:test/test.dart';

class FakeFileComplete {
  int progress;

  FakeFileComplete(this.progress);
}

void main() {
  group('FileComplete', () {
    test('.toBool() returns false if parameter is null', () {
      expect(FileComplete(null).toBool(), false);
    });
    test('.toBool() returns true if parameter is greater than 100', () {
      expect(FileComplete(FakeFileComplete(101)).toBool(), true);
    });
    test('.toBool() returns false if parameter is negative', () {
      expect(FileComplete(FakeFileComplete(-1)).toBool(), false);
    });
    test('.toBool()', () {
      expect(FileComplete(FakeFileComplete(0)).toBool(), false);
      expect(FileComplete(FakeFileComplete(99)).toBool(), false);
      expect(FileComplete(FakeFileComplete(100)).toBool(), true);
    });
  });
}
