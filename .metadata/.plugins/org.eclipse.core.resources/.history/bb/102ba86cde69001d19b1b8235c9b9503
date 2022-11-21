import 'dart:core';

import 'package:app/src/util/int/IntBuilder.dart';

class Progress<T> implements IntBuilder {
  final List<T> _all;
  final List<T> _backlog;

  /// Calculates the progress,
  /// based on the list of all items [_all] that should be/already have been
  /// processed (e.g. uploaded) and the list of items [_backlog] that not
  /// have been processed yet
  Progress(this._all, this._backlog);

  @override
  int toInt() {
    return (_uploaded() * _ratio()).round();
  }

  int _uploaded() => _all.length - _backlog.length;

  double _ratio() {
    if (_all.isNotEmpty) {
      return 100 / _all.length;
    }
    return 0.0;
  }
}
