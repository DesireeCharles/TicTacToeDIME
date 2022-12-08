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
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput.dart';
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALBranch.dart';
import 'package:app/src/gui/PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL.dart';
import 'package:app/src/rest/gui/Game_AzVAIWnXEe2xCJpb6ooUzAInput.dart';
import 'package:app/src/rest/gui/Game_AzVAIWnXEe2xCJpb6ooUzABranch.dart';
import 'package:app/src/gui/GameaAzVAIWnXEe2xCJpb6ooUzA.dart';
//NF model outputs

@Component(
  	selector: 'Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [
  		coreDirectives,login.Login,PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL,GameaAzVAIWnXEe2xCJpb6ooUzA,PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL,GameaAzVAIWnXEe2xCJpb6ooUzA
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
			*ngIf="isVisible(majorSIB,'_JVFm8XbqEe2qntwH9Ijd8A')"
			[guiId]="'_LmrS0Ej8EeaK4_MRcoLfnw_INTERNAL'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionplayevent) = "eventaJVG1EXbqEe2qntwH9Ijd8APlayTrigger(\$event)"
		>
		</publichome-tag>
		<!-- Process gamelOGIC -->
		<publichome-tag
			*ngIf="isVisible(majorSIB,'_DQiDgXbqEe2qntwH9Ijd8A')"
			[guiId]="'_LmrS0Ej8EeaK4_MRcoLfnw_INTERNAL'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionplayevent) = "eventaDQr0gXbqEe2qntwH9Ijd8APlayTrigger(\$event)"
		>
		</publichome-tag>
		<game-tag
			*ngIf="isVisible(majorSIB,'_XiL-0XbqEe2qntwH9Ijd8A')"
			[table]="majoraXiL_45_0XbqEe2qntwH9Ijd8AInput.table"
			[guiId]="'_AzVAIWnXEe2xCJpb6ooUzA'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionemptyevent) = "eventaXiXlAXbqEe2qntwH9Ijd8AemptyTrigger(\$event)"
			(actionbackevent) = "eventaXikZUXbqEe2qntwH9Ijd8ABackTrigger(\$event)"
			(actionrestartevent) = "eventaXiruEXbqEe2qntwH9Ijd8ARestartTrigger(\$event)"
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
	
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput majoraJVFm8XbqEe2qntwH9Ijd8AInput;
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput minoraJVFm8XbqEe2qntwH9Ijd8AInput;
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput majoraDQiDgXbqEe2qntwH9Ijd8AInput;
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput minoraDQiDgXbqEe2qntwH9Ijd8AInput;
	Game_AzVAIWnXEe2xCJpb6ooUzAInput majoraXiL_45_0XbqEe2qntwH9Ijd8AInput;
	Game_AzVAIWnXEe2xCJpb6ooUzAInput minoraXiL_45_0XbqEe2qntwH9Ijd8AInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process Home
	// GUISIB PublicHome
	@ViewChildren(PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL)
	List<PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL> componentaJVFm8XbqEe2qntwH9Ijd8A;
	// GUISIBs of Process gamelOGIC
	// GUISIB PublicHome
	@ViewChildren(PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL)
	List<PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL> componentaDQiDgXbqEe2qntwH9Ijd8A;
	// GUISIBs of Process gamelOGIC
	// GUISIB Game
	@ViewChildren(GameaAzVAIWnXEe2xCJpb6ooUzA)
	List<GameaAzVAIWnXEe2xCJpb6ooUzA> componentaXiL_45_0XbqEe2qntwH9Ijd8A;
	
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
		
		if(isVisible(majorSIB,'_JVFm8XbqEe2qntwH9Ijd8A')) {
			majoraJVFm8XbqEe2qntwH9Ijd8AInput = majorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput;
			if(componentaJVFm8XbqEe2qntwH9Ijd8A != null) {
				componentaJVFm8XbqEe2qntwH9Ijd8A.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_JVFm8XbqEe2qntwH9Ijd8A')) {
			PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput newInput = minorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput;
			bool hasChanged = minoraJVFm8XbqEe2qntwH9Ijd8AInput!=null?minoraJVFm8XbqEe2qntwH9Ijd8AInput.inpusChanged(newInput):true;
			minoraJVFm8XbqEe2qntwH9Ijd8AInput = newInput;
			if(componentaJVFm8XbqEe2qntwH9Ijd8A != null) {
				componentaJVFm8XbqEe2qntwH9Ijd8A.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaJVFm8XbqEe2qntwH9Ijd8A.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_DQiDgXbqEe2qntwH9Ijd8A')) {
			majoraDQiDgXbqEe2qntwH9Ijd8AInput = majorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput;
			if(componentaDQiDgXbqEe2qntwH9Ijd8A != null) {
				componentaDQiDgXbqEe2qntwH9Ijd8A.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_DQiDgXbqEe2qntwH9Ijd8A')) {
			PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput newInput = minorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput;
			bool hasChanged = minoraDQiDgXbqEe2qntwH9Ijd8AInput!=null?minoraDQiDgXbqEe2qntwH9Ijd8AInput.inpusChanged(newInput):true;
			minoraDQiDgXbqEe2qntwH9Ijd8AInput = newInput;
			if(componentaDQiDgXbqEe2qntwH9Ijd8A != null) {
				componentaDQiDgXbqEe2qntwH9Ijd8A.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaDQiDgXbqEe2qntwH9Ijd8A.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_XiL-0XbqEe2qntwH9Ijd8A')) {
			majoraXiL_45_0XbqEe2qntwH9Ijd8AInput = majorInput as Game_AzVAIWnXEe2xCJpb6ooUzAInput;
			if(componentaXiL_45_0XbqEe2qntwH9Ijd8A != null) {
				componentaXiL_45_0XbqEe2qntwH9Ijd8A.forEach((n)=>n.updateInputs(
					ptable:majoraXiL_45_0XbqEe2qntwH9Ijd8AInput.table
				));
			}
		} else if(isVisible(minorSIB,'_XiL-0XbqEe2qntwH9Ijd8A')) {
			Game_AzVAIWnXEe2xCJpb6ooUzAInput newInput = minorInput as Game_AzVAIWnXEe2xCJpb6ooUzAInput;
			bool hasChanged = minoraXiL_45_0XbqEe2qntwH9Ijd8AInput!=null?minoraXiL_45_0XbqEe2qntwH9Ijd8AInput.inpusChanged(newInput):true;
			minoraXiL_45_0XbqEe2qntwH9Ijd8AInput = newInput;
			if(componentaXiL_45_0XbqEe2qntwH9Ijd8A != null) {
				componentaXiL_45_0XbqEe2qntwH9Ijd8A.forEach((n)=>n.updateInputs(
					ptable:minoraXiL_45_0XbqEe2qntwH9Ijd8AInput.table
				));
				if(hasChanged) {
					componentaXiL_45_0XbqEe2qntwH9Ijd8A.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB PublicHome of Process Home
	// Branch Play
	void eventaJVG1EXbqEe2qntwH9Ijd8APlayTrigger(Map<String,dynamic> map)
	{
		var result = new PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALBranch.forPlayBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_LmrS0Ej8EeaK4_MRcoLfnw_INTERNAL',
			'Play/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB PublicHome of Process gamelOGIC
	// Branch Play
	void eventaDQr0gXbqEe2qntwH9Ijd8APlayTrigger(Map<String,dynamic> map)
	{
		var result = new PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALBranch.forPlayBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_LmrS0Ej8EeaK4_MRcoLfnw_INTERNAL',
			'Play/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB Game of Process gamelOGIC
	// Branch empty
	void eventaXiXlAXbqEe2qntwH9Ijd8AemptyTrigger(Map<String,dynamic> map)
	{
		var result = new Game_AzVAIWnXEe2xCJpb6ooUzABranch.foremptyBranch(
			tableEntry:map['tableEntry'] as Data.TableEntry
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_AzVAIWnXEe2xCJpb6ooUzA',
			'empty/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventaXikZUXbqEe2qntwH9Ijd8ABackTrigger(Map<String,dynamic> map)
	{
		var result = new Game_AzVAIWnXEe2xCJpb6ooUzABranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_AzVAIWnXEe2xCJpb6ooUzA',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Restart
	void eventaXiruEXbqEe2qntwH9Ijd8ARestartTrigger(Map<String,dynamic> map)
	{
		var result = new Game_AzVAIWnXEe2xCJpb6ooUzABranch.forRestartBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_AzVAIWnXEe2xCJpb6ooUzA',
			'Restart/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
}
