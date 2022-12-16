import 'dart:async';
import 'dart:convert';
import 'dart:html' as html;

import 'package:angular_router/angular_router.dart';
import 'package:angular/angular.dart';
import 'package:angular/security.dart';
import 'package:angular_forms/angular_forms.dart';

import 'package:app/src/app.dart';

import 'package:app/src/core/dime_process_service.dart';
//Notifications
import 'package:app/src/notification/notification_component.dart';
//Login
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/core/DIMEComponent.dart' as dime;

//Data
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/filesupport/fileuploader.dart';
import 'package:app/src/filesupport/fileselect.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/Todos.dart';
//Directives
import 'package:app/src/directives/MaxLength.dart';
import 'package:app/src/directives/DimeCustomeAttributes.dart';

//Import Services
import 'package:intl/intl.dart';
import 'package:intl/date_symbol_data_local.dart';
import 'package:markdown/markdown.dart' as markdown;
import 'package:app/src/modal/Modal.dart' as modal;
//Panel
import 'package:app/src/panel/Panel.dart' as panel;

//file guard imports
//special element imports
//table component imports
//form component imports
//GUI plug in component imports
//GUI SIB imports
import 'package:app/src/gui/BadgeaZlXgoXKOEe2rzNRUfilttw.dart';
import 'package:app/src/gui/GameStatea0WZ_gH0pEe2_45_urIT6LmdwA.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "game-tag",
  pipes: const [commonPipes,SecondsPipe,AuthImagePipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  BadgeaZlXgoXKOEe2rzNRUfilttw,
  GameStatea0WZ_gH0pEe2_45_urIT6LmdwA,
  ],
  templateUrl: 'GameaAzVAIWnXEe2xCJpb6ooUzA.html'
)

class GameaAzVAIWnXEe2xCJpb6ooUzA extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
  	// common declarations
  	bool refresh;
  	@Input()
  	bool ismajorpage = false;
  	@Input()
  	String currentbranch;
  	@Input()
  	bool modalDialog = false;
  	ChangeDetectorRef cdr;
  	@Input()
  	String runtimeId;
  	@Input()
  	String guiId;
  	final Router router;
  	final DIMEProcessService processService;
  	final DomSanitizationService domSanitizationService; 
  	// component Default Declaration
  	// table refresh flags
  	/// GUI badge
  	@ViewChildren(BadgeaZlXgoXKOEe2rzNRUfilttw)
  	List<BadgeaZlXgoXKOEe2rzNRUfilttw> componentSIBayKmZAX1aEe2BL67A2MFPXw;
  	/// GUI GameState
  	@ViewChildren(GameStatea0WZ_gH0pEe2_45_urIT6LmdwA)
  	List<GameStatea0WZ_gH0pEe2_45_urIT6LmdwA> componentSIBajbVksX1ZEe2BL67A2MFPXw;
  	
  	
  	
  	
  	
  	// branch Back as info.scce.dime.gui.editor.graphiti.api.CButton@c3700c36 (id: _i3H0kXbbEe2qntwH9Ijd8A) in info.scce.dime.gui.editor.graphiti.api.CGUI@f524d492 (id: _AzVAIWnXEe2xCJpb6ooUzA)
  	@Output('actionbackevent') Stream<Map<String,dynamic>> get evt_actionbackevent => actionbackevent.stream;
  	StreamController<Map<String,dynamic>> actionbackevent = new StreamController();
  	// branch Restart as info.scce.dime.gui.editor.graphiti.api.CButton@8526cd71 (id: _mFQkgXbbEe2qntwH9Ijd8A) in info.scce.dime.gui.editor.graphiti.api.CGUI@f524d492 (id: _AzVAIWnXEe2xCJpb6ooUzA)
  	@Output('actionrestartevent') Stream<Map<String,dynamic>> get evt_actionrestartevent => actionrestartevent.stream;
  	StreamController<Map<String,dynamic>> actionrestartevent = new StreamController();
  	// branch empty as info.scce.dime.gui.editor.graphiti.api.CButton@4ae2cb7f (id: __1OZgXPkEe2eGKutfpiSKw) in info.scce.dime.gui.editor.graphiti.api.CGUI@84e25de0 (id: _ZlXgoXKOEe2rzNRUfilttw)
  	@Output('actionemptyevent') Stream<Map<String,dynamic>> get evt_actionemptyevent => actionemptyevent.stream;
  	StreamController<Map<String,dynamic>> actionemptyevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Table table
		@Input()
		Data.Table table;
	
	bool isDestroyed = true;
  
	GameaAzVAIWnXEe2xCJpb6ooUzA(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Table table
		this.table = null;
						
						
		
			  	
		// branch Back declaration
		if(this.actionbackevent!=null) {
			  			this.actionbackevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Restart declaration
		if(this.actionrestartevent!=null) {
			  			this.actionrestartevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch empty declaration
		if(this.actionemptyevent!=null) {
			  			this.actionemptyevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// GUI badge
		if(componentSIBayKmZAX1aEe2BL67A2MFPXw!=null) {
			componentSIBayKmZAX1aEe2BL67A2MFPXw.forEach((n)=>n.restartComponent());
		}
		/// GUI GameState
		if(componentSIBajbVksX1ZEe2BL67A2MFPXw!=null) {
			componentSIBajbVksX1ZEe2BL67A2MFPXw.forEach((n)=>n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		componentSIBayKmZAX1aEe2BL67A2MFPXw.forEach((n)=>n.updateWithoutInputs());
		componentSIBajbVksX1ZEe2BL67A2MFPXw.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{Data.Table ptable
	})
	{
		table = ptable;
		
		updateWithoutInputs(updateHidden:false);
	}
	
	
	@override
	void ngOnInit() async
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		this.isDestroyed = false;
		openWebsockets();
	}
	
	void openWebsockets() {
	}
	
	
	@override
	void ngOnDestroy()
	{
	}
	
	
	void ngAfterViewInit() {
		html.window.document.dispatchEvent(new html.CustomEvent('dime-component-ready'));
		js.context.callMethod("enableTooltip",[]);
	}
	
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button Back is clicked
  			void actionbackeventai3H0kXbbEe2qntwH9Ijd8AEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionbackevent.add(data);
  		}
  		/// callback, if the button Restart is clicked
  			void actionrestarteventamFQkgXbbEe2qntwH9Ijd8AEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionrestartevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.Table
  		 initOnDemandtable()
  		{
  			if(this.table==null){
  				this.table = new Data.Table
  				();
  			}
  			return this.table;
  		}
  		void setValuetable(Data.Table
  		 value)
  		{
  			this.table = value;
  		}
  		void tablesetValue(Data.Table
  		 value)
  		{
  			this.setValuetable(value);
  		}
  		
  	
  		
  		
  		//GUI SIB badge
  		//GUI SIB GameState
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_AzVAIWnXEe2xCJpb6ooUzARootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_AzVAIWnXEe2xCJpb6ooUzAId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_AzVAIWnXEe2xCJpb6ooUzA";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_AzVAIWnXEe2xCJpb6ooUzAClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_AzVAIWnXEe2xCJpb6ooUzAToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}
