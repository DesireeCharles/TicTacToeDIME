import 'abstract/AbstractLocationWrapper.dart';
import 'abstract/AbstractPort.dart';

class ApiPort implements AbstractPort {
  final AbstractLocationWrapper _locationWrapper;

  ApiPort(this._locationWrapper);

  /// Returns the port of the API which is
  /// derived from the GUI port and protocol
  @override
  String port() {
    // for an empty port (URLs with implicit ports)
    // the port will be decided based on the protocol
    if (isPortEmpty()) {
      return httpPort();
    }
    // for the native development environment
    // the GUI port is 9090 and the API port is 8080
    if (_isNativeDevelopmentEnvironment()) {
      return '8080';
    }
    // for all other environments (e.g. docker local)
    // gui and api port are the same
    return _locationWrapper.port();
  }

  bool isPortEmpty() {
    return _locationWrapper.port() == '';
  }

  /// Decide API port based on the protocol (HTTP or HTTPs)
  String httpPort() {
    if (istHttp()) {
      return '80';
    }
    if (isHttps()) {
      return '443';
    }
    throw Exception('No suitable API port can be found');
  }

  bool istHttp() {
    return _locationWrapper.protocol() == 'http:';
  }

  bool isHttps() {
    return _locationWrapper.protocol() == 'https:';
  }

  /// The native development environment of
  /// the GUI usually runs on port 9090
  bool _isNativeDevelopmentEnvironment() {
    return _locationWrapper.port() == '9090';
  }
}
