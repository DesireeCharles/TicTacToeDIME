// generated by info.scce.dime.generator.gui.rest.DartTOGeneratorHelper#generateGUIInputsDart

import 'dart:convert';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';

class GameState_0WZ_gH0pEe2_45_urIT6LmdwAInput extends UserInteractionResponse {
	
	Data.Table table = null;
	
	GameState_0WZ_gH0pEe2_45_urIT6LmdwAInput(Map<String,dynamic> map, Map<String,dynamic> cache)
	{
		 Map<String,dynamic> inputPorts = map['inputs'];
		if(inputPorts.containsKey('table')) {
			if(inputPorts['table']!=null){
				table = Data.Table.fromJSOG(jsog:inputPorts['table'],cache:cache);
			}
		}
	}
	
	@override
	bool startedByEvent() {
	    return false;
	}
	
	bool inpusChanged(GameState_0WZ_gH0pEe2_45_urIT6LmdwAInput input) {
		return table != input.table;
	}
}