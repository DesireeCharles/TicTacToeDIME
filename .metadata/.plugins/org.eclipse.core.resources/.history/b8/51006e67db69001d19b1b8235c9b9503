import 'package:app/src/core/validator/AbstractValidatedString.dart';
import 'package:app/src/core/validator/DynamicToStringGuard.dart';
import 'package:app/src/core/validator/ValidatorException.dart';
import 'package:test/test.dart';

class FakeValidatedString implements AbstractValidatedString {
  @override
  Map<String, dynamic> validated(String value) {
    return {'value': value};
  }
}

void main() {
  group('DynamicToString', () {
    test('.validated() succeeded', () {
      expect(DynamicToStringGuard(FakeValidatedString()).validated(123),
          {'value': '123'});
      expect(DynamicToStringGuard(FakeValidatedString()).validated('123'),
          {'value': '123'});
    });
    test('.validated() throws error', () {
      try {
        DynamicToStringGuard(FakeValidatedString()).validated({});
        fail('Expected ValidatorException to be thrown');
      } on ValidatorException catch (e) {
        expect(e.toString(), 'The passed value can\'t be converted to string');
      }
    });
  });
}
