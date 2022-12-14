// generated by info.scce.dime.generator.gui.rest.DartTOGeneratorHelper#generateGUIInputsDart

import 'dart:convert';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';

class WinCounter_EVQWMX8JEe29IvxJUcVYFwInput extends UserInteractionResponse {
	
	Data.Leaderboard leaderboard = null;
	
	WinCounter_EVQWMX8JEe29IvxJUcVYFwInput(Map<String,dynamic> map, Map<String,dynamic> cache)
	{
		 Map<String,dynamic> inputPorts = map['inputs'];
		if(inputPorts.containsKey('leaderboard')) {
			if(inputPorts['leaderboard']!=null){
				leaderboard = Data.Leaderboard.fromJSOG(jsog:inputPorts['leaderboard'],cache:cache);
			}
		}
	}
	
	@override
	bool startedByEvent() {
	    return false;
	}
	
	bool inpusChanged(WinCounter_EVQWMX8JEe29IvxJUcVYFwInput input) {
		return leaderboard != input.leaderboard;
	}
}
