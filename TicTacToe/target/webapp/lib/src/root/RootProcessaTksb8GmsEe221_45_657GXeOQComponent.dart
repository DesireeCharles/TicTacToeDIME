// routing wrapper for the home process
import 'package:angular/angular.dart';	
import 'package:angular_router/angular_router.dart';
import 'dart:html';
import 'dart:convert';
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/notification/notification_component.dart';

//Data
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/app.dart' as app;
//Process
import 'package:app/src/process/ProcessaTksb8GmsEe221_45_657GXeOQComponent.dart';
//Deserializer
import 'package:app/src/models/UserInteractionHome_Tksb8GmsEe221_45_657GXeOQResponseDeserializer.dart';

@Component(
  	selector: 'root-home-aTksb8GmsEe221_45_657GXeOQ-process',
  	directives: const [coreDirectives,ProcessaTksb8GmsEe221_45_657GXeOQComponent,login.Login],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<home-aTksb8GmsEe221_45_657GXeOQ-process
		*ngIf="!showLogin&&runtime!=null"
		[runtimeId]="runtimeId"
		[parentRuntimeId]="parentRuntimeId"
		[majorSIB]="runtime.majorSIB"
		[minorSIB]="runtime.minorSIB"
		[majorInput]="runtime.majorInput"
		[minorInput]="runtime.minorInput"
		[deserializer]="deserializer"
	>
	</home-aTksb8GmsEe221_45_657GXeOQ-process>
	'''
)
class RootProcessaTksb8GmsEe221_45_657GXeOQComponent extends RootProcess implements OnInit {
	
	
	@Input()
	String startPointId;
	
	@Input()
	String parentRuntimeId;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final UserInteractionHome_Tksb8GmsEe221_45_657GXeOQResponseDeserializer deserializer = new UserInteractionHome_Tksb8GmsEe221_45_657GXeOQResponseDeserializer();
	
	final NotificationService _notificationService;
	
	@override
	UserInteractionResponseDeserializer getDeserializer() => deserializer;
	
	RootProcessaTksb8GmsEe221_45_657GXeOQComponent(this._processService,this._router,this._notificationService, AbstractRoutes routes): super(routes);
	
	void retry() {
		retryAfterLogin(_processService,"Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQ");
	}
	
	@override
	ngOnInit() {
		
		if(startPointId==null||startPointId=='aU0ZJQGmsEe221_45_657GXeOQ') {
			Map<Object,dynamic> cache = new Map();
			_processService.startProcess(
				'Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQ/public',
				deserializer,
				{
				},
				parentRuntimeId:parentRuntimeId
			)
			.then((sr)=>processResponse(_processService,sr))
			.catchError((e)=>processError(e));
		
		}
		 else {
			print("Cannot start process home with start point id ${startPointId}");
		}
	}
	
	@override
	Map<String,ActiveProcess> getActiveProcesses() => _processService.activeProcesses;
	
	@override
	String getParentRuntimeId() => parentRuntimeId;
	
	@override
	String getGUIId() => null;
	
	@override
	Router getRouter() => _router;
	
	@override
	NotificationService getNotificationService() => _notificationService;
}

@Component(
	  	selector: 'root-home-aTksb8GmsEe221_45_657GXeOQ-process',
	  	directives: const [coreDirectives,ProcessaTksb8GmsEe221_45_657GXeOQComponent,login.Login],
		template: '''
		<login-form 
			*ngIf="showLogin"
			(signedin)="retry()"
			[modal]="false"
		></login-form>
		<home-aTksb8GmsEe221_45_657GXeOQ-process
			*ngIf="!showLogin&&runtime!=null"
			[runtimeId]="runtimeId"
			[parentRuntimeId]="parentRuntimeId"
			[majorSIB]="runtime.majorSIB"
			[minorSIB]="runtime.minorSIB"
			[majorInput]="runtime.majorInput"
			[minorInput]="runtime.minorInput"
			[guiId]="guiId"
			[sibId]="sibId"
			[deserializer]="deserializer"
		>
		</home-aTksb8GmsEe221_45_657GXeOQ-process>
		'''
	)
	class RootProcessaTksb8GmsEe221_45_657GXeOQComponentSIB extends RootProcess implements AfterChanges {
		
		
		@Input()
		String startPointId;
		
		@Input()
		String sibId;
		
		@Input()
		String guiId;
		
		@Input()
		String parentRuntimeId;
		
		
		final DIMEProcessService _processService;
		
		final NotificationService _notificationService;
		
		final Router _router;
		
		final UserInteractionHome_Tksb8GmsEe221_45_657GXeOQResponseDeserializer deserializer = new UserInteractionHome_Tksb8GmsEe221_45_657GXeOQResponseDeserializer();
		
		@override
		UserInteractionResponseDeserializer getDeserializer() => deserializer;
		
		RootProcessaTksb8GmsEe221_45_657GXeOQComponentSIB(this._processService,this._router,this._notificationService, AbstractRoutes routes): super(routes);
		
		void retry() {
			retryAfterLogin(_processService,"Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQ",sibId:sibId);
		}
		
		@override
		ngAfterChanges() {
			restart();
		}
		
		
		void restart() {
			if(startPointId==null||startPointId=='aU0ZJQGmsEe221_45_657GXeOQ') {
				Map<Object,dynamic> cache = new Map();
				_processService.startProcess(
					"Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQ/${sibId}/public",
					deserializer,
					{
					},
					parentRuntimeId:parentRuntimeId,
					guiId:guiId
				)
				.then((sr)=>processResponse(_processService,sr))
				.catchError((e)=>processError(e));
			
			} else {
				print("Cannot start process home with start point id ${startPointId}");
			}
		}
		
		@override
		Map<String,ActiveProcess> getActiveProcesses() => _processService.activeProcesses;
		
		@override
		String getParentRuntimeId() => parentRuntimeId;
		
		@override
		String getGUIId() => guiId;
		
		@override
		Router getRouter() => _router;
		
		@override
		NotificationService getNotificationService() => _notificationService;
	}

