import '../abstract/AbstractLocationWrapper.dart';

/// Fake implementation to make testing
/// easier by avoiding mocks
class FakeLocationWrapper extends AbstractLocationWrapper {
  final String _protocol;
  final String _hostname;
  final String _port;

  FakeLocationWrapper(this._protocol, this._hostname, this._port);

  @override
  String protocol() {
    return _protocol;
  }

  @override
  String hostname() {
    return _hostname;
  }

  @override
  String port() {
    return _port;
  }
}
