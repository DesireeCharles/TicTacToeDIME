import 'package:app/src/url/BaseUrl.dart';
import 'package:app/src/url/fake/FakeLocationWrapper.dart';
import 'package:app/src/url/fake/FakePort.dart';
import 'package:test/test.dart';

void main() {
  group('BaseUrl', () {
    test('.url() returns complete URL', () {
      final locationWrapper = FakeLocationWrapper('http:', 'localhost', '8080');
      final port = FakePort('8080');
      final url = BaseUrl(locationWrapper, port).url();
      expect(url, 'http://localhost:8080');
    });
  });
}
