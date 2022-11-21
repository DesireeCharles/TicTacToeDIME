import 'IterableBuilder.dart';

class NotNullItems<T> implements IterableBuilder<T> {
  final Iterable<T> _items;

  NotNullItems(this._items) {
    ArgumentError.checkNotNull(_items, '_items');
  }

  @override
  Iterable<T> iterable() {
    return _items.where((item) => item != null).toList();
  }
}
