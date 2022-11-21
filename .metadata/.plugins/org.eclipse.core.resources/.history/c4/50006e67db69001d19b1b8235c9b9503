import 'package:app/src/commons/Exceptions.dart';
import 'package:test/test.dart';

void main() {
  group('NoSuchPropertyException', () {
    test('.toString() returns custom message', () {
      expect(NoSuchPropertyException().toString(),
          'Failed to access class property');
    });
    test('.toString() returns default message', () {
      expect(NoSuchPropertyException('Message').toString(),
          'Failed to access class property: Message');
    });
  });
}
