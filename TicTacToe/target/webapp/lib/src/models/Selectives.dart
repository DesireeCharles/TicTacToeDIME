import 'dart:collection';
import 'dart:convert';

import 'package:angular/angular.dart';
import 'package:app/src/util/string/DateTimeString.dart';

import 'FileReference.dart';

class DateConverter {
  static DateTime fromJSON(String s) => DateTime.parse(s).toLocal();

  static DateTime now() => DateTime.now();

  static DateTime fromSecondsSinceEpoch(int m) =>
      DateTime.fromMillisecondsSinceEpoch(m * 1000);

  static DateTime fromForm(String s) {
    try {
      return DateTime.parse(s);
    } catch (e) {
      // month
      final monthExp = RegExp('[0-9]{4}-[0-9]{2}');
      if (monthExp.hasMatch(s)) {
        final parts = s.split('-');
        final year = int.parse(parts[0]);
        final month = int.parse(parts[1]);
        return DateTime(year, month);
      }
      //time
      final timeExp = RegExp('[0-9]{2}:[0-9]{2}');
      if (timeExp.hasMatch(s)) {
        final parts = s.split(':');
        final hour = int.parse(parts[0]);
        final minute = int.parse(parts[1]);
        final now = DateTime.now();
        return DateTime(now.year, now.month, now.day, hour, minute);
      }
    }
    throw Exception(
        'The String "${s}" could not be parsed to a DateTime object');
  }

  static String toJSON(DateTime dt) {
    return DateTimeString(dt).toJSON();
  }

  static String toFORM(DateTime dt) {
    return DateTimeString(dt).toFORM();
  }

  static String toFORMTime(DateTime dt) {
    return DateTimeString(dt).toFORMTime();
  }

  static String toFORMDate(DateTime dt) {
    return DateTimeString(dt).toFORMDate();
  }

  static String toFORMMonth(DateTime dt) {
    return DateTimeString(dt).toFORMMonth();
  }

  static String toFORMList(List<DateTime> dts) =>
      dts.map((n) => toFORM(n)).join();

  static String toLength(String s, int length) {
    if (s.length < length) {
      final zeros = length - s.length;
      var result = '';
      for (var i = 0; i < zeros; i++) {
        result += '0';
      }
      result += s;
      return result;
    } else if (s.length > length) {
      return s.substring(s.length - length, s.length);
    }
    return s;
  }
}

abstract class BaseModel {
  int dywa_id;
  int dywa_version;
  String dywa_name;

  @override
  String toString() {
    return dywa_name;
  }

  @override
  bool operator ==(Object other) {
    if (other is BaseModel) {
      if (dywa_id == other.dywa_id && other.dywa_id <= 0) {
        return identical(this, other);
      }
      return dywa_id == other.dywa_id;
    }
    return false;
  }

  @override
  int get hashCode {
    if (dywa_id <= 0) {
      return super.hashCode;
    }
    return dywa_id;
  }

  String toJSON() {
    return jsonEncode(toJSOG(<String, dynamic>{}));
  }

  Map<String, dynamic> toJSOG(Map<Object, dynamic> objects);
}

class ParameterBaseModel extends BaseModel {
  String dywaRuntimeType;

  @override
  String toJSON() {
    return jsonEncode(toJSOG(<String, dynamic>{}));
  }

  @override
  Map<String, dynamic> toJSOG(Map<Object, dynamic> objects) {
    objects ??= {};
    int jsogId;
    var jsonObj = <String, dynamic>{};
    if (objects.containsKey(this)) {
      jsogId = objects[this]['id'];
      jsonObj = objects[this]['value'];
      return {'@ref': jsogId.toString()};
    } else {
      jsogId = objects.length;
      final pair = {'id': jsogId, 'value': jsonObj};
      objects[this] = pair;
    }
    jsonObj['@id'] = jsogId.toString();
    jsonObj['dywaRuntimeType'] = dywaRuntimeType;

    jsonObj['dywaId'] = dywa_id;
    jsonObj['dywaVersion'] = dywa_version;
    if (dywa_name != null) {
      jsonObj['dywaName'] = dywa_name;
    }
    return jsonObj;
  }
}

class DIMEList<T> extends ListMixin<T> {
  final List innerList = [];
  Function changed;

  @override
  int get length => innerList.length;

  int get size => innerList.length;

  @override
  set length(int length) {
    innerList.length = length;
    if (changed != null) {
      changed();
    }
  }

  @override
  void operator []=(int index, T value) {
    innerList[index] = value;
    if (changed != null) {
      changed();
    }
  }

  @override
  T operator [](int index) => innerList[index];

  // Though not strictly necessary, for performance reasons
  // you should implement add and addAll.

  @override
  void add(T value) {
    innerList.add(value);
    if (changed != null) {
      changed();
    }
  }

  @override
  void addAll(Iterable<T> all) {
    innerList.addAll(all);
    if (changed != null) {
      changed();
    }
  }

  void replaceAll(Iterable<T> all) {
    final newList = List.of(all);
    clear();
    addAll(newList);
  }

  DIMEList subDIMEList(int from, int to) {
    final l = DIMEList();
    l.addAll(innerList.sublist(from, to));
    return l;
  }

  DIMEList();

  DIMEList.monitored(Function changed) {
    this.changed = changed;
  }

  DIMEList.from(List<T> list) {
    addAll(list);
  }

  String toJoinedQueryString() => map((n) {
        if (n == null) {
          return 'null';
        }
        if (n is DateTime) {
          return Uri.encodeComponent(DateConverter.toJSON(n));
        }
        if (n is FileReference) {
          return Uri.encodeComponent(n.dywa_id.toString());
        }
        if (n is BaseModel) {
          return Uri.encodeComponent(n.dywa_id.toString());
        }
        return Uri.encodeComponent(n.toString());
      }).join(',');
}

@Pipe('seconds')
class SecondsPipe extends PipeTransform {
  String transform(dynamic value) {
    if (value == null) return null;
    if (!supports(value)) {
      return 'unsupported';
    }
    return DateTimeString(value as DateTime).toSeconds();
  }

  bool supports(dynamic obj) => obj is DateTime;
}
