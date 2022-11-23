import 'dart:convert';
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/data/Data.dart' as Data;
class FileGuardaEoWNEGnbEe2xCJpb6ooUzACompound {
		
		FileReference context;
		
		SecurityInputsFileGuardaEoWNEGnbEe2xCJpb6ooUzACompound securityInputs;
		
		
		FileGuardaEoWNEGnbEe2xCJpb6ooUzACompound() {
			securityInputs = new SecurityInputsFileGuardaEoWNEGnbEe2xCJpb6ooUzACompound();
		}
		
		String toQueryParams() {
			List<String> params = new List();
			return "?" + params.join("&");
		}
		
		String toJSON() {
			return jsonEncode(this.toJSOG());
		}
		
		Map<String,dynamic> toJSOG() {
			Map<String,dynamic> jsonObj = new Map();
			Map<Object,dynamic> objects = new Map();
			if(context!=null) {
				jsonObj["context"] = context.toJSOG(objects);
			}
			else{
				jsonObj["context"] = null;
			}
			jsonObj["securityInputsForInteractable"] = securityInputs.toJSOG(objects);
			return jsonObj;
		}
}

class SecurityInputsFileGuardaEoWNEGnbEe2xCJpb6ooUzACompound {
	SecurityInputsFileGuardaEoWNEGnbEe2xCJpb6ooUzACompound() {
	}
	Map<String,dynamic> toJSOG(Map<Object,dynamic> objects) {
		Map<String,dynamic> jsonObj = new Map();
		return jsonObj;
	}
}

