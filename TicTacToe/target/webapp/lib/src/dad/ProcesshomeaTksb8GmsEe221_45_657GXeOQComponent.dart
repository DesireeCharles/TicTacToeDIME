// routing wrapper for the home process
import 'package:angular/angular.dart';	
import 'package:angular_router/angular_router.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/FileReference.dart';
//Data
//root process
import 'package:app/src/root/RootProcessaTksb8GmsEe221_45_657GXeOQComponent.dart';


@Component(
  	selector: 'routable-aTksb8GmsEe221_45_657GXeOQ-process',
  	directives: const [coreDirectives,routerDirectives,RootProcessaTksb8GmsEe221_45_657GXeOQComponent],
	template: '''
	<root-home-aTksb8GmsEe221_45_657GXeOQ-process
		*ngIf="loaded"
		[startPointId]="startPointId"
	>
	</root-home-aTksb8GmsEe221_45_657GXeOQ-process>
	'''
)
class ProcessaTksb8GmsEe221_45_657GXeOQComponent implements OnActivate, CanReuse {
	
	
	
	bool loaded = false;
	String startPointId = 'aU0ZJQGmsEe221_45_657GXeOQ';
	
	ProcessaTksb8GmsEe221_45_657GXeOQComponent() {}
	
	@override
	void onActivate(_, RouterState current) async {
		loaded = true;
	}
	
	@override
	Future<bool> canReuse(RouterState current, RouterState next) {
	    return Future.value(false);
	}
}

