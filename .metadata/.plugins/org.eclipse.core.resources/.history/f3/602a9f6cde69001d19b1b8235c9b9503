// routing wrapper for the Home process
import 'package:angular/angular.dart';	
import 'package:angular_router/angular_router.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/FileReference.dart';
//Data
//root process
import 'package:app/src/root/RootProcessaLWgagF_45_SEeakMeYoloYxpgComponent.dart';


@Component(
  	selector: 'routable-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [coreDirectives,routerDirectives,RootProcessaLWgagF_45_SEeakMeYoloYxpgComponent],
	template: '''
	<root-Home-aLWgagF_45_SEeakMeYoloYxpg-process
		*ngIf="loaded"
		[startPointId]="startPointId"
	>
	</root-Home-aLWgagF_45_SEeakMeYoloYxpg-process>
	'''
)
class ProcessaLWgagF_45_SEeakMeYoloYxpgComponent implements OnActivate, CanReuse {
	
	
	
	bool loaded = false;
	String startPointId = 'aLYO40F_45_SEeakMeYoloYxpg';
	
	ProcessaLWgagF_45_SEeakMeYoloYxpgComponent() {}
	
	@override
	void onActivate(_, RouterState current) async {
		loaded = true;
	}
	
	@override
	Future<bool> canReuse(RouterState current, RouterState next) {
	    return Future.value(false);
	}
}

