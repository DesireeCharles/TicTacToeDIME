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
import 'package:app/src/services/AuthService.dart';

/*
 * Routables
 */
//Route to Home
import 'package:app/src/dad/ProcessHomeaLWgagF_45_SEeakMeYoloYxpgComponent.template.dart' as ng;

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
		ClassProvider(AuthService),
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
    	print("GENERATED AT 2022/12/19 11:43:23");
	}
}


class Routes implements AbstractRoutes{
	static final root = RouteDefinition(
	    routePath: RoutePath(path: 'home'),
	    component: ng.ProcessaLWgagF_45_SEeakMeYoloYxpgComponentNgFactory,
	  );
	static final Processa_TU1IF_45_UEea6DvTF5PmsmAURL = RouteDefinition(
	    routePath: RoutePath(path: 'home'),
	    component: ng.ProcessaLWgagF_45_SEeakMeYoloYxpgComponentNgFactory,
	  );
  static final Error = RouteDefinition(
    routePath: RoutePath(path: 'error'),
    component: ng.ErrorFoundNgFactory,
  );
  static final Maintenance = RouteDefinition(
  	 routePath: RoutePath(path: 'maintenance'),
  	 component: ng.MaintenanceNgFactory,
  );
  static final Logout = RouteDefinition(
  	routePath: RoutePath(path: 'logout'),
  	component: ng.LogoutNgFactory,
  );
  static final NotFound = RouteDefinition(
    path: '.+',
    component: ng.NotFoundNgFactory,
  );

  static final all = <RouteDefinition>[
  	  root,
	  RouteDefinition.redirect(
	    path: '/', redirectTo: Processa_TU1IF_45_UEea6DvTF5PmsmAURL.toUrl()
	  ),
	  Processa_TU1IF_45_UEea6DvTF5PmsmAURL,
	  Logout,
	  Maintenance,
	  NotFound
  ];

  @override
  RouteDefinition getByName(String typeName) {
  	switch(typeName) {
  		case 'Processa_TU1IF_45_UEea6DvTF5PmsmAURL': return Processa_TU1IF_45_UEea6DvTF5PmsmAURL;
		case 'root': return root;
  		case 'Maintenance': return Maintenance;
  		case 'Logout': return Logout;
  		default: return NotFound;
  	}
  }
}
