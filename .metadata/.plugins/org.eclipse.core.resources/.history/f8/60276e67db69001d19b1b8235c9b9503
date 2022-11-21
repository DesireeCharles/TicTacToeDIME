import 'package:app/src/core/validator/AbstractValidatedString.dart';
import 'package:app/src/core/validator/NotEmptyStringGuard.dart';
import 'package:test/test.dart';

class FakeValidatedString implements AbstractValidatedString {
  @override
  Map<String, dynamic> validated(String value) {
    return {'value': value};
  }
}

void main() {
  group('NotNull', () {
    test('.validated() succeeded', () {
      expect(NotEmptyStringGuard(FakeValidatedString()).validated('abc'),
          {'value': 'abc'});
      expect(NotEmptyStringGuard(FakeValidatedString()).validated('123'),
          {'value': '123'});
    });
    test('.validated() returns null', () {
      expect(NotEmptyStringGuard(FakeValidatedString()).validated(''), null);
    });
  });
}
