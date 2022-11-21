import 'package:app/src/util/string/DateTimeString.dart';
import 'package:test/test.dart';

void main() {
  group('DateTimeString', () {
    var dateTime = DateTime.parse('2012-02-27 13:27:00+00:00');
    test('.toJSON()', () {
      expect(DateTimeString(null).toJSON(), '');
      expect(DateTimeString(dateTime).toJSON(), '2012-02-27T13:27:00.000Z+00:00');
    });
    test('.toFORM()', () {
      expect(DateTimeString(null).toFORM(), '');
      expect(DateTimeString(dateTime).toFORM(), '2012-02-27 13:27');
    });
    test('.toFORMTime()', () {
      expect(DateTimeString(null).toFORMTime(), '');
      expect(DateTimeString(dateTime).toFORMTime(), '13:27');
    });
    test('.toFORMDate()', () {
      expect(DateTimeString(null).toFORMDate(), '');
      expect(DateTimeString(dateTime).toFORMDate(), '2012-02-27');
    });
    test('.toFORMMonth()', () {
      expect(DateTimeString(null).toFORMMonth(), '');
      expect(DateTimeString(dateTime).toFORMMonth(), '2012-02');
    });
    test('.toSeconds()', () {
      expect(DateTimeString(null).toSeconds(), '');
      expect(DateTimeString(dateTime).toSeconds(), '1330349220.0');
    });
  });
}
