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
import 'package:app/src/models/FileGuardsaLmrS0Ej8EeaK4_MRcoLfnw_INTERNALPublicHome.dart';
//special element imports
//table component imports
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "publichome-tag",
  pipes: const [commonPipes,SecondsPipe,AuthImagePipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL.html'
)

class PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	
  	// branch Play as info.scce.dime.gui.editor.graphiti.api.CButton@7896be4b (id: _XDpG0XbYEe2qntwH9Ijd8A_INTERNAL) in info.scce.dime.gui.editor.graphiti.api.CGUI@8ecd3343 (id: _LmrS0Ej8EeaK4_MRcoLfnw_INTERNAL)
  	@Output('actionplayevent') Stream<Map<String,dynamic>> get evt_actionplayevent => actionplayevent.stream;
  	StreamController<Map<String,dynamic>> actionplayevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	
	bool isDestroyed = true;
  
	PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw_INTERNAL(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
						
						
		
			  	
		// branch Play declaration
		if(this.actionplayevent!=null) {
			  			this.actionplayevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		updateImageHash();
	}
	
	void updateInputs(
	)
	{
		
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
  		
  		
  		
  		
  	
  		/// callback, if the button Play is clicked
  			void actionplayeventaXDpG0XbYEe2qntwH9Ijd8A_INTERNALEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionplayevent.add(data);
  		}
  		
  		
  		
  		
  		/// loads an image file download for an image component	
  		String loadaBMUBoHbtEe2qntwH9Ijd8AImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardaBMUBoHbtEe2qntwH9Ijd8ACompound guardContainer = new FileGuardaBMUBoHbtEe2qntwH9Ijd8ACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loadafe8nwXbvEe2qntwH9Ijd8AImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardafe8nwXbvEe2qntwH9Ijd8ACompound guardContainer = new FileGuardafe8nwXbvEe2qntwH9Ijd8ACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  	
  		
  		
  		
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_LmrS0Ej8EeaK4_MRcoLfnw_INTERNAL";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}
