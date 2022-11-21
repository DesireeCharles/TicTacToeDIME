import 'package:app/src/url/fake/FakeLocationWrapper.dart';
import 'package:test/test.dart';

void main() {
  group('FakeLocationWrapper', () {
    final fakeLocationWrapper =
        FakeLocationWrapper('protocol', 'hostname', 'port');
    test('.protocol() returns constructor parameter', () {
      expect(fakeLocationWrapper.protocol(), 'protocol');
    });
    test('.hostname() returns constructor parameter', () {
      expect(fakeLocationWrapper.hostname(), 'hostname');
    });
    test('.port() returns constructor parameter', () {
      expect(fakeLocationWrapper.port(), 'port');
    });
  });
}
