import 'abstract/AbstractLocationWrapper.dart';
import 'abstract/AbstractPort.dart';
import 'abstract/AbstractUrl.dart';

class BaseUrl implements AbstractUrl {
  final AbstractLocationWrapper _locationWrapper;
  final AbstractPort _port;

  BaseUrl(this._locationWrapper, this._port);

  @override
  String url() {
    return '${_locationWrapper.protocol()}//${_locationWrapper.hostname()}:${_port.port()}';
  }
}
