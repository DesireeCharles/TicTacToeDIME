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
import 'package:app/src/rest/gui/Game_AzVAIWnXEe2xCJpb6ooUzAInput.dart';
import 'package:app/src/rest/gui/Game_AzVAIWnXEe2xCJpb6ooUzABranch.dart';
import 'package:app/src/gui/GameaAzVAIWnXEe2xCJpb6ooUzA.dart';
//NF model outputs

@Component(
  	selector: 'Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [
  		coreDirectives,login.Login,GameaAzVAIWnXEe2xCJpb6ooUzA,GameaAzVAIWnXEe2xCJpb6ooUzA
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process Home -->
		<!-- Process gamelOGIC -->
		<game-tag
			*ngIf="isVisible(majorSIB,'_Tepc4W8TEe29MJ2ZfnuTaA')"
			[table]="majoraTepc4W8TEe29MJ2ZfnuTaAInput.table"
			[guiId]="'_AzVAIWnXEe2xCJpb6ooUzA'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionemptyevent) = "eventaXvmvAXPlEe2eGKutfpiSKwemptyTrigger(\$event)"
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
	
	Game_AzVAIWnXEe2xCJpb6ooUzAInput majoraTepc4W8TEe29MJ2ZfnuTaAInput;
	Game_AzVAIWnXEe2xCJpb6ooUzAInput minoraTepc4W8TEe29MJ2ZfnuTaAInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process gamelOGIC
	// GUISIB Game
	@ViewChildren(GameaAzVAIWnXEe2xCJpb6ooUzA)
	List<GameaAzVAIWnXEe2xCJpb6ooUzA> componentaTepc4W8TEe29MJ2ZfnuTaA;
	
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
		
		if(isVisible(majorSIB,'_Tepc4W8TEe29MJ2ZfnuTaA')) {
			majoraTepc4W8TEe29MJ2ZfnuTaAInput = majorInput as Game_AzVAIWnXEe2xCJpb6ooUzAInput;
			if(componentaTepc4W8TEe29MJ2ZfnuTaA != null) {
				componentaTepc4W8TEe29MJ2ZfnuTaA.forEach((n)=>n.updateInputs(
					ptable:majoraTepc4W8TEe29MJ2ZfnuTaAInput.table
				));
			}
		} else if(isVisible(minorSIB,'_Tepc4W8TEe29MJ2ZfnuTaA')) {
			Game_AzVAIWnXEe2xCJpb6ooUzAInput newInput = minorInput as Game_AzVAIWnXEe2xCJpb6ooUzAInput;
			bool hasChanged = minoraTepc4W8TEe29MJ2ZfnuTaAInput!=null?minoraTepc4W8TEe29MJ2ZfnuTaAInput.inpusChanged(newInput):true;
			minoraTepc4W8TEe29MJ2ZfnuTaAInput = newInput;
			if(componentaTepc4W8TEe29MJ2ZfnuTaA != null) {
				componentaTepc4W8TEe29MJ2ZfnuTaA.forEach((n)=>n.updateInputs(
					ptable:minoraTepc4W8TEe29MJ2ZfnuTaAInput.table
				));
				if(hasChanged) {
					componentaTepc4W8TEe29MJ2ZfnuTaA.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB Game of Process gamelOGIC
	// Branch empty
	void eventaXvmvAXPlEe2eGKutfpiSKwemptyTrigger(Map<String,dynamic> map)
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
}
