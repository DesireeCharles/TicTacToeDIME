import 'dart:convert';
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/data/Data.dart' as Data;
class FileGuarda9NZskW8LEe2hmY3gzoFrzACompound {
		
		FileReference context;
		
		SecurityInputsFileGuarda9NZskW8LEe2hmY3gzoFrzACompound securityInputs;
		
		
		FileGuarda9NZskW8LEe2hmY3gzoFrzACompound() {
			securityInputs = new SecurityInputsFileGuarda9NZskW8LEe2hmY3gzoFrzACompound();
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

class SecurityInputsFileGuarda9NZskW8LEe2hmY3gzoFrzACompound {
	SecurityInputsFileGuarda9NZskW8LEe2hmY3gzoFrzACompound() {
	}
	Map<String,dynamic> toJSOG(Map<Object,dynamic> objects) {
		Map<String,dynamic> jsonObj = new Map();
		return jsonObj;
	}
}


class FileGuarda89xVIW8LEe2hmY3gzoFrzACompound {
		
		FileReference context;
		
		SecurityInputsFileGuarda89xVIW8LEe2hmY3gzoFrzACompound securityInputs;
		
		
		FileGuarda89xVIW8LEe2hmY3gzoFrzACompound() {
			securityInputs = new SecurityInputsFileGuarda89xVIW8LEe2hmY3gzoFrzACompound();
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

class SecurityInputsFileGuarda89xVIW8LEe2hmY3gzoFrzACompound {
	SecurityInputsFileGuarda89xVIW8LEe2hmY3gzoFrzACompound() {
	}
	Map<String,dynamic> toJSOG(Map<Object,dynamic> objects) {
		Map<String,dynamic> jsonObj = new Map();
		return jsonObj;
	}
}

