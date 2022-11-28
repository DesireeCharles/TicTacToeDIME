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
import 'package:app/src/rest/gui/GameView_Dt340GtPEe25lcL0UO2uNAInput.dart';
import 'package:app/src/rest/gui/GameView_Dt340GtPEe25lcL0UO2uNABranch.dart';
import 'package:app/src/gui/GameViewaDt340GtPEe25lcL0UO2uNA.dart';
//NF model outputs

@Component(
  	selector: 'Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [
  		coreDirectives,login.Login,PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw,GameViewaDt340GtPEe25lcL0UO2uNA,PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw,GameViewaDt340GtPEe25lcL0UO2uNA,PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw,GameViewaDt340GtPEe25lcL0UO2uNA
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
			(actionplayevent) = "eventa_45_xgTgGUQEea0lrrxwspd7gPlayTrigger(\$event)"
		>
		</publichome-tag>
		<!-- Process Game -->
		<gameview-tag
			*ngIf="isVisible(majorSIB,'_QncVUW8KEe2hmY3gzoFrzA')"
			[guiId]="'_Dt340GtPEe25lcL0UO2uNA'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionbackevent) = "eventaQnh04W8KEe2hmY3gzoFrzABackTrigger(\$event)"
		>
		</gameview-tag>
		<!-- Process CreateTable -->
		<gameview-tag
			*ngIf="isVisible(majorSIB,'_KEzEgW8GEe2hmY3gzoFrzA')"
			[guiId]="'_Dt340GtPEe25lcL0UO2uNA'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionbackevent) = "eventaKFH0oW8GEe2hmY3gzoFrzABackTrigger(\$event)"
		>
		</gameview-tag>
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
	GameView_Dt340GtPEe25lcL0UO2uNAInput majoraQncVUW8KEe2hmY3gzoFrzAInput;
	GameView_Dt340GtPEe25lcL0UO2uNAInput minoraQncVUW8KEe2hmY3gzoFrzAInput;
	GameView_Dt340GtPEe25lcL0UO2uNAInput majoraKEzEgW8GEe2hmY3gzoFrzAInput;
	GameView_Dt340GtPEe25lcL0UO2uNAInput minoraKEzEgW8GEe2hmY3gzoFrzAInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process Home
	// GUISIB PublicHome
	@ViewChildren(PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw)
	List<PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw> componenta_45_xUtUGUQEea0lrrxwspd7g;
	// GUISIBs of Process Game
	// GUISIB GameView
	@ViewChildren(GameViewaDt340GtPEe25lcL0UO2uNA)
	List<GameViewaDt340GtPEe25lcL0UO2uNA> componentaQncVUW8KEe2hmY3gzoFrzA;
	// GUISIBs of Process CreateTable
	// GUISIB GameView
	@ViewChildren(GameViewaDt340GtPEe25lcL0UO2uNA)
	List<GameViewaDt340GtPEe25lcL0UO2uNA> componentaKEzEgW8GEe2hmY3gzoFrzA;
	
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
		if(isVisible(majorSIB,'_QncVUW8KEe2hmY3gzoFrzA')) {
			majoraQncVUW8KEe2hmY3gzoFrzAInput = majorInput as GameView_Dt340GtPEe25lcL0UO2uNAInput;
			if(componentaQncVUW8KEe2hmY3gzoFrzA != null) {
				componentaQncVUW8KEe2hmY3gzoFrzA.forEach((n)=>n.updateInputs(
					ptable:majoraQncVUW8KEe2hmY3gzoFrzAInput.table
				));
			}
		} else if(isVisible(minorSIB,'_QncVUW8KEe2hmY3gzoFrzA')) {
			GameView_Dt340GtPEe25lcL0UO2uNAInput newInput = minorInput as GameView_Dt340GtPEe25lcL0UO2uNAInput;
			bool hasChanged = minoraQncVUW8KEe2hmY3gzoFrzAInput!=null?minoraQncVUW8KEe2hmY3gzoFrzAInput.inpusChanged(newInput):true;
			minoraQncVUW8KEe2hmY3gzoFrzAInput = newInput;
			if(componentaQncVUW8KEe2hmY3gzoFrzA != null) {
				componentaQncVUW8KEe2hmY3gzoFrzA.forEach((n)=>n.updateInputs(
					ptable:minoraQncVUW8KEe2hmY3gzoFrzAInput.table
				));
				if(hasChanged) {
					componentaQncVUW8KEe2hmY3gzoFrzA.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_KEzEgW8GEe2hmY3gzoFrzA')) {
			majoraKEzEgW8GEe2hmY3gzoFrzAInput = majorInput as GameView_Dt340GtPEe25lcL0UO2uNAInput;
			if(componentaKEzEgW8GEe2hmY3gzoFrzA != null) {
				componentaKEzEgW8GEe2hmY3gzoFrzA.forEach((n)=>n.updateInputs(
					ptable:majoraKEzEgW8GEe2hmY3gzoFrzAInput.table
				));
			}
		} else if(isVisible(minorSIB,'_KEzEgW8GEe2hmY3gzoFrzA')) {
			GameView_Dt340GtPEe25lcL0UO2uNAInput newInput = minorInput as GameView_Dt340GtPEe25lcL0UO2uNAInput;
			bool hasChanged = minoraKEzEgW8GEe2hmY3gzoFrzAInput!=null?minoraKEzEgW8GEe2hmY3gzoFrzAInput.inpusChanged(newInput):true;
			minoraKEzEgW8GEe2hmY3gzoFrzAInput = newInput;
			if(componentaKEzEgW8GEe2hmY3gzoFrzA != null) {
				componentaKEzEgW8GEe2hmY3gzoFrzA.forEach((n)=>n.updateInputs(
					ptable:minoraKEzEgW8GEe2hmY3gzoFrzAInput.table
				));
				if(hasChanged) {
					componentaKEzEgW8GEe2hmY3gzoFrzA.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB PublicHome of Process Home
	// Branch Play
	void eventa_45_xgTgGUQEea0lrrxwspd7gPlayTrigger(Map<String,dynamic> map)
	{
		var result = new PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch.forPlayBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_LmrS0Ej8EeaK4_MRcoLfnw',
			'Play/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB GameView of Process Game
	// Branch Back
	void eventaQnh04W8KEe2hmY3gzoFrzABackTrigger(Map<String,dynamic> map)
	{
		var result = new GameView_Dt340GtPEe25lcL0UO2uNABranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Dt340GtPEe25lcL0UO2uNA',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB GameView of Process CreateTable
	// Branch Back
	void eventaKFH0oW8GEe2hmY3gzoFrzABackTrigger(Map<String,dynamic> map)
	{
		var result = new GameView_Dt340GtPEe25lcL0UO2uNABranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Dt340GtPEe25lcL0UO2uNA',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
}
