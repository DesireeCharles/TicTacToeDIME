import 'dart:html';

import 'abstract/AbstractLocationWrapper.dart';

class LocationWrapper extends AbstractLocationWrapper {
  final Location location;

  LocationWrapper(this.location);

  @override
  String protocol() {
    return location.protocol;
  }

  @override
  String hostname() {
    return location.hostname;
  }

  @override
  String port() {
    return location.port;
  }
}
