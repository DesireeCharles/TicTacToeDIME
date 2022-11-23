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
import 'package:app/src/models/FileGuardsaLmrS0Ej8EeaK4_MRcoLfnwPublicHome.dart';
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
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw.html'
)

class PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	
  	// branch Login as info.scce.dime.gui.editor.graphiti.api.CButton@bfa425e4 (id: _MF6_kE_LEeauEZ95mLTQ7g) in info.scce.dime.gui.editor.graphiti.api.CGUI@e567f1e5 (id: _LmrS0Ej8EeaK4_MRcoLfnw)
  	@Output('actionloginevent') Stream<Map<String,dynamic>> get evt_actionloginevent => actionloginevent.stream;
  	StreamController<Map<String,dynamic>> actionloginevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	
	bool isDestroyed = true;
  
	PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
						
						
		
			  	
		// branch Login declaration
		if(this.actionloginevent!=null) {
			  			this.actionloginevent = new StreamController<Map<String,dynamic>>();  				
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
  		
  		
  		
  		
  	
  		/// callback, if the button Login is clicked
  			void actionlogineventaMF6_kE_LEeauEZ95mLTQ7gEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionloginevent.add(data);
  		}
  		
  		
  		
  		
  		/// loads an image file download for an image component	
  		String loadaEoWNEGnbEe2xCJpb6ooUzAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardaEoWNEGnbEe2xCJpb6ooUzACompound guardContainer = new FileGuardaEoWNEGnbEe2xCJpb6ooUzACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  	
  		
  		
  		
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_LmrS0Ej8EeaK4_MRcoLfnwRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_LmrS0Ej8EeaK4_MRcoLfnwId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_LmrS0Ej8EeaK4_MRcoLfnw";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_LmrS0Ej8EeaK4_MRcoLfnwClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_LmrS0Ej8EeaK4_MRcoLfnwToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}
