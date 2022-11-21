import 'package:app/src/url/ApiPort.dart';
import 'package:app/src/url/fake/FakeLocationWrapper.dart';
import 'package:test/test.dart';

void main() {
  group('ApiPort', () {
    test('.port() returns port number', () {
      expect(ApiPort(FakeLocationWrapper('http:', '', '8080')).port(), '8080');
      expect(ApiPort(FakeLocationWrapper('http:', '', '443')).port(), '443');
      expect(ApiPort(FakeLocationWrapper('http:', '', '')).port(), '80');
      expect(ApiPort(FakeLocationWrapper('https:', '', '')).port(), '443');
      expect(ApiPort(FakeLocationWrapper('http:', '', '9090')).port(), '8080');
    });
    test('.port() throws exception', () {
      expect(() => ApiPort(FakeLocationWrapper('ws:', '', '')).port(),
          throwsException);
    });
  });
}
