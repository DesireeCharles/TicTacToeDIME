import 'dart:convert';
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/data/Data.dart' as Data;
class FileGuardaBMUBoHbtEe2qntwH9Ijd8ACompound {
		
		FileReference context;
		
		SecurityInputsFileGuardaBMUBoHbtEe2qntwH9Ijd8ACompound securityInputs;
		
		
		FileGuardaBMUBoHbtEe2qntwH9Ijd8ACompound() {
			securityInputs = new SecurityInputsFileGuardaBMUBoHbtEe2qntwH9Ijd8ACompound();
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

class SecurityInputsFileGuardaBMUBoHbtEe2qntwH9Ijd8ACompound {
	SecurityInputsFileGuardaBMUBoHbtEe2qntwH9Ijd8ACompound() {
	}
	Map<String,dynamic> toJSOG(Map<Object,dynamic> objects) {
		Map<String,dynamic> jsonObj = new Map();
		return jsonObj;
	}
}


class FileGuardafe8nwXbvEe2qntwH9Ijd8ACompound {
		
		FileReference context;
		
		SecurityInputsFileGuardafe8nwXbvEe2qntwH9Ijd8ACompound securityInputs;
		
		
		FileGuardafe8nwXbvEe2qntwH9Ijd8ACompound() {
			securityInputs = new SecurityInputsFileGuardafe8nwXbvEe2qntwH9Ijd8ACompound();
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

class SecurityInputsFileGuardafe8nwXbvEe2qntwH9Ijd8ACompound {
	SecurityInputsFileGuardafe8nwXbvEe2qntwH9Ijd8ACompound() {
	}
	Map<String,dynamic> toJSOG(Map<Object,dynamic> objects) {
		Map<String,dynamic> jsonObj = new Map();
		return jsonObj;
	}
}

