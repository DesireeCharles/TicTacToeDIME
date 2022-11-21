import 'package:app/src/core/validator/DynamicToStringGuard.dart';
import 'package:app/src/core/validator/NotEmptyStringGuard.dart';
import 'package:app/src/core/validator/NotNullGuard.dart';
import 'package:app/src/core/validator/RegExpValidator.dart';
import 'package:test/test.dart';

void main() {
  group('RegExpValidator', () {
    test('.validated() passes', () {
      expect(RegExpValidator('', '', false).validated(''), null);
      expect(RegExpValidator('', '', true).validated(''), null);
      expect(RegExpValidator.color().validated('#ffffff'), null);
      expect(RegExpValidator.date().validated('1999-12-31'), null);
      expect(RegExpValidator.dateTime().validated('2020-10-11 13:33'), null);
      expect(RegExpValidator.email().validated('john.doe@exmaple.org'), null);
      expect(RegExpValidator.month().validated('1989-01'), null);
      expect(RegExpValidator.number().validated('123456789'), null);
      expect(RegExpValidator.number().validated('-123456789'), null);
      expect(RegExpValidator.number().validated('12.3456789'), null);
      expect(RegExpValidator.number().validated('-12.3456789'), null);
      expect(RegExpValidator.number().validated('12345,6789'), null);
      expect(RegExpValidator.number().validated('-1234,56789'), null);
      expect(RegExpValidator.tel().validated('123456789'), null);
      expect(RegExpValidator.time().validated('24:00'), null);
      expect(RegExpValidator.url().validated('https://www.google.de'), null);
    });
    test('.validated() found error', () {
      expect(RegExpValidator.color().validated('#fffff'),
          {'typeColorValidator': true});
      expect(RegExpValidator.date().validated('1999-12/31'),
          {'typeDateValidator': true});
      expect(RegExpValidator.dateTime().validated('2020-10-11 13:'),
          {'typeDatetimeValidator': true});
      expect(RegExpValidator.email().validated('john.doe@exmaple.'),
          {'typeEmailValidator': true});
      expect(RegExpValidator.month().validated('1989/01'),
          {'typeMonthValidator': true});
      expect(RegExpValidator.number().validated('12345678a'),
          {'typeNumberValidator': true});
      expect(RegExpValidator.number().validated(''),
          {'typeNumberValidator': true});
      expect(RegExpValidator.tel().validated('123456(78)9'),
          {'typeTelValidator': true});
      expect(RegExpValidator.time().validated('2h:00'),
          {'typeTimeValidator': true});
      expect(RegExpValidator.url().validated('https:/www.google.de'),
          {'typeURLValidator': true});
    });
  });
  group('RegExpValidator integration test', () {
    test('.validated() passes', () {
      expect(
          NotNullGuard(DynamicToStringGuard(RegExpValidator.number()))
              .validated(123),
          null);
      expect(
          NotNullGuard(DynamicToStringGuard(RegExpValidator.number()))
              .validated(-123),
          null);
      expect(
          NotNullGuard(DynamicToStringGuard(RegExpValidator.number()))
              .validated(null),
          null);
      expect(
          NotNullGuard(DynamicToStringGuard(RegExpValidator.number()))
              .validated('123'),
          null);
      expect(
          NotNullGuard(DynamicToStringGuard(RegExpValidator.number()))
              .validated('-123'),
          null);
      expect(
          NotNullGuard(DynamicToStringGuard(
                  NotEmptyStringGuard(RegExpValidator.number())))
              .validated(''),
          null);
    });
    test('.validated() found error', () {
      expect(
          NotNullGuard(DynamicToStringGuard(RegExpValidator.number()))
              .validated('abc'),
          {'typeNumberValidator': true});
    });
  });
}
