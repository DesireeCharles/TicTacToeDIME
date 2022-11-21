import '../abstract/AbstractPort.dart';

/// Fake implementation to make testing
/// easier by avoiding mocks
class FakePort implements AbstractPort {
  final String staticPort;

  FakePort(this.staticPort);

  @override
  String port() {
    return staticPort;
  }
}
