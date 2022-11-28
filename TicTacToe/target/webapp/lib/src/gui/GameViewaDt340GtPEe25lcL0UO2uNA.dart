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
import 'package:app/src/models/FileGuardsaDt340GtPEe25lcL0UO2uNAGameView.dart';
//special element imports
//table component imports
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "gameview-tag",
  pipes: const [commonPipes,SecondsPipe,AuthImagePipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'GameViewaDt340GtPEe25lcL0UO2uNA.html'
)

class GameViewaDt340GtPEe25lcL0UO2uNA extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	
  	// branch Back as info.scce.dime.gui.editor.graphiti.api.CButton@2a0035dd (id: _YKRfAWtkEe25lcL0UO2uNA) in info.scce.dime.gui.editor.graphiti.api.CGUI@63cccfc1 (id: _Dt340GtPEe25lcL0UO2uNA)
  	@Output('actionbackevent') Stream<Map<String,dynamic>> get evt_actionbackevent => actionbackevent.stream;
  	StreamController<Map<String,dynamic>> actionbackevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Table table
		@Input()
		Data.Table table;
	
	bool isDestroyed = true;
  
	GameViewaDt340GtPEe25lcL0UO2uNA(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
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
			
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
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
  			void actionbackeventaYKRfAWtkEe25lcL0UO2uNAEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionbackevent.add(data);
  		}
  		
  		
  		
  		
  		/// loads an image file download for an image component	
  		String loada7lh6YG8MEe2hmY3gzoFrzAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuarda7lh6YG8MEe2hmY3gzoFrzACompound guardContainer = new FileGuarda7lh6YG8MEe2hmY3gzoFrzACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loada8EThEW8MEe2hmY3gzoFrzAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuarda8EThEW8MEe2hmY3gzoFrzACompound guardContainer = new FileGuarda8EThEW8MEe2hmY3gzoFrzACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loada8Z7y0W8MEe2hmY3gzoFrzAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuarda8Z7y0W8MEe2hmY3gzoFrzACompound guardContainer = new FileGuarda8Z7y0W8MEe2hmY3gzoFrzACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loadaVWyFYW8iEe2e7ONkcN16xAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardaVWyFYW8iEe2e7ONkcN16xACompound guardContainer = new FileGuardaVWyFYW8iEe2e7ONkcN16xACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loadaVptocW8iEe2e7ONkcN16xAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardaVptocW8iEe2e7ONkcN16xACompound guardContainer = new FileGuardaVptocW8iEe2e7ONkcN16xACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loadaV6_lsW8iEe2e7ONkcN16xAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardaV6_lsW8iEe2e7ONkcN16xACompound guardContainer = new FileGuardaV6_lsW8iEe2e7ONkcN16xACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loadaWy_45_9oW8iEe2e7ONkcN16xAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardaWy_45_9oW8iEe2e7ONkcN16xACompound guardContainer = new FileGuardaWy_45_9oW8iEe2e7ONkcN16xACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loadaXDPAIW8iEe2e7ONkcN16xAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardaXDPAIW8iEe2e7ONkcN16xACompound guardContainer = new FileGuardaXDPAIW8iEe2e7ONkcN16xACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  		/// loads an image file download for an image component	
  		String loadaXXMd8G8iEe2e7ONkcN16xAImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuardaXXMd8G8iEe2e7ONkcN16xACompound guardContainer = new FileGuardaXXMd8G8iEe2e7ONkcN16xACompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
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
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_Dt340GtPEe25lcL0UO2uNARootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_Dt340GtPEe25lcL0UO2uNAId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_Dt340GtPEe25lcL0UO2uNA";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_Dt340GtPEe25lcL0UO2uNAClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_Dt340GtPEe25lcL0UO2uNAToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}
