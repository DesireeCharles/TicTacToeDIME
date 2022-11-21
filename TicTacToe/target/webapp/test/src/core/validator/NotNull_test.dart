import 'package:app/src/core/validator/AbstractValidatedDynamic.dart';
import 'package:app/src/core/validator/NotNullGuard.dart';
import 'package:test/test.dart';

class FakeValidatedDynamic implements AbstractValidatedDynamic {
  @override
  Map<String, dynamic> validated(dynamic value) {
    return {'value': value};
  }
}

void main() {
  group('NotNull', () {
    test('.validated() succeeded', () {
      expect(
          NotNullGuard(FakeValidatedDynamic()).validated(123), {'value': 123});
      expect(NotNullGuard(FakeValidatedDynamic()).validated('123'),
          {'value': '123'});
    });
    test('.validated() returns null', () {
      expect(NotNullGuard(FakeValidatedDynamic()).validated(null), null);
    });
  });
}
