import 'dart:html';
import 'dart:async';

import 'package:app/src/core/dime_process_service.dart';

class Authentication {
  static Future<bool> performLogin(String username, String password) async {
    try {
      return success(await request(username, password));
    } on ProgressEvent catch (e) {
      return failure(e);
    }
  }

  static Future<HttpRequest> request(String username, String password) {
    return HttpRequest.postFormData(
        '${DIMEProcessService.getBaseUrl()}/login.jsp',
        {'username': username, 'password': password},
        withCredentials: true);
  }

  static bool success(HttpRequest request) {
    print('Request.status: ${request.status}');
    // Future completes with evaluated boolean value
    return request.readyState == HttpRequest.DONE && request.status == 200;
  }

  static bool failure(ProgressEvent e) {
    print('Request.error: ${e}');
    // 403 response is delivered as error
    final ct = e.currentTarget;
    if (ct is HttpRequest) {
      print('Request.status: ${ct.status}');
      if (ct.status == 403) {
        // Future completes with 'false'
        return false;
      }
    }
    // in any other case forward the exception
    throw (e);
  }
}
