import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput.dart';
import 'package:app/src/rest/gui/PrivateHome_NGHA8F4TEear0NzybbrMtwInput.dart';
import 'package:app/src/rest/gui/Game_AzVAIWnXEe2xCJpb6ooUzAInput.dart';

class UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer extends UserInteractionResponseDeserializer {
	UserInteractionResponse deserialize(String sibId,Map<String,dynamic> map, Map<String,dynamic> cache) {
switch(sibId){		case '_-xUtUGUQEea0lrrxwspd7g': return new PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput(map,cache);
		case '_3huTEGUQEea0lrrxwspd7g': return new PrivateHome_NGHA8F4TEear0NzybbrMtwInput(map,cache);
		case '__4Ia0WnkEe2xCJpb6ooUzA': return new Game_AzVAIWnXEe2xCJpb6ooUzAInput(map,cache);
}		throw new Exception("Exhaustive if for: ${sibId}");
	}
}
