/*
 * Angular
 */
import 'package:angular/core.dart';
import 'package:angular_router/angular_router.dart';

import 'package:app/src/core/Helper.template.dart' as ng;
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/notification/notification_component.dart';
import 'package:app/src/progress-bar/progress_bar_component.dart';
import 'package:app/src/services/TableDndService.dart';
import 'package:app/src/services/ProgressService.dart';
/*
 * Routables
 */
//Route to home
import 'package:app/src/dad/ProcesshomeaTksb8GmsEe221_45_657GXeOQComponent.template.dart' as ng;

@Component(
    selector: 'app',
    template:'''
    	  <notification #notification></notification>
    	  <progress-bar></progress-bar>
    	  <router-outlet [routes]="Routes.all"></router-outlet>
    ''',
    directives: const [routerDirectives,NotificationComponent,ProgressBarComponent],
    exports: [Routes],
    providers: const [
    	ClassProvider(DIMEProcessService),
    	ClassProvider(NotificationService),
    	ClassProvider(ProgressService), 
		ClassProvider(TableDndService),
        ClassProvider(AbstractRoutes, useClass: Routes),
	]
)
class AppComponent implements OnInit {
		
	@ViewChild('notification')
	NotificationComponent notificationComponent;
	
    final NotificationService _notificationService;
    final ProgressService _progressService;
    
    AppComponent(this._notificationService, this._progressService){}

    @override
	void ngOnInit() async {
    	this._notificationService.component = notificationComponent;
    	print("GENERATED AT 2022/11/21 15:55:50");
	}
}


class Routes implements AbstractRoutes{
	static final root = RouteDefinition(
	    routePath: RoutePath(path: 'home'),
	    component: ng.ProcessaTksb8GmsEe221_45_657GXeOQComponentNgFactory,
	  );
	static final ProcessagLGi0WmsEe221_45_657GXeOQURL = RouteDefinition(
	    routePath: RoutePath(path: 'home'),
	    component: ng.ProcessaTksb8GmsEe221_45_657GXeOQComponentNgFactory,
	  );
  static final Error = RouteDefinition(
    routePath: RoutePath(path: 'error'),
    component: ng.ErrorFoundNgFactory,
  );
  static final Maintenance = RouteDefinition(
  	 routePath: RoutePath(path: 'maintenance'),
  	 component: ng.MaintenanceNgFactory,
  );
  static final NotFound = RouteDefinition(
    path: '.+',
    component: ng.NotFoundNgFactory,
  );

  static final all = <RouteDefinition>[
  	  root,
	  RouteDefinition.redirect(
	    path: '/', redirectTo: ProcessagLGi0WmsEe221_45_657GXeOQURL.toUrl()
	  ),
	  ProcessagLGi0WmsEe221_45_657GXeOQURL,
	  Maintenance,
	  NotFound
  ];

  @override
  RouteDefinition getByName(String typeName) {
  	switch(typeName) {
  		case 'ProcessagLGi0WmsEe221_45_657GXeOQURL': return ProcessagLGi0WmsEe221_45_657GXeOQURL;
		case 'root': return root;
  		case 'Maintenance': return Maintenance;
  		default: return NotFound;
  	}
  }
}
