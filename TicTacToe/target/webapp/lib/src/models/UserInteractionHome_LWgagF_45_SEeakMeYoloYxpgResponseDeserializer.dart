import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput.dart';
import 'package:app/src/rest/gui/Game_AzVAIWnXEe2xCJpb6ooUzAInput.dart';

class UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer extends UserInteractionResponseDeserializer {
	UserInteractionResponse deserialize(String sibId,Map<String,dynamic> map, Map<String,dynamic> cache) {
switch(sibId){		case '_JVFm8XbqEe2qntwH9Ijd8A': return new PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput(map,cache);
		case '_DQiDgXbqEe2qntwH9Ijd8A': return new PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALInput(map,cache);
		case '_XiL-0XbqEe2qntwH9Ijd8A': return new Game_AzVAIWnXEe2xCJpb6ooUzAInput(map,cache);
}		throw new Exception("Exhaustive if for: ${sibId}");
	}
}
