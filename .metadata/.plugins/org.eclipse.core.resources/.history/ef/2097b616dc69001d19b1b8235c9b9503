import 'dart:async';
import 'dart:html';

class TableDndItem {
  final Element tableEl;
  final dynamic item;

  TableDndItem(this.tableEl, this.item);
}

class TableDndService {
  TableDndItem _item;
  StreamController _dropSc;

  Stream<dynamic> setItem(TableDndItem item) {
    _item = item;
    _dropSc = StreamController();
    return _dropSc.stream;
  }

  TableDndItem getItem() {
    return _item;
  }

  void drop() {
    _dropSc.add(_item);
    clear();
  }

  void clear() {
    _dropSc.close();
    _dropSc = null;
    _item = null;
  }
}
