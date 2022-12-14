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
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "badge-tag",
  pipes: const [commonPipes,SecondsPipe,AuthImagePipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'BadgeaZlXgoXKOEe2rzNRUfilttw.html'
)

class BadgeaZlXgoXKOEe2rzNRUfilttw extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	
  	// branch empty as info.scce.dime.gui.editor.graphiti.api.CButton@4ae2cb7f (id: __1OZgXPkEe2eGKutfpiSKw) in info.scce.dime.gui.editor.graphiti.api.CGUI@84e25de0 (id: _ZlXgoXKOEe2rzNRUfilttw)
  	@Output('actionemptyevent') Stream<Map<String,dynamic>> get evt_actionemptyevent => actionemptyevent.stream;
  	StreamController<Map<String,dynamic>> actionemptyevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//TableEntry tableEntry
		@Input()
		Data.TableEntry tableEntry;
	//Table table
		@Input()
		Data.Table table;
	
	bool isDestroyed = true;
  
	BadgeaZlXgoXKOEe2rzNRUfilttw(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// TableEntry tableEntry
		this.tableEntry = null;
		// Table table
		this.table = null;
						
						
		
			  	
		// branch empty declaration
		if(this.actionemptyevent!=null) {
			  			this.actionemptyevent = new StreamController<Map<String,dynamic>>();  				
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
	{Data.TableEntry ptableEntry,
	Data.Table ptable
	})
	{
		tableEntry = ptableEntry;
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
  		
  		
  		
  		
  	
  		/// callback, if the button empty is clicked
  			void actionemptyeventa_1OZgXPkEe2eGKutfpiSKwEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			data['tableEntry'] = this.tableEntry;
  			this.actionemptyevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.TableEntry
  		 initOnDemandtableEntry()
  		{
  			if(this.tableEntry==null){
  				this.tableEntry = new Data.TableEntry
  				();
  			}
  			return this.tableEntry;
  		}
  		void setValuetableEntry(Data.TableEntry
  		 value)
  		{
  			this.tableEntry = value;
  		}
  		void tableEntrysetValue(Data.TableEntry
  		 value)
  		{
  			this.setValuetableEntry(value);
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
	String getContainer_ZlXgoXKOEe2rzNRUfilttwRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_ZlXgoXKOEe2rzNRUfilttwId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_ZlXgoXKOEe2rzNRUfilttw";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_ZlXgoXKOEe2rzNRUfilttwClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_ZlXgoXKOEe2rzNRUfilttwToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}
