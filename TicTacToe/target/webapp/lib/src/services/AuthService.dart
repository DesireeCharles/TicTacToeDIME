import 'dart:html';
import 'dart:convert';
import 'dart:async';

import 'package:app/src/core/dime_process_service.dart';

class AuthService {

  String get jwt => window.localStorage['jwt'];

  Future<bool> auth(String username, String password) async {
    try {
      return success(await request(username, password));
    } on ProgressEvent catch (e) {
      print('ProgressEvent: ${e}');
      return failure(e);
    }
  }

  Future<HttpRequest> request(String username, String password) {
    final url = '${DIMEProcessService.getBaseUrl()}/rest/auth/authenticate';
	final headers = {
		'Content-Type':'application/json'
	};
	final data = jsonEncode({
		'username': username,
		'password': password
	});
    return HttpRequest.request(url, method: 'POST', requestHeaders: headers, sendData: data, withCredentials: false);
  }

  bool success(HttpRequest request) {
    final jwt = request.responseText;
    window.localStorage['jwt'] = jwt;
    return true;
  }

  bool failure(ProgressEvent e) {
    // 401 response is delivered as error
    var ct = e.currentTarget;
    if (ct is HttpRequest) {
      print('Request.status: ${ct.status}');
      if (ct.status == 401) {
        // Future completes with 'false'
        return false;
      }
    }
    // in any other case forward the exception
    throw (e);
  }

  Map<String, String> getAuthorizationHeaders() {
    var token = jwt;
    if (token == null) return {};
    return {'authorization': 'Bearer ${token}'};
  }
	
  void logout() {
    window.localStorage.remove('jwt');
  }
}
