import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput.dart';
import 'package:app/src/rest/gui/GameView_Dt340GtPEe25lcL0UO2uNAInput.dart';

class UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer extends UserInteractionResponseDeserializer {
	UserInteractionResponse deserialize(String sibId,Map<String,dynamic> map, Map<String,dynamic> cache) {
switch(sibId){		case '_-xUtUGUQEea0lrrxwspd7g': return new PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput(map,cache);
		case '_QncVUW8KEe2hmY3gzoFrzA': return new GameView_Dt340GtPEe25lcL0UO2uNAInput(map,cache);
		case '_KEzEgW8GEe2hmY3gzoFrzA': return new GameView_Dt340GtPEe25lcL0UO2uNAInput(map,cache);
}		throw new Exception("Exhaustive if for: ${sibId}");
	}
}
