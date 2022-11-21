// routing wrapper for the Home process
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
import 'package:app/src/data/Data.dart' as Data;
//Process
import 'package:app/src/process/ProcessaLWgagF_45_SEeakMeYoloYxpgComponent.dart';
//Deserializer
import 'package:app/src/models/UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer.dart';

@Component(
  	selector: 'root-Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [coreDirectives,ProcessaLWgagF_45_SEeakMeYoloYxpgComponent,login.Login],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<Home-aLWgagF_45_SEeakMeYoloYxpg-process
		*ngIf="!showLogin&&runtime!=null"
		[runtimeId]="runtimeId"
		[parentRuntimeId]="parentRuntimeId"
		[majorSIB]="runtime.majorSIB"
		[minorSIB]="runtime.minorSIB"
		[majorInput]="runtime.majorInput"
		[minorInput]="runtime.minorInput"
		[deserializer]="deserializer"
	>
	</Home-aLWgagF_45_SEeakMeYoloYxpg-process>
	'''
)
class RootProcessaLWgagF_45_SEeakMeYoloYxpgComponent extends RootProcess implements OnInit {
	
	
	@Input()
	String startPointId;
	
	@Input()
	String parentRuntimeId;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer deserializer = new UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer();
	
	final NotificationService _notificationService;
	
	@override
	UserInteractionResponseDeserializer getDeserializer() => deserializer;
	
	RootProcessaLWgagF_45_SEeakMeYoloYxpgComponent(this._processService,this._router,this._notificationService, AbstractRoutes routes): super(routes);
	
	void retry() {
		retryAfterLogin(_processService,"Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg");
	}
	
	@override
	ngOnInit() {
		
		if(startPointId==null||startPointId=='aLYO40F_45_SEeakMeYoloYxpg') {
			Map<Object,dynamic> cache = new Map();
			_processService.startProcess(
				'Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg/public',
				deserializer,
				{
				},
				parentRuntimeId:parentRuntimeId
			)
			.then((sr)=>processResponse(_processService,sr))
			.catchError((e)=>processError(e));
		
		}
		 else {
			print("Cannot start process Home with start point id ${startPointId}");
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
	  	selector: 'root-Home-aLWgagF_45_SEeakMeYoloYxpg-process',
	  	directives: const [coreDirectives,ProcessaLWgagF_45_SEeakMeYoloYxpgComponent,login.Login],
		template: '''
		<login-form 
			*ngIf="showLogin"
			(signedin)="retry()"
			[modal]="false"
		></login-form>
		<Home-aLWgagF_45_SEeakMeYoloYxpg-process
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
		</Home-aLWgagF_45_SEeakMeYoloYxpg-process>
		'''
	)
	class RootProcessaLWgagF_45_SEeakMeYoloYxpgComponentSIB extends RootProcess implements AfterChanges {
		
		
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
		
		final UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer deserializer = new UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer();
		
		@override
		UserInteractionResponseDeserializer getDeserializer() => deserializer;
		
		RootProcessaLWgagF_45_SEeakMeYoloYxpgComponentSIB(this._processService,this._router,this._notificationService, AbstractRoutes routes): super(routes);
		
		void retry() {
			retryAfterLogin(_processService,"Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg",sibId:sibId);
		}
		
		@override
		ngAfterChanges() {
			restart();
		}
		
		
		void restart() {
			if(startPointId==null||startPointId=='aLYO40F_45_SEeakMeYoloYxpg') {
				Map<Object,dynamic> cache = new Map();
				_processService.startProcess(
					"Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg/${sibId}/public",
					deserializer,
					{
					},
					parentRuntimeId:parentRuntimeId,
					guiId:guiId
				)
				.then((sr)=>processResponse(_processService,sr))
				.catchError((e)=>processError(e));
			
			} else {
				print("Cannot start process Home with start point id ${startPointId}");
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

