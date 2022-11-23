// root Home process combines all front end sibs reachable
import 'package:angular/angular.dart';	
import 'package:angular_router/angular_router.dart';
import 'dart:async';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/notification/notification_component.dart';
//routes
import 'package:app/src/app.dart' as main;
//Data
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
//GUI model outputs
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput.dart';
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch.dart';
import 'package:app/src/gui/PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw.dart';
import 'package:app/src/rest/gui/PrivateHome_NGHA8F4TEear0NzybbrMtwInput.dart';
import 'package:app/src/rest/gui/PrivateHome_NGHA8F4TEear0NzybbrMtwBranch.dart';
import 'package:app/src/gui/PrivateHomeaNGHA8F4TEear0NzybbrMtw.dart';
import 'package:app/src/rest/gui/Game_AzVAIWnXEe2xCJpb6ooUzAInput.dart';
import 'package:app/src/rest/gui/Game_AzVAIWnXEe2xCJpb6ooUzABranch.dart';
import 'package:app/src/gui/GameaAzVAIWnXEe2xCJpb6ooUzA.dart';
//NF model outputs

@Component(
  	selector: 'Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [
  		coreDirectives,login.Login,PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw,PrivateHomeaNGHA8F4TEear0NzybbrMtw,GameaAzVAIWnXEe2xCJpb6ooUzA
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process Home -->
		<publichome-tag
			*ngIf="isVisible(majorSIB,'_-xUtUGUQEea0lrrxwspd7g')"
			[guiId]="'_LmrS0Ej8EeaK4_MRcoLfnw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionloginevent) = "eventa_45_xgTgGUQEea0lrrxwspd7gLoginTrigger(\$event)"
		>
		</publichome-tag>
		<privatehome-tag
			*ngIf="isVisible(majorSIB,'_3huTEGUQEea0lrrxwspd7g')"
			[guiId]="'_NGHA8F4TEear0NzybbrMtw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actiongotogameevent) = "eventaH3uuoWnlEe2xCJpb6ooUzAGo_to_GameTrigger(\$event)"
		>
		</privatehome-tag>
		<game-tag
			*ngIf="isVisible(majorSIB,'__4Ia0WnkEe2xCJpb6ooUzA')"
			[guiId]="'_AzVAIWnXEe2xCJpb6ooUzA'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
		>
		</game-tag>
	</template>
	'''
)
class ProcessaLWgagF_45_SEeakMeYoloYxpgComponent extends GUIProcess implements OnInit, OnChanges, AfterViewChecked {
	
	@Input()
	String runtimeId;
	
	@Input()
	String parentRuntimeId;
	
	@Input()
	String majorSIB;
	
	@Input()
	String minorSIB;
	
	@Input()
	String guiId;
	
	@Input()
	String sibId;
	
	@Input()
	UserInteractionResponse majorInput;
	
	@Input()
	UserInteractionResponse minorInput;
	
	@Input()
	UserInteractionResponseDeserializer deserializer;
	
	@override
	UserInteractionResponseDeserializer getDeserializer() => deserializer;
	
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput majora_45_xUtUGUQEea0lrrxwspd7gInput;
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput minora_45_xUtUGUQEea0lrrxwspd7gInput;
	PrivateHome_NGHA8F4TEear0NzybbrMtwInput majora3huTEGUQEea0lrrxwspd7gInput;
	PrivateHome_NGHA8F4TEear0NzybbrMtwInput minora3huTEGUQEea0lrrxwspd7gInput;
	Game_AzVAIWnXEe2xCJpb6ooUzAInput majora_4Ia0WnkEe2xCJpb6ooUzAInput;
	Game_AzVAIWnXEe2xCJpb6ooUzAInput minora_4Ia0WnkEe2xCJpb6ooUzAInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process Home
	// GUISIB PublicHome
	@ViewChildren(PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw)
	List<PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw> componenta_45_xUtUGUQEea0lrrxwspd7g;
	// GUISIBs of Process Home
	// GUISIB PrivateHome
	@ViewChildren(PrivateHomeaNGHA8F4TEear0NzybbrMtw)
	List<PrivateHomeaNGHA8F4TEear0NzybbrMtw> componenta3huTEGUQEea0lrrxwspd7g;
	// GUISIBs of Process Home
	// GUISIB Game
	@ViewChildren(GameaAzVAIWnXEe2xCJpb6ooUzA)
	List<GameaAzVAIWnXEe2xCJpb6ooUzA> componenta_4Ia0WnkEe2xCJpb6ooUzA;
	
	ProcessaLWgagF_45_SEeakMeYoloYxpgComponent(this._processService,this._router,this._notificationService,AbstractRoutes routes): super(routes);

	@override
	ngOnInit() {
		reActivateProcess();
		started = true;
	}
	
	@override
	ngAfterViewChecked() {
	}
	
	void retry() {
		retryAfterLogin(_processService,"Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg",sibId:sibId);
	}
	
	@override
	void ngOnChanges(Map<String, SimpleChange> changes) {
		reActivateProcess();
	}
	
	@override
	Map<String,ActiveProcess> getActiveProcesses() => _processService.activeProcesses;
	
	@override
	String getParentRuntimeId() => parentRuntimeId;
	
	@override
	String getRuntimeId() => runtimeId;
	
	@override
    String getGUIId() => guiId;
    
    @override
    Router getRouter() => _router;
    
    @override
    NotificationService getNotificationService() => _notificationService;
	
	/// starts a front end routine or a GUI by event
	void reActivateProcess() {
		
		if(isVisible(majorSIB,'_-xUtUGUQEea0lrrxwspd7g')) {
			majora_45_xUtUGUQEea0lrrxwspd7gInput = majorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput;
			if(componenta_45_xUtUGUQEea0lrrxwspd7g != null) {
				componenta_45_xUtUGUQEea0lrrxwspd7g.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_-xUtUGUQEea0lrrxwspd7g')) {
			PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput newInput = minorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput;
			bool hasChanged = minora_45_xUtUGUQEea0lrrxwspd7gInput!=null?minora_45_xUtUGUQEea0lrrxwspd7gInput.inpusChanged(newInput):true;
			minora_45_xUtUGUQEea0lrrxwspd7gInput = newInput;
			if(componenta_45_xUtUGUQEea0lrrxwspd7g != null) {
				componenta_45_xUtUGUQEea0lrrxwspd7g.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componenta_45_xUtUGUQEea0lrrxwspd7g.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_3huTEGUQEea0lrrxwspd7g')) {
			majora3huTEGUQEea0lrrxwspd7gInput = majorInput as PrivateHome_NGHA8F4TEear0NzybbrMtwInput;
			if(componenta3huTEGUQEea0lrrxwspd7g != null) {
				componenta3huTEGUQEea0lrrxwspd7g.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_3huTEGUQEea0lrrxwspd7g')) {
			PrivateHome_NGHA8F4TEear0NzybbrMtwInput newInput = minorInput as PrivateHome_NGHA8F4TEear0NzybbrMtwInput;
			bool hasChanged = minora3huTEGUQEea0lrrxwspd7gInput!=null?minora3huTEGUQEea0lrrxwspd7gInput.inpusChanged(newInput):true;
			minora3huTEGUQEea0lrrxwspd7gInput = newInput;
			if(componenta3huTEGUQEea0lrrxwspd7g != null) {
				componenta3huTEGUQEea0lrrxwspd7g.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componenta3huTEGUQEea0lrrxwspd7g.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'__4Ia0WnkEe2xCJpb6ooUzA')) {
			majora_4Ia0WnkEe2xCJpb6ooUzAInput = majorInput as Game_AzVAIWnXEe2xCJpb6ooUzAInput;
			if(componenta_4Ia0WnkEe2xCJpb6ooUzA != null) {
				componenta_4Ia0WnkEe2xCJpb6ooUzA.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'__4Ia0WnkEe2xCJpb6ooUzA')) {
			Game_AzVAIWnXEe2xCJpb6ooUzAInput newInput = minorInput as Game_AzVAIWnXEe2xCJpb6ooUzAInput;
			bool hasChanged = minora_4Ia0WnkEe2xCJpb6ooUzAInput!=null?minora_4Ia0WnkEe2xCJpb6ooUzAInput.inpusChanged(newInput):true;
			minora_4Ia0WnkEe2xCJpb6ooUzAInput = newInput;
			if(componenta_4Ia0WnkEe2xCJpb6ooUzA != null) {
				componenta_4Ia0WnkEe2xCJpb6ooUzA.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componenta_4Ia0WnkEe2xCJpb6ooUzA.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB PublicHome of Process Home
	// Branch Login
	void eventa_45_xgTgGUQEea0lrrxwspd7gLoginTrigger(Map<String,dynamic> map)
	{
		var result = new PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch.forLoginBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_LmrS0Ej8EeaK4_MRcoLfnw',
			'Login/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB PrivateHome of Process Home
	// Branch Go to Game
	void eventaH3uuoWnlEe2xCJpb6ooUzAGo_to_GameTrigger(Map<String,dynamic> map)
	{
		var result = new PrivateHome_NGHA8F4TEear0NzybbrMtwBranch.forGo_to_GameBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_NGHA8F4TEear0NzybbrMtw',
			'Go_to_Game/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB Game of Process Home
}
