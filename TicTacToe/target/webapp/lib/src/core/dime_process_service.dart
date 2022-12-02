import 'dart:async';
import 'dart:convert';
import 'dart:html';

import 'package:angular_router/angular_router.dart';
import 'package:app/src/notification/notification_component.dart';
import 'package:app/src/services/AuthService.dart';

import '../url/ApiPort.dart';
import '../url/BaseUrl.dart';
import '../url/LocationWrapper.dart';
import 'AbstractRoutes.dart';

class DIMEProcessService {
  static String getBaseUrl() {
    final locationWrapper = LocationWrapper(window.location);
    return BaseUrl(locationWrapper, ApiPort(locationWrapper)).url();
  }

  static const DIMERequestHeaders = {
    'content-type': 'application/json'
  };
  
  final Map<String,ActiveProcess> activeProcesses = {};

  String processRuntimeId(String processId) =>
      '${processId}-${activeProcesses.length}';
      
  final AuthService authService;
  
  DIMEProcessService(this.authService);
      
  Map<String, String> getDIMERequestHeaders() {
  	final headers = {
  		'Content-Type': 'application/json'
  	};
  	headers.addAll(authService.getAuthorizationHeaders());
  	return headers;
  }

  TerminateProcessResponse checkTerminated(
      String parentRuntimeId, Map<String, dynamic> jsog, String guiId) {
    if (jsog.containsKey('outputs')) {
      return TerminateProcessResponse(
          parentRuntimeId,
          jsog['outputs'],
          jsog['branchName'],
          jsog['branchId'],
          parentRuntimeId == null ? null : guiId);
    }
    return null;
  }
   
  // expose status as stream so that other services can react to the app being busy
  final StreamController<bool> _anyProcessActiveSC = StreamController.broadcast();
  Stream<bool> get anyProcessActive$ => _anyProcessActiveSC.stream; 
  
  bool get isAnyProcessActive => activeProcesses.values.any((p) => p.runtime.busy);
  
  void updateAnyProcessActive() {
  	_anyProcessActiveSC.add(isAnyProcessActive);
  }
  
  // expose if the login form is currently displayed
  bool showLoginForm = false;
  
  final StreamController<bool> _showLoginFormSC = StreamController.broadcast();
  Stream<bool> get showLoginForm$ => _showLoginFormSC.stream; 
    
  void updateShowLoginForm(bool show) {
  	showLoginForm = show;
  	_showLoginFormSC.add(showLoginForm);
  }
  	
  ///
  /// Starts a process. This method is only called by root processes
  /// processId : CINCO ID of the process model to start
  /// parentRuntime: runtime information of the parent process runtime which starts the new process
  /// inputs: the input port map. Complex entities are identified by their ID, primitive by their value
  ///
  Future<ProcessResponse> startProcess(
      String processId,
      UserInteractionResponseDeserializer deserializer,
      Map<String, dynamic> inputs,
      {String parentRuntimeId,
      String guiId}) async {
    print('Start Process ${processId}');
    updateShowLoginForm(false);
    if (parentRuntimeId != null) {
      inputs['dywaData'] = activeProcesses[parentRuntimeId].runtime.dywaData;
    }
    final url = '${getBaseUrl()}/rest/start/${processId}';
    final sendData = jsonEncode(inputs);
    return HttpRequest.request(url,
            method: 'POST',
            requestHeaders: getDIMERequestHeaders(),
            sendData: sendData,
            withCredentials: true)
        .then((response) {
      checkError(response, deserializer, url, sendData, null);
      final jsog = jsonDecode(response.responseText);
      final terminated = checkTerminated(parentRuntimeId, jsog, guiId);
      if (terminated != null) {
        return terminated;
      }

      final runtime = DIMEProcessRuntime.fromJSOG(jsog, deserializer);
      //process is running it should display the first GUI
      final id = processRuntimeId(processId);
      activeProcesses[id] =
          ActiveProcess(runtime, deserializer, parentRuntimeId, guiId);
      return StartProcessResponse(
          id, activeProcesses[id].streamController, runtime);
    }).catchError((e) => processError(e, deserializer, url, sendData, null));
  }

  void checkError(
      HttpRequest response,
      UserInteractionResponseDeserializer deserializer,
      String url,
      String sendData,
      runtimeId) {
    if (response.status == 401) {
      final jsog = jsonDecode(response.responseText);
      updateShowLoginForm(true);
      final runtime = DIMEProcessRuntime.fromJSOG(jsog, deserializer);
      throw LoginException(runtime, url, sendData, runtimeId);
    }
    if (response.status == 500) {
      throw ServerException(response.responseText);
    }
    if (response.status == 502) {
      throw MaintenanceException();
    }
    if (response.status == 422) {
      throw ForkJoinException();
    }
  }

  void processError(e, UserInteractionResponseDeserializer deserializer,
      String url, String sendData, String runtimeId) {
    if (e is ProgressEvent) {
      if (e.currentTarget is HttpRequest) {
        checkError(e.currentTarget, deserializer, url, sendData, runtimeId);
        return;
      }
    }
    throw e;
  }

  ///
  /// Continues a process. This method is only called by root processes
  /// processId : CINCO ID of the process model to start
  /// runtime: runtime information of the process runtime which will be continued
  /// outputs: the output port map including the taken branch
  ///
  Future<ProcessResponse> continueProcess(
      UserInteractionResponseDeserializer deserializer,
      DIMEProcessRuntime currentRuntime,
      String runtimeId,
      String guiId,
      String branchName,
      Map<String, dynamic> outputs,
      {String parentRuntimeId}) async {
    print('Continue runtimeId is ${runtimeId}');
    print(
        'Continue: ${currentRuntime.hashCode} / ${currentRuntime.majorSIB} / ${currentRuntime.minorSIB}');
    updateShowLoginForm(false);
    currentRuntime.busy = true;
    updateAnyProcessActive();
    final data = {'dywaData': currentRuntime.dywaData};
    data.addAll(outputs);
    final branchNameEscaped = branchName.replaceAll(RegExp(r' '), '_');
    final url = '${getBaseUrl()}/rest/continue/${guiId}/${branchNameEscaped}';
    final sendData = jsonEncode(data);
    return HttpRequest.request(url,
            method: 'POST',
            requestHeaders: getDIMERequestHeaders(),
            sendData: sendData,
            withCredentials: true)
        .then((response) {
      checkError(response, deserializer, url, sendData, runtimeId);
      final jsog = jsonDecode(response.responseText);
      currentRuntime.busy = false;
      updateAnyProcessActive();
      final terminated = checkTerminated(
          parentRuntimeId, jsog, activeProcesses[runtimeId].guiId);
      if (terminated != null) {
        return terminated;
      }
      final runtime = DIMEProcessRuntime.fromJSOG(jsog, deserializer);
      return ContinueProcessResponse(runtimeId, runtime);
    }).catchError(
            (e) => processError(e, deserializer, url, sendData, runtimeId));
  }

  ///
  /// Continues a process, stopped at a guard container for login. This method is only called by all processes
  /// currentRuntime : runtime information of the process runtime which will be continued
  /// guardContainerId: the id of the GuardContainer model element
  ///
  Future<ProcessResponse> continueProcessAfterLogin(
      UserInteractionResponseDeserializer deserializer,
      DIMEProcessRuntime currentRuntime,
      String url,
      String sendData,
      String runtimeId,
      String processId,
      String guardContainerId,
      {String parentRuntimeId,
      String sibId,
      String guiId}) async {
    updateShowLoginForm(false);
    currentRuntime.busy = true;
    updateAnyProcessActive();
    return HttpRequest.request(url,
            method: 'POST',
            requestHeaders: getDIMERequestHeaders(),
            sendData: sendData,
            withCredentials: true)
        .then((response) {
      checkError(response, deserializer, url, sendData, runtimeId);
      final jsog = jsonDecode(response.responseText);
      currentRuntime.busy = false;
      updateAnyProcessActive();
      final terminated = checkTerminated(parentRuntimeId, jsog,
          runtimeId == null ? null : activeProcesses[runtimeId].guiId);
      if (terminated != null) {
        return terminated;
      }
      final runtime = DIMEProcessRuntime.fromJSOG(jsog, deserializer);
      if (runtimeId == null) {
        //process is not started
        final id = processRuntimeId(processId);
        activeProcesses[id] =
            ActiveProcess(runtime, deserializer, parentRuntimeId, guiId);
        return StartProcessResponse(
            id, activeProcesses[id].streamController, runtime);
      }
      return ContinueProcessResponse(runtimeId, runtime);
    }).catchError(
            (e) => processError(e, deserializer, url, sendData, runtimeId));
  }
}

class DIMEProcessRuntime {
  dynamic dywaData;

  String majorSIB;
  String minorSIB;

  UserInteractionResponse majorInput;
  UserInteractionResponse minorInput;

  bool busy = false;

  DIMEProcessRuntime.fromJSOG(Map<String, dynamic> map,
      UserInteractionResponseDeserializer deserializer) {
    final cache = <String, dynamic>{};
    dywaData = map['dywaData'];
    majorSIB = map['major_sib']['id'];
    try {
      majorInput = deserializer.deserialize(majorSIB, map['major_sib'], cache);

      if (map.containsKey('minor_sib') && map['minor_sib'] != null) {
        minorSIB = map['minor_sib']['id'];
        minorInput =
            deserializer.deserialize(minorSIB, map['minor_sib'], cache);
      }
    } catch (e) {
      print(e);
    }
  }

  void update(DIMEProcessRuntime runtime) {
    dywaData = runtime.dywaData;

    majorSIB = null;
    majorInput = runtime.majorInput;
    majorSIB = runtime.majorSIB;

    minorSIB = null;
    minorInput = runtime.minorInput;
    minorSIB = runtime.minorSIB;

    busy = false;
  }
}

abstract class ContinueProcessRequest {
  Map<String, dynamic> toJSOG();
}

abstract class UserInteractionResponse {
  bool startedByEvent();
}

class GuardContainerInput extends UserInteractionResponse {
  GuardContainerInput(Map<String, dynamic> map);

  @override
  bool startedByEvent() => false;
}

abstract class RootProcessInput {
  Map<String, dynamic> toJSOG();
}

abstract class DIMEProcess {
  Map<String, ActiveProcess> getActiveProcesses();

  bool showLogin = false;
  bool loginInvalid = false;

  /// login/authentication continue process runtime
  DIMEProcessRuntime _afterLoginRuntime;
  String _afterLoginUrl;
  String _afterLoginSendData;
  String _afterLoginRuntimeId;

  final AbstractRoutes routes;

  DIMEProcess(this.routes);

  String getParentRuntimeId();

  String getRuntimeId();

  String getGUIId();

  Router getRouter();

  NotificationService getNotificationService();

  UserInteractionResponseDeserializer getDeserializer();

  void processResponse(DIMEProcessService service, ProcessResponse cpr) {
    print('process return');
    resetLogin();

    if (cpr == null) {
      getRouter().navigate(routes.getByName('Maintenance').toUrl());
      return;
    }

    if (!getActiveProcesses().containsKey(cpr.processRuntimeId)) {
      throw Exception(
          'Try to continue inactive parent process ${cpr.processRuntimeId}');
    }

    if (cpr is ContinueProcessResponse) {
      print('Continue response');
      getActiveProcesses()[cpr.processRuntimeId].streamController.add(cpr);
      return;
    }

    if (cpr is TerminateProcessResponse) {
      print('Terminate response');
      print('continue with GUI ${getGUIId()}');
      final activeProcess = getActiveProcesses()[cpr.processRuntimeId];
      service
          .continueProcess(
              activeProcess.deserializer,
              activeProcess.runtime,
              cpr.processRuntimeId,
              cpr.parentGUIId ?? getGUIId(),
              '${cpr.branchId}/${cpr.branchName}/endsib/public',
              {'outputs': cpr.outputs},
              parentRuntimeId: activeProcess.parentRuntimeId)
          .then((response) => processResponse(service, response))
          .catchError((e) => processError(e));
      return;
    }
  }

  void retryAfterLogin(DIMEProcessService service, String processId,
      {String sibId}) {
    final activeProcess = getActiveProcesses()[_afterLoginRuntimeId];
    print('retry after login: ${processId}');
    if (activeProcess == null) {
      service
          .continueProcessAfterLogin(
              getDeserializer(),
              _afterLoginRuntime,
              _afterLoginUrl,
              _afterLoginSendData,
              getRuntimeId(),
              processId,
              _afterLoginRuntime.majorSIB,
              parentRuntimeId: getParentRuntimeId(),
              sibId: sibId,
              guiId: getGUIId())
          .then((cpr) => processResponse(service, cpr))
          .catchError((e) => processError(e));
    } else {
      service
          .continueProcessAfterLogin(
              activeProcess.deserializer,
              activeProcess.runtime,
              _afterLoginUrl,
              _afterLoginSendData,
              _afterLoginRuntimeId,
              processId,
              activeProcess.runtime.majorSIB,
              parentRuntimeId: activeProcess.parentRuntimeId,
              sibId: sibId,
              guiId: getGUIId())
          .then((cpr) => processResponse(service, cpr))
          .catchError((e) => processError(e));
    }
  }

  void resetLogin() {
    showLogin = false;
    loginInvalid = false;
    _afterLoginRuntime = null;
    _afterLoginUrl = null;
    _afterLoginSendData = null;
    _afterLoginRuntimeId = null;
  }

  void processError(e) {
    print('process error');
    resetLogin();

    if (e is LoginException) {
      print('login error');
      _afterLoginRuntime = e.runtime;
      _afterLoginUrl = e.url;
      _afterLoginSendData = e.sendData;
      _afterLoginRuntimeId = e.runtimeId;

      showLogin = true;
    } else if (e is MaintenanceException) {
      getRouter().navigate(routes.getByName('Maintenance').toUrl());
    } else if (e is ForkJoinException) {
      print('Deactivated GUI tries to continue process');
    } else if (e is ServerException) {
      getNotificationService().showError(e.text);
    } else {
      print('other error');
      window.console.log(e);
    }
  }
}

abstract class RootProcess extends DIMEProcess {
  DIMEProcessRuntime runtime;

  String runtimeId;

  RootProcess(AbstractRoutes routes) : super(routes);

  @override
  void processResponse(DIMEProcessService service, ProcessResponse cpr) {
    resetLogin();

    if (cpr is StartProcessResponse) {
      print('Start response');
      runtimeId = cpr.processRuntimeId;
      runtime = cpr.response;
      getActiveProcesses()[cpr.processRuntimeId].streamController.stream.listen((r) {
      	getActiveProcesses()[r.processRuntimeId].runtime.update(r.response);
      	service.updateAnyProcessActive();
  	  });

      return;
    }
    super.processResponse(service, cpr);
  }

  @override
  String getRuntimeId() => runtimeId;
}

abstract class GUIProcess extends DIMEProcess {
  String currentBranch;
  bool started = false;

  GUIProcess(AbstractRoutes routes) : super(routes);

  bool isVisible(String current, String sibID) => sibID == current;

  DateTime getStaticDate(int ts) => DateTime.fromMillisecondsSinceEpoch(ts);
}

abstract class GUIEvent {}

abstract class UserInteractionResponseDeserializer {
  UserInteractionResponse deserialize(
      String id, Map<String, dynamic> map, Map<String, dynamic> cache);
}

class ContinueProcessResponse extends ProcessResponse {
  final DIMEProcessRuntime response;

  ContinueProcessResponse(String processRuntimeId, this.response)
      : super(processRuntimeId);
}

abstract class ProcessResponse {
  final String processRuntimeId;

  ProcessResponse(this.processRuntimeId);
}

class StartProcessResponse extends ContinueProcessResponse {
  final StreamController<ContinueProcessResponse> processContinueStream;

  StartProcessResponse(
      String processRuntimeId, this.processContinueStream, response)
      : super(processRuntimeId, response);
}

class TerminateProcessResponse extends ProcessResponse {
  final String branchName;
  final String branchId;
  final dynamic outputs;
  final String parentGUIId;

  TerminateProcessResponse(String processRuntimeId, this.outputs,
      this.branchName, this.branchId, this.parentGUIId)
      : super(processRuntimeId);
}

class ActiveProcess {
  final String parentRuntimeId;
  final String guiId;
  final DIMEProcessRuntime runtime;
  final UserInteractionResponseDeserializer deserializer;
  final StreamController<ContinueProcessResponse> streamController =
      StreamController();

  ActiveProcess(
      this.runtime, this.deserializer, this.parentRuntimeId, this.guiId);
}

class LoginException implements Exception {
  final DIMEProcessRuntime runtime;
  final String url;
  final String sendData;
  final String runtimeId;

  LoginException(this.runtime, this.url, this.sendData, this.runtimeId);
}

class ServerException implements Exception {
  String text;

  ServerException(this.text);
}

class MaintenanceException implements Exception {}

class ForkJoinException implements Exception {}
