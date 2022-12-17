import 'dart:core' as core;
import 'dart:convert';
import '../models/FileReference.dart';
import '../models/Selectives.dart';
import '../commons/Exceptions.dart';

class DataCastUtil {
	
	const DataCastUtil();
	static ConcreteUser castToConcreteUser(core.Object o) => o as ConcreteUser;
	static DIMEList<ConcreteUser> castToListConcreteUser(DIMEList<core.Object> os) => new DIMEList.from(os.cast<ConcreteUser>());
	static DIMEList<ConcreteUser> newListConcreteUser() => new DIMEList<ConcreteUser>();
	
	static BaseUser castToBaseUser(core.Object o) => o as BaseUser;
	static DIMEList<BaseUser> castToListBaseUser(DIMEList<core.Object> os) => new DIMEList.from(os.cast<BaseUser>());
	static DIMEList<BaseUser> newListBaseUser() => new DIMEList<BaseUser>();
	
	static Table castToTable(core.Object o) => o as Table;
	static DIMEList<Table> castToListTable(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Table>());
	static DIMEList<Table> newListTable() => new DIMEList<Table>();
	
	static TableRow castToTableRow(core.Object o) => o as TableRow;
	static DIMEList<TableRow> castToListTableRow(DIMEList<core.Object> os) => new DIMEList.from(os.cast<TableRow>());
	static DIMEList<TableRow> newListTableRow() => new DIMEList<TableRow>();
	
	static TableEntry castToTableEntry(core.Object o) => o as TableEntry;
	static DIMEList<TableEntry> castToListTableEntry(DIMEList<core.Object> os) => new DIMEList.from(os.cast<TableEntry>());
	static DIMEList<TableEntry> newListTableEntry() => new DIMEList<TableEntry>();
	
	static EntryState castToEntryState(core.Object o) => o as EntryState;
	static DIMEList<EntryState> castToListEntryState(DIMEList<core.Object> os) => new DIMEList.from(os.cast<EntryState>());
	static DIMEList<EntryState> newListEntryState() => new DIMEList<EntryState>();
	
	static TurnState castToTurnState(core.Object o) => o as TurnState;
	static DIMEList<TurnState> castToListTurnState(DIMEList<core.Object> os) => new DIMEList.from(os.cast<TurnState>());
	static DIMEList<TurnState> newListTurnState() => new DIMEList<TurnState>();
	
	static GameState castToGameState(core.Object o) => o as GameState;
	static DIMEList<GameState> castToListGameState(DIMEList<core.Object> os) => new DIMEList.from(os.cast<GameState>());
	static DIMEList<GameState> newListGameState() => new DIMEList<GameState>();
}
class ConcreteUser extends BaseModel
{
	core.bool _baseUserHasBeenSet = false;
	core.bool baseUserHasBeenChanged() => _baseUserHasBeenSet||(_baseUser==null?false:_baseUser.hasChanged()) ;
	BaseUser _baseUser;
	core.bool _dywaSwitchedToHasBeenSet = false;
	core.bool dywaSwitchedToHasBeenChanged() => _dywaSwitchedToHasBeenSet||(_dywaSwitchedTo==null?false:_dywaSwitchedTo.hasChanged()) ;
	ConcreteUser _dywaSwitchedTo;
	
	static ConcreteUser fromId(core.int id) {
		var m = new ConcreteUser();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'baseUser': this.baseUser, 
	  'dywaSwitchedTo': this.dywaSwitchedTo
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'baseUser': this.baseUser = value; return;
	  case 'dywaSwitchedTo': this.dywaSwitchedTo = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	ConcreteUser({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("baseUser")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["baseUser"];
				if(jsogObj != null) {
					BaseUser valueafPY24MwNEeWZVvvwxpYu8A;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueafPY24MwNEeWZVvvwxpYu8A = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.BaseUser") {
								valueafPY24MwNEeWZVvvwxpYu8A = new BaseUser(cache: cache, jsog: jsogObj);
							}
							else {
								valueafPY24MwNEeWZVvvwxpYu8A = new BaseUser(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueafPY24MwNEeWZVvvwxpYu8A = new BaseUser(cache: cache,jsog: jsogObj);
						}
					}
					this._baseUser = valueafPY24MwNEeWZVvvwxpYu8A;
				}
			}
			
			
			_baseUserHasBeenSet = false;
			if (jsog.containsKey("dywaSwitchedTo")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["dywaSwitchedTo"];
				if(jsogObj != null) {
					ConcreteUser valueaJp6R8X3xEe2ONMPeQEJUSA;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaJp6R8X3xEe2ONMPeQEJUSA = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.ConcreteUserImpl") {
								valueaJp6R8X3xEe2ONMPeQEJUSA = new ConcreteUser(cache: cache, jsog: jsogObj);
							}
							else {
								valueaJp6R8X3xEe2ONMPeQEJUSA = new ConcreteUser(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaJp6R8X3xEe2ONMPeQEJUSA = new ConcreteUser(cache: cache,jsog: jsogObj);
						}
					}
					this._dywaSwitchedTo = valueaJp6R8X3xEe2ONMPeQEJUSA;
				}
			}
			
			
			_dywaSwitchedToHasBeenSet = false;
		}
	}
	
	void baseUserHasBeenSetted() { _baseUserHasBeenSet=true; }
	void dywaSwitchedToHasBeenSetted() { _dywaSwitchedToHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_baseUserHasBeenSet || 
					_dywaSwitchedToHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( baseUserHasBeenChanged() && !jsonObj.containsKey('baseUser')) && !objects.containsKey(this._baseUser)) {
			if(this._baseUser != null) {
				jsonObj["baseUser"] = this._baseUser.toJSOG(objects);
			}
			else {
				jsonObj["baseUser"] = null;
			}
			}
			if(( dywaSwitchedToHasBeenChanged() && !jsonObj.containsKey('dywaSwitchedTo')) && !objects.containsKey(this._dywaSwitchedTo)) {
			if(this._dywaSwitchedTo != null) {
				if (this._dywaSwitchedTo == this) {
					jsonObj["dywaSwitchedTo"] = { '@ref': jsogId.toString() };
				} else {
					jsonObj["dywaSwitchedTo"] = this._dywaSwitchedTo.toJSOG(objects);
				}
			}
			else {
				jsonObj["dywaSwitchedTo"] = null;
			}
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.ConcreteUserImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( baseUserHasBeenChanged() && !jsonObj.containsKey('baseUser')) && !objects.containsKey(this._baseUser) || this.dywa_id == 0) {
		if(this._baseUser != null) {
			jsonObj["baseUser"] = this._baseUser.toJSOG(objects);
		}
		else {
			jsonObj["baseUser"] = null;
		}
		}
		if(( dywaSwitchedToHasBeenChanged() && !jsonObj.containsKey('dywaSwitchedTo')) && !objects.containsKey(this._dywaSwitchedTo) || this.dywa_id == 0) {
		if(this._dywaSwitchedTo != null) {
			if (this._dywaSwitchedTo == this) {
				jsonObj["dywaSwitchedTo"] = { '@ref': jsogId.toString() };
			} else {
				jsonObj["dywaSwitchedTo"] = this._dywaSwitchedTo.toJSOG(objects);
			}
		}
		else {
			jsonObj["dywaSwitchedTo"] = null;
		}
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static ConcreteUser fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.ConcreteUserImpl') {
			return new ConcreteUser(cache:cache,jsog:jsog);
		}
		return new ConcreteUser(cache:cache,jsog:jsog);
	}
	
	void set baseUser (BaseUser value)
	{
		this._baseUserHasBeenSet = true;
		this._baseUser = value;
	}
	
	BaseUser get baseUser
	{
		return this._baseUser;
	}
	
		BaseUser initOnDemandbaseUser()
		{
			if(this._baseUser == null) {
			this.baseUser = new BaseUser();
			}
			return this.baseUser;
		}
		
		void setValuebaseUser(BaseUser value)
		{
			this.baseUser = value;
		}
		
		void baseUsersetValue(BaseUser value)
		{
			this.baseUser = value;
		}
		
	
	void set dywaSwitchedTo (ConcreteUser value)
	{
		this._dywaSwitchedToHasBeenSet = true;
		this._dywaSwitchedTo = value;
	}
	
	ConcreteUser get dywaSwitchedTo
	{
		return this._dywaSwitchedTo;
	}
	
		ConcreteUser initOnDemanddywaSwitchedTo()
		{
			if(this._dywaSwitchedTo == null) {
			this.dywaSwitchedTo = new ConcreteUser();
			}
			return this.dywaSwitchedTo;
		}
		
		void setValuedywaSwitchedTo(ConcreteUser value)
		{
			this.dywaSwitchedTo = value;
		}
		
		void dywaSwitchedTosetValue(ConcreteUser value)
		{
			this.dywaSwitchedTo = value;
		}
		
	
}

class BaseUser extends BaseModel
{
	core.bool _concreteUserHasBeenSet = false;
	core.bool concreteUserHasBeenChanged() => _concreteUserHasBeenSet;
	DIMEList<ConcreteUser> _concreteUser;
	core.bool _firstNameHasBeenSet = false;
	core.bool firstNameHasBeenChanged() => _firstNameHasBeenSet;
	core.String _firstName;
	core.bool _imageHasBeenSet = false;
	core.bool imageHasBeenChanged() => _imageHasBeenSet;
	FileReference _image;
	core.bool _lastNameHasBeenSet = false;
	core.bool lastNameHasBeenChanged() => _lastNameHasBeenSet;
	core.String _lastName;
	core.bool _passwordHasBeenSet = false;
	core.bool passwordHasBeenChanged() => _passwordHasBeenSet;
	core.String _password;
	core.bool _usernameHasBeenSet = false;
	core.bool usernameHasBeenChanged() => _usernameHasBeenSet;
	core.String _username;
	
	static BaseUser fromId(core.int id) {
		var m = new BaseUser();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'concreteUser': this.concreteUser, 
	  'firstName': this.firstName, 
	  'image': this.image, 
	  'lastName': this.lastName, 
	  'password': this.password, 
	  'username': this.username
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'concreteUser': this.concreteUser = value; return;
	  case 'firstName': this.firstName = value; return;
	  case 'image': this.image = value; return;
	  case 'lastName': this.lastName = value; return;
	  case 'password': this.password = value; return;
	  case 'username': this.username = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	BaseUser({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._concreteUser = new DIMEList.monitored(concreteUserHasBeenSetted);
			this._firstName = null;
			this._image = null;
			this._lastName = null;
			this._password = null;
			this._username = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			this._concreteUser = new DIMEList.monitored(concreteUserHasBeenSetted);
			if (jsog.containsKey("concreteUser")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["concreteUser"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					ConcreteUser valueafOkXgMwNEeWZVvvwxpYu8A;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueafOkXgMwNEeWZVvvwxpYu8A = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.ConcreteUserImpl") {
								valueafOkXgMwNEeWZVvvwxpYu8A = new ConcreteUser(cache: cache, jsog: jsogObj);
							}
							else {
								valueafOkXgMwNEeWZVvvwxpYu8A = new ConcreteUser(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueafOkXgMwNEeWZVvvwxpYu8A = new ConcreteUser(cache: cache,jsog: jsogObj);
						}
					}
					this._concreteUser.add(valueafOkXgMwNEeWZVvvwxpYu8A);
				}
			}
			
			
			_concreteUserHasBeenSet = false;
			if (jsog.containsKey("firstName")) {
				core.String jsogObj = jsog["firstName"];
				if(jsogObj != null) {
					core.String valueaVE6ToM5BEeWKGIrSDzlNog;
					
					if(jsogObj!=null){
					valueaVE6ToM5BEeWKGIrSDzlNog = jsogObj.toString();
					}
					this._firstName = valueaVE6ToM5BEeWKGIrSDzlNog;
				}
				else {
					this._firstName = null;
				}
			}
			
			
			else{
				this._firstName = null;
			}
			_firstNameHasBeenSet = false;
			if (jsog.containsKey("image")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["image"];
				if(jsogObj != null) {
					FileReference valuea3QnzMM46EeWKGIrSDzlNog;
					
					if(jsogObj!=null){
					valuea3QnzMM46EeWKGIrSDzlNog = new FileReference(jsog: jsogObj);
					}
					this._image = valuea3QnzMM46EeWKGIrSDzlNog;
				}
				else {
					this._image = null;
				}
			}
			
			
			else{
				this._image = null;
			}
			_imageHasBeenSet = false;
			if (jsog.containsKey("lastName")) {
				core.String jsogObj = jsog["lastName"];
				if(jsogObj != null) {
					core.String valueaWYcYEM5BEeWKGIrSDzlNog;
					
					if(jsogObj!=null){
					valueaWYcYEM5BEeWKGIrSDzlNog = jsogObj.toString();
					}
					this._lastName = valueaWYcYEM5BEeWKGIrSDzlNog;
				}
				else {
					this._lastName = null;
				}
			}
			
			
			else{
				this._lastName = null;
			}
			_lastNameHasBeenSet = false;
			if (jsog.containsKey("password")) {
				core.String jsogObj = jsog["password"];
				if(jsogObj != null) {
					core.String valueaYIIgUMwNEeWZVvvwxpYu8A;
					
					if(jsogObj!=null){
					valueaYIIgUMwNEeWZVvvwxpYu8A = jsogObj.toString();
					}
					this._password = valueaYIIgUMwNEeWZVvvwxpYu8A;
				}
				else {
					this._password = null;
				}
			}
			
			
			else{
				this._password = null;
			}
			_passwordHasBeenSet = false;
			if (jsog.containsKey("username")) {
				core.String jsogObj = jsog["username"];
				if(jsogObj != null) {
					core.String valuea1aiCkG_QEeaqHezD6_45_M0AA;
					
					if(jsogObj!=null){
					valuea1aiCkG_QEeaqHezD6_45_M0AA = jsogObj.toString();
					}
					this._username = valuea1aiCkG_QEeaqHezD6_45_M0AA;
				}
				else {
					this._username = null;
				}
			}
			
			
			else{
				this._username = null;
			}
			_usernameHasBeenSet = false;
		}
	}
	
	void concreteUserHasBeenSetted() { _concreteUserHasBeenSet=true; }
	void firstNameHasBeenSetted() { _firstNameHasBeenSet=true; }
	void imageHasBeenSetted() { _imageHasBeenSet=true; }
	void lastNameHasBeenSetted() { _lastNameHasBeenSet=true; }
	void passwordHasBeenSetted() { _passwordHasBeenSet=true; }
	void usernameHasBeenSetted() { _usernameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_concreteUserHasBeenSet || 
					_firstNameHasBeenSet || 
					_imageHasBeenSet || 
					_lastNameHasBeenSet || 
					_passwordHasBeenSet || 
					_usernameHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( concreteUserHasBeenChanged() && !jsonObj.containsKey('concreteUser'))) {
			if(this._concreteUser.isEmpty){
				jsonObj["concreteUser"] = [];
			}
			else{
				jsonObj["concreteUser"] = this._concreteUser.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( passwordHasBeenChanged() && !jsonObj.containsKey('password')) && !objects.containsKey(this._password)) {
			jsonObj["password"] = this._password;
			}
			if(( imageHasBeenChanged() && !jsonObj.containsKey('image')) && !objects.containsKey(this._image)) {
			if(this._image != null) {
				jsonObj["image"] = this._image.toJSOG(objects);
			}
			else {
				jsonObj["image"] = null;
			}
			}
			if(( firstNameHasBeenChanged() && !jsonObj.containsKey('firstName')) && !objects.containsKey(this._firstName)) {
			jsonObj["firstName"] = this._firstName;
			}
			if(( lastNameHasBeenChanged() && !jsonObj.containsKey('lastName')) && !objects.containsKey(this._lastName)) {
			jsonObj["lastName"] = this._lastName;
			}
			if(( usernameHasBeenChanged() && !jsonObj.containsKey('username')) && !objects.containsKey(this._username)) {
			jsonObj["username"] = this._username;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.BaseUser";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( concreteUserHasBeenChanged() && !jsonObj.containsKey('concreteUser')) || this.dywa_id == 0) {
		if(this._concreteUser.isEmpty){
			jsonObj["concreteUser"] = [];
		}
		else{
			jsonObj["concreteUser"] = this._concreteUser.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( passwordHasBeenChanged() && !jsonObj.containsKey('password')) && !objects.containsKey(this._password) || this.dywa_id == 0) {
		jsonObj["password"] = this._password;
		}
		if(( imageHasBeenChanged() && !jsonObj.containsKey('image')) && !objects.containsKey(this._image) || this.dywa_id == 0) {
		if(this._image != null) {
			jsonObj["image"] = this._image.toJSOG(objects);
		}
		else {
			jsonObj["image"] = null;
		}
		}
		if(( firstNameHasBeenChanged() && !jsonObj.containsKey('firstName')) && !objects.containsKey(this._firstName) || this.dywa_id == 0) {
		jsonObj["firstName"] = this._firstName;
		}
		if(( lastNameHasBeenChanged() && !jsonObj.containsKey('lastName')) && !objects.containsKey(this._lastName) || this.dywa_id == 0) {
		jsonObj["lastName"] = this._lastName;
		}
		if(( usernameHasBeenChanged() && !jsonObj.containsKey('username')) && !objects.containsKey(this._username) || this.dywa_id == 0) {
		jsonObj["username"] = this._username;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static BaseUser fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.BaseUser') {
			return new BaseUser(cache:cache,jsog:jsog);
		}
		return new BaseUser(cache:cache,jsog:jsog);
	}
	
	void set concreteUser (DIMEList<ConcreteUser> value)
	{
		this._concreteUserHasBeenSet = true;
		this._concreteUser = value;
	}
	
	DIMEList<ConcreteUser> get concreteUser
	{
		return this._concreteUser;
	}
	
		DIMEList<ConcreteUser> initOnDemandconcreteUser()
		{
			if(this._concreteUser == null) {
			this._concreteUser = new DIMEList();
			}
			return this.concreteUser;
		}
		
		void setValueconcreteUser(DIMEList<ConcreteUser> value)
		{
			this.concreteUser = value;
		}
		
		void concreteUsersetValue(DIMEList<ConcreteUser> value)
		{
			this.concreteUser = value;
		}
		
		void concreteUseradd(ConcreteUser value)
		{
			this.concreteUser.add(value);
			this._concreteUserHasBeenSet = true;
		}

	
	void set password (core.String value)
	{
		this._passwordHasBeenSet = true;
		this._password = value;
	}
	
	core.String get password
	{
		return this._password;
	}
	
		core.String initOnDemandpassword()
		{
			return this.password;
		}
		
		void setValuepassword(core.String value)
		{
			this.password = value;
		}
		
		void passwordsetValue(core.String value)
		{
			this.password = value;
		}
		
	
	void set image (FileReference value)
	{
		this._imageHasBeenSet = true;
		this._image = value;
	}
	
	FileReference get image
	{
		return this._image;
	}
	
		FileReference initOnDemandimage()
		{
			return this.image;
		}
		
		void setValueimage(FileReference value)
		{
			this.image = value;
		}
		
		void imagesetValue(FileReference value)
		{
			this.image = value;
		}
		
	
	void set firstName (core.String value)
	{
		this._firstNameHasBeenSet = true;
		this._firstName = value;
	}
	
	core.String get firstName
	{
		return this._firstName;
	}
	
		core.String initOnDemandfirstName()
		{
			return this.firstName;
		}
		
		void setValuefirstName(core.String value)
		{
			this.firstName = value;
		}
		
		void firstNamesetValue(core.String value)
		{
			this.firstName = value;
		}
		
	
	void set lastName (core.String value)
	{
		this._lastNameHasBeenSet = true;
		this._lastName = value;
	}
	
	core.String get lastName
	{
		return this._lastName;
	}
	
		core.String initOnDemandlastName()
		{
			return this.lastName;
		}
		
		void setValuelastName(core.String value)
		{
			this.lastName = value;
		}
		
		void lastNamesetValue(core.String value)
		{
			this.lastName = value;
		}
		
	
	void set username (core.String value)
	{
		this._usernameHasBeenSet = true;
		this._username = value;
	}
	
	core.String get username
	{
		return this._username;
	}
	
		core.String initOnDemandusername()
		{
			return this.username;
		}
		
		void setValueusername(core.String value)
		{
			this.username = value;
		}
		
		void usernamesetValue(core.String value)
		{
			this.username = value;
		}
		
	
}

class Table extends BaseModel
{
	core.bool _gameStateHasBeenSet = false;
	core.bool gameStateHasBeenChanged() => _gameStateHasBeenSet||(_gameState==null?false:_gameState.hasChanged()) ;
	GameState _gameState;
	core.bool _isWinHasBeenSet = false;
	core.bool isWinHasBeenChanged() => _isWinHasBeenSet;
	core.bool _isWin;
	core.bool _moveCounterHasBeenSet = false;
	core.bool moveCounterHasBeenChanged() => _moveCounterHasBeenSet;
	core.int _moveCounter;
	core.bool _tableRowHasBeenSet = false;
	core.bool tableRowHasBeenChanged() => _tableRowHasBeenSet;
	DIMEList<TableRow> _tableRow;
	core.bool _turnStateHasBeenSet = false;
	core.bool turnStateHasBeenChanged() => _turnStateHasBeenSet||(_turnState==null?false:_turnState.hasChanged()) ;
	TurnState _turnState;
	core.bool _turnTextHasBeenSet = false;
	core.bool turnTextHasBeenChanged() => _turnTextHasBeenSet;
	core.String _turnText;
	
	static Table fromId(core.int id) {
		var m = new Table();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'gameState': this.gameState, 
	  'isWin': this.isWin, 
	  'moveCounter': this.moveCounter, 
	  'tableRow': this.tableRow, 
	  'turnState': this.turnState, 
	  'turnText': this.turnText
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'gameState': this.gameState = value; return;
	  case 'isWin': this.isWin = value; return;
	  case 'moveCounter': this.moveCounter = value; return;
	  case 'tableRow': this.tableRow = value; return;
	  case 'turnState': this.turnState = value; return;
	  case 'turnText': this.turnText = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Table({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._isWin = false;
			this._moveCounter = 0;
			this._tableRow = new DIMEList.monitored(tableRowHasBeenSetted);
			this._turnText = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("gameState")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["gameState"];
				if(jsogObj != null) {
					GameState valueaxyoQoX0oEe2_45_urIT6LmdwA;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaxyoQoX0oEe2_45_urIT6LmdwA = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.GameState") {
								valueaxyoQoX0oEe2_45_urIT6LmdwA = new GameState(cache: cache, jsog: jsogObj);
							}
							else {
								valueaxyoQoX0oEe2_45_urIT6LmdwA = new GameState(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaxyoQoX0oEe2_45_urIT6LmdwA = new GameState(cache: cache,jsog: jsogObj);
						}
					}
					this._gameState = valueaxyoQoX0oEe2_45_urIT6LmdwA;
				}
			}
			
			
			_gameStateHasBeenSet = false;
			if (jsog.containsKey("isWin")) {
				core.bool jsogObj = jsog["isWin"];
				if(jsogObj != null) {
					core.bool valueaDZYEEX1ZEe2BL67A2MFPXw;
					
					if(jsogObj!=null){
					valueaDZYEEX1ZEe2BL67A2MFPXw = jsogObj.toString().toLowerCase()=='true'?true:false;
					}
					this._isWin = valueaDZYEEX1ZEe2BL67A2MFPXw;
				}
				else {
					this._isWin = false;
				}
			}
			
			
			else{
				this._isWin = false;
			}
			_isWinHasBeenSet = false;
			if (jsog.containsKey("moveCounter")) {
				core.int jsogObj = jsog["moveCounter"];
				if(jsogObj != null) {
					core.int valueaypp_QX0oEe2_45_urIT6LmdwA;
					
					if(jsogObj!=null){
					valueaypp_QX0oEe2_45_urIT6LmdwA = core.int.parse(jsogObj.toString());
					}
					this._moveCounter = valueaypp_QX0oEe2_45_urIT6LmdwA;
				}
				else {
					this._moveCounter = 0;
				}
			}
			
			
			else{
				this._moveCounter = 0;
			}
			_moveCounterHasBeenSet = false;
			this._tableRow = new DIMEList.monitored(tableRowHasBeenSetted);
			if (jsog.containsKey("tableRow")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["tableRow"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					TableRow valueaQyVvAW8QEe2x_c6ogIlfZw;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaQyVvAW8QEe2x_c6ogIlfZw = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.TableRowImpl") {
								valueaQyVvAW8QEe2x_c6ogIlfZw = new TableRow(cache: cache, jsog: jsogObj);
							}
							else {
								valueaQyVvAW8QEe2x_c6ogIlfZw = new TableRow(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaQyVvAW8QEe2x_c6ogIlfZw = new TableRow(cache: cache,jsog: jsogObj);
						}
					}
					this._tableRow.add(valueaQyVvAW8QEe2x_c6ogIlfZw);
				}
			}
			
			
			_tableRowHasBeenSet = false;
			if (jsog.containsKey("turnState")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["turnState"];
				if(jsogObj != null) {
					TurnState valuea09OegXSPEe2vmrlDP84GiQ;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valuea09OegXSPEe2vmrlDP84GiQ = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.TurnState") {
								valuea09OegXSPEe2vmrlDP84GiQ = new TurnState(cache: cache, jsog: jsogObj);
							}
							else {
								valuea09OegXSPEe2vmrlDP84GiQ = new TurnState(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valuea09OegXSPEe2vmrlDP84GiQ = new TurnState(cache: cache,jsog: jsogObj);
						}
					}
					this._turnState = valuea09OegXSPEe2vmrlDP84GiQ;
				}
			}
			
			
			_turnStateHasBeenSet = false;
			if (jsog.containsKey("turnText")) {
				core.String jsogObj = jsog["turnText"];
				if(jsogObj != null) {
					core.String valuea0mk_45_4X3sEe2ONMPeQEJUSA;
					
					if(jsogObj!=null){
					valuea0mk_45_4X3sEe2ONMPeQEJUSA = jsogObj.toString();
					}
					this._turnText = valuea0mk_45_4X3sEe2ONMPeQEJUSA;
				}
				else {
					this._turnText = null;
				}
			}
			
			
			else{
				this._turnText = null;
			}
			_turnTextHasBeenSet = false;
		}
	}
	
	void gameStateHasBeenSetted() { _gameStateHasBeenSet=true; }
	void isWinHasBeenSetted() { _isWinHasBeenSet=true; }
	void moveCounterHasBeenSetted() { _moveCounterHasBeenSet=true; }
	void tableRowHasBeenSetted() { _tableRowHasBeenSet=true; }
	void turnStateHasBeenSetted() { _turnStateHasBeenSet=true; }
	void turnTextHasBeenSetted() { _turnTextHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_gameStateHasBeenSet || 
					_isWinHasBeenSet || 
					_moveCounterHasBeenSet || 
					_tableRowHasBeenSet || 
					_turnStateHasBeenSet || 
					_turnTextHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( tableRowHasBeenChanged() && !jsonObj.containsKey('tableRow'))) {
			if(this._tableRow.isEmpty){
				jsonObj["tableRow"] = [];
			}
			else{
				jsonObj["tableRow"] = this._tableRow.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( turnStateHasBeenChanged() && !jsonObj.containsKey('turnState')) && !objects.containsKey(this._turnState)) {
			if(this._turnState != null) {
				jsonObj["turnState"] = this._turnState.toJSOG(objects);
			}
			else {
				jsonObj["turnState"] = null;
			}
			}
			if(( gameStateHasBeenChanged() && !jsonObj.containsKey('gameState')) && !objects.containsKey(this._gameState)) {
			if(this._gameState != null) {
				jsonObj["gameState"] = this._gameState.toJSOG(objects);
			}
			else {
				jsonObj["gameState"] = null;
			}
			}
			if(( moveCounterHasBeenChanged() && !jsonObj.containsKey('moveCounter')) && !objects.containsKey(this._moveCounter)) {
			jsonObj["moveCounter"] = this._moveCounter;
			}
			if(( isWinHasBeenChanged() && !jsonObj.containsKey('isWin')) && !objects.containsKey(this._isWin)) {
			jsonObj["isWin"] = this._isWin;
			}
			if(( turnTextHasBeenChanged() && !jsonObj.containsKey('turnText')) && !objects.containsKey(this._turnText)) {
			jsonObj["turnText"] = this._turnText;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.TableImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( tableRowHasBeenChanged() && !jsonObj.containsKey('tableRow')) || this.dywa_id == 0) {
		if(this._tableRow.isEmpty){
			jsonObj["tableRow"] = [];
		}
		else{
			jsonObj["tableRow"] = this._tableRow.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( turnStateHasBeenChanged() && !jsonObj.containsKey('turnState')) && !objects.containsKey(this._turnState) || this.dywa_id == 0) {
		if(this._turnState != null) {
			jsonObj["turnState"] = this._turnState.toJSOG(objects);
		}
		else {
			jsonObj["turnState"] = null;
		}
		}
		if(( gameStateHasBeenChanged() && !jsonObj.containsKey('gameState')) && !objects.containsKey(this._gameState) || this.dywa_id == 0) {
		if(this._gameState != null) {
			jsonObj["gameState"] = this._gameState.toJSOG(objects);
		}
		else {
			jsonObj["gameState"] = null;
		}
		}
		if(( moveCounterHasBeenChanged() && !jsonObj.containsKey('moveCounter')) && !objects.containsKey(this._moveCounter) || this.dywa_id == 0) {
		jsonObj["moveCounter"] = this._moveCounter;
		}
		if(( isWinHasBeenChanged() && !jsonObj.containsKey('isWin')) && !objects.containsKey(this._isWin) || this.dywa_id == 0) {
		jsonObj["isWin"] = this._isWin;
		}
		if(( turnTextHasBeenChanged() && !jsonObj.containsKey('turnText')) && !objects.containsKey(this._turnText) || this.dywa_id == 0) {
		jsonObj["turnText"] = this._turnText;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Table fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.TableImpl') {
			return new Table(cache:cache,jsog:jsog);
		}
		return new Table(cache:cache,jsog:jsog);
	}
	
	void set tableRow (DIMEList<TableRow> value)
	{
		this._tableRowHasBeenSet = true;
		this._tableRow = value;
	}
	
	DIMEList<TableRow> get tableRow
	{
		return this._tableRow;
	}
	
		DIMEList<TableRow> initOnDemandtableRow()
		{
			if(this._tableRow == null) {
			this._tableRow = new DIMEList();
			}
			return this.tableRow;
		}
		
		void setValuetableRow(DIMEList<TableRow> value)
		{
			this.tableRow = value;
		}
		
		void tableRowsetValue(DIMEList<TableRow> value)
		{
			this.tableRow = value;
		}
		
		void tableRowadd(TableRow value)
		{
			this.tableRow.add(value);
			this._tableRowHasBeenSet = true;
		}

	
	void set turnState (TurnState value)
	{
		this._turnStateHasBeenSet = true;
		this._turnState = value;
	}
	
	TurnState get turnState
	{
		return this._turnState;
	}
	
		TurnState initOnDemandturnState()
		{
			if(this._turnState == null) {
			this.turnState = new TurnState();
			}
			return this.turnState;
		}
		
		void setValueturnState(TurnState value)
		{
			this.turnState = value;
		}
		
		void turnStatesetValue(TurnState value)
		{
			this.turnState = value;
		}
		
	
	void set gameState (GameState value)
	{
		this._gameStateHasBeenSet = true;
		this._gameState = value;
	}
	
	GameState get gameState
	{
		return this._gameState;
	}
	
		GameState initOnDemandgameState()
		{
			if(this._gameState == null) {
			this.gameState = new GameState();
			}
			return this.gameState;
		}
		
		void setValuegameState(GameState value)
		{
			this.gameState = value;
		}
		
		void gameStatesetValue(GameState value)
		{
			this.gameState = value;
		}
		
	
	void set moveCounter (core.int value)
	{
		this._moveCounterHasBeenSet = true;
		this._moveCounter = value;
	}
	
	core.int get moveCounter
	{
		return this._moveCounter;
	}
	
		core.int initOnDemandmoveCounter()
		{
			return this.moveCounter;
		}
		
		void setValuemoveCounter(core.int value)
		{
			this.moveCounter = value;
		}
		
		void moveCountersetValue(core.int value)
		{
			this.moveCounter = value;
		}
		
	
	void set isWin (core.bool value)
	{
		this._isWinHasBeenSet = true;
		this._isWin = value;
	}
	
	core.bool get isWin
	{
		return this._isWin;
	}
	
		core.bool initOnDemandisWin()
		{
			return this.isWin;
		}
		
		void setValueisWin(core.bool value)
		{
			this.isWin = value;
		}
		
		void isWinsetValue(core.bool value)
		{
			this.isWin = value;
		}
		
	
	void set turnText (core.String value)
	{
		this._turnTextHasBeenSet = true;
		this._turnText = value;
	}
	
	core.String get turnText
	{
		return this._turnText;
	}
	
		core.String initOnDemandturnText()
		{
			return this.turnText;
		}
		
		void setValueturnText(core.String value)
		{
			this.turnText = value;
		}
		
		void turnTextsetValue(core.String value)
		{
			this.turnText = value;
		}
		
	
}

class TableRow extends BaseModel
{
	core.bool _tableEntryHasBeenSet = false;
	core.bool tableEntryHasBeenChanged() => _tableEntryHasBeenSet;
	DIMEList<TableEntry> _tableEntry;
	
	static TableRow fromId(core.int id) {
		var m = new TableRow();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'tableEntry': this.tableEntry
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'tableEntry': this.tableEntry = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	TableRow({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._tableEntry = new DIMEList.monitored(tableEntryHasBeenSetted);
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			this._tableEntry = new DIMEList.monitored(tableEntryHasBeenSetted);
			if (jsog.containsKey("tableEntry")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["tableEntry"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					TableEntry valueaRMkz8W8QEe2x_c6ogIlfZw;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaRMkz8W8QEe2x_c6ogIlfZw = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.TableEntryImpl") {
								valueaRMkz8W8QEe2x_c6ogIlfZw = new TableEntry(cache: cache, jsog: jsogObj);
							}
							else {
								valueaRMkz8W8QEe2x_c6ogIlfZw = new TableEntry(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaRMkz8W8QEe2x_c6ogIlfZw = new TableEntry(cache: cache,jsog: jsogObj);
						}
					}
					this._tableEntry.add(valueaRMkz8W8QEe2x_c6ogIlfZw);
				}
			}
			
			
			_tableEntryHasBeenSet = false;
		}
	}
	
	void tableEntryHasBeenSetted() { _tableEntryHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_tableEntryHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( tableEntryHasBeenChanged() && !jsonObj.containsKey('tableEntry'))) {
			if(this._tableEntry.isEmpty){
				jsonObj["tableEntry"] = [];
			}
			else{
				jsonObj["tableEntry"] = this._tableEntry.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.TableRowImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( tableEntryHasBeenChanged() && !jsonObj.containsKey('tableEntry')) || this.dywa_id == 0) {
		if(this._tableEntry.isEmpty){
			jsonObj["tableEntry"] = [];
		}
		else{
			jsonObj["tableEntry"] = this._tableEntry.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static TableRow fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.TableRowImpl') {
			return new TableRow(cache:cache,jsog:jsog);
		}
		return new TableRow(cache:cache,jsog:jsog);
	}
	
	void set tableEntry (DIMEList<TableEntry> value)
	{
		this._tableEntryHasBeenSet = true;
		this._tableEntry = value;
	}
	
	DIMEList<TableEntry> get tableEntry
	{
		return this._tableEntry;
	}
	
		DIMEList<TableEntry> initOnDemandtableEntry()
		{
			if(this._tableEntry == null) {
			this._tableEntry = new DIMEList();
			}
			return this.tableEntry;
		}
		
		void setValuetableEntry(DIMEList<TableEntry> value)
		{
			this.tableEntry = value;
		}
		
		void tableEntrysetValue(DIMEList<TableEntry> value)
		{
			this.tableEntry = value;
		}
		
		void tableEntryadd(TableEntry value)
		{
			this.tableEntry.add(value);
			this._tableEntryHasBeenSet = true;
		}

	
}

class TableEntry extends BaseModel
{
	core.bool _entryStateHasBeenSet = false;
	core.bool entryStateHasBeenChanged() => _entryStateHasBeenSet||(_entryState==null?false:_entryState.hasChanged()) ;
	EntryState _entryState;
	core.bool _stateValueHasBeenSet = false;
	core.bool stateValueHasBeenChanged() => _stateValueHasBeenSet;
	core.int _stateValue;
	core.bool _winningEntryHasBeenSet = false;
	core.bool winningEntryHasBeenChanged() => _winningEntryHasBeenSet;
	core.bool _winningEntry;
	
	static TableEntry fromId(core.int id) {
		var m = new TableEntry();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'entryState': this.entryState, 
	  'stateValue': this.stateValue, 
	  'winningEntry': this.winningEntry
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'entryState': this.entryState = value; return;
	  case 'stateValue': this.stateValue = value; return;
	  case 'winningEntry': this.winningEntry = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	TableEntry({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._stateValue = 0;
			this._winningEntry = false;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("entryState")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["entryState"];
				if(jsogObj != null) {
					EntryState valueasuTD4XKPEe2rzNRUfilttw;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueasuTD4XKPEe2rzNRUfilttw = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.EntryState") {
								valueasuTD4XKPEe2rzNRUfilttw = new EntryState(cache: cache, jsog: jsogObj);
							}
							else {
								valueasuTD4XKPEe2rzNRUfilttw = new EntryState(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueasuTD4XKPEe2rzNRUfilttw = new EntryState(cache: cache,jsog: jsogObj);
						}
					}
					this._entryState = valueasuTD4XKPEe2rzNRUfilttw;
				}
			}
			
			
			_entryStateHasBeenSet = false;
			if (jsog.containsKey("stateValue")) {
				core.int jsogObj = jsog["stateValue"];
				if(jsogObj != null) {
					core.int valueaRwbu8W8QEe2x_c6ogIlfZw;
					
					if(jsogObj!=null){
					valueaRwbu8W8QEe2x_c6ogIlfZw = core.int.parse(jsogObj.toString());
					}
					this._stateValue = valueaRwbu8W8QEe2x_c6ogIlfZw;
				}
				else {
					this._stateValue = 0;
				}
			}
			
			
			else{
				this._stateValue = 0;
			}
			_stateValueHasBeenSet = false;
			if (jsog.containsKey("winningEntry")) {
				core.bool jsogObj = jsog["winningEntry"];
				if(jsogObj != null) {
					core.bool valueaVmhqYX3wEe2ONMPeQEJUSA;
					
					if(jsogObj!=null){
					valueaVmhqYX3wEe2ONMPeQEJUSA = jsogObj.toString().toLowerCase()=='true'?true:false;
					}
					this._winningEntry = valueaVmhqYX3wEe2ONMPeQEJUSA;
				}
				else {
					this._winningEntry = false;
				}
			}
			
			
			else{
				this._winningEntry = false;
			}
			_winningEntryHasBeenSet = false;
		}
	}
	
	void entryStateHasBeenSetted() { _entryStateHasBeenSet=true; }
	void stateValueHasBeenSetted() { _stateValueHasBeenSet=true; }
	void winningEntryHasBeenSetted() { _winningEntryHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_entryStateHasBeenSet || 
					_stateValueHasBeenSet || 
					_winningEntryHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( entryStateHasBeenChanged() && !jsonObj.containsKey('entryState')) && !objects.containsKey(this._entryState)) {
			if(this._entryState != null) {
				jsonObj["entryState"] = this._entryState.toJSOG(objects);
			}
			else {
				jsonObj["entryState"] = null;
			}
			}
			if(( stateValueHasBeenChanged() && !jsonObj.containsKey('stateValue')) && !objects.containsKey(this._stateValue)) {
			jsonObj["stateValue"] = this._stateValue;
			}
			if(( winningEntryHasBeenChanged() && !jsonObj.containsKey('winningEntry')) && !objects.containsKey(this._winningEntry)) {
			jsonObj["winningEntry"] = this._winningEntry;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.TableEntryImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( entryStateHasBeenChanged() && !jsonObj.containsKey('entryState')) && !objects.containsKey(this._entryState) || this.dywa_id == 0) {
		if(this._entryState != null) {
			jsonObj["entryState"] = this._entryState.toJSOG(objects);
		}
		else {
			jsonObj["entryState"] = null;
		}
		}
		if(( stateValueHasBeenChanged() && !jsonObj.containsKey('stateValue')) && !objects.containsKey(this._stateValue) || this.dywa_id == 0) {
		jsonObj["stateValue"] = this._stateValue;
		}
		if(( winningEntryHasBeenChanged() && !jsonObj.containsKey('winningEntry')) && !objects.containsKey(this._winningEntry) || this.dywa_id == 0) {
		jsonObj["winningEntry"] = this._winningEntry;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static TableEntry fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.TableEntryImpl') {
			return new TableEntry(cache:cache,jsog:jsog);
		}
		return new TableEntry(cache:cache,jsog:jsog);
	}
	
	void set entryState (EntryState value)
	{
		this._entryStateHasBeenSet = true;
		this._entryState = value;
	}
	
	EntryState get entryState
	{
		return this._entryState;
	}
	
		EntryState initOnDemandentryState()
		{
			if(this._entryState == null) {
			this.entryState = new EntryState();
			}
			return this.entryState;
		}
		
		void setValueentryState(EntryState value)
		{
			this.entryState = value;
		}
		
		void entryStatesetValue(EntryState value)
		{
			this.entryState = value;
		}
		
	
	void set stateValue (core.int value)
	{
		this._stateValueHasBeenSet = true;
		this._stateValue = value;
	}
	
	core.int get stateValue
	{
		return this._stateValue;
	}
	
		core.int initOnDemandstateValue()
		{
			return this.stateValue;
		}
		
		void setValuestateValue(core.int value)
		{
			this.stateValue = value;
		}
		
		void stateValuesetValue(core.int value)
		{
			this.stateValue = value;
		}
		
	
	void set winningEntry (core.bool value)
	{
		this._winningEntryHasBeenSet = true;
		this._winningEntry = value;
	}
	
	core.bool get winningEntry
	{
		return this._winningEntry;
	}
	
		core.bool initOnDemandwinningEntry()
		{
			return this.winningEntry;
		}
		
		void setValuewinningEntry(core.bool value)
		{
			this.winningEntry = value;
		}
		
		void winningEntrysetValue(core.bool value)
		{
			this.winningEntry = value;
		}
		
	
}

class EntryState extends BaseModel
{
	core.bool _dywaDisplayNameHasBeenSet = false;
	core.bool dywaDisplayNameHasBeenChanged() => _dywaDisplayNameHasBeenSet;
	core.String _dywaDisplayName;
	
	static EntryState fromId(core.int id) {
		var m = new EntryState();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'dywaDisplayName': this.dywaDisplayName
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'dywaDisplayName': this.dywaDisplayName = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	EntryState({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._dywaDisplayName = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("dywaDisplayName")) {
				core.String jsogObj = jsog["dywaDisplayName"];
				if(jsogObj != null) {
					core.String valueaJp_KcX3xEe2ONMPeQEJUSA;
					
					if(jsogObj!=null){
					valueaJp_KcX3xEe2ONMPeQEJUSA = jsogObj.toString();
					}
					this._dywaDisplayName = valueaJp_KcX3xEe2ONMPeQEJUSA;
				}
				else {
					this._dywaDisplayName = null;
				}
			}
			
			
			else{
				this._dywaDisplayName = null;
			}
			_dywaDisplayNameHasBeenSet = false;
		}
	}
	
	void dywaDisplayNameHasBeenSetted() { _dywaDisplayNameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_dywaDisplayNameHasBeenSet
			;
	}
	
	core.String toString() {
		switch(this.dywa_name) {
			case 'X':
				return "X";
			case 'O':
				return "O";
			case 'empty':
				return "empty";
		}
	    	return this.dywa_name;
	  	}
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName)) {
			jsonObj["dywaDisplayName"] = this._dywaDisplayName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.EntryState";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName) || this.dywa_id == 0) {
		jsonObj["dywaDisplayName"] = this._dywaDisplayName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static EntryState fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.EntryState') {
			return new EntryState(cache:cache,jsog:jsog);
		}
		return new EntryState(cache:cache,jsog:jsog);
	}
	
	void set dywaDisplayName (core.String value)
	{
		this._dywaDisplayNameHasBeenSet = true;
		this._dywaDisplayName = value;
	}
	
	core.String get dywaDisplayName
	{
		return this._dywaDisplayName;
	}
	
		core.String initOnDemanddywaDisplayName()
		{
			return this.dywaDisplayName;
		}
		
		void setValuedywaDisplayName(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
		void dywaDisplayNamesetValue(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
	
}

class TurnState extends BaseModel
{
	core.bool _dywaDisplayNameHasBeenSet = false;
	core.bool dywaDisplayNameHasBeenChanged() => _dywaDisplayNameHasBeenSet;
	core.String _dywaDisplayName;
	
	static TurnState fromId(core.int id) {
		var m = new TurnState();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'dywaDisplayName': this.dywaDisplayName
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'dywaDisplayName': this.dywaDisplayName = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	TurnState({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._dywaDisplayName = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("dywaDisplayName")) {
				core.String jsogObj = jsog["dywaDisplayName"];
				if(jsogObj != null) {
					core.String valueaJqI7cX3xEe2ONMPeQEJUSA;
					
					if(jsogObj!=null){
					valueaJqI7cX3xEe2ONMPeQEJUSA = jsogObj.toString();
					}
					this._dywaDisplayName = valueaJqI7cX3xEe2ONMPeQEJUSA;
				}
				else {
					this._dywaDisplayName = null;
				}
			}
			
			
			else{
				this._dywaDisplayName = null;
			}
			_dywaDisplayNameHasBeenSet = false;
		}
	}
	
	void dywaDisplayNameHasBeenSetted() { _dywaDisplayNameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_dywaDisplayNameHasBeenSet
			;
	}
	
	core.String toString() {
		switch(this.dywa_name) {
			case 'X':
				return "X";
			case 'O':
				return "O";
		}
	    	return this.dywa_name;
	  	}
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName)) {
			jsonObj["dywaDisplayName"] = this._dywaDisplayName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.TurnState";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName) || this.dywa_id == 0) {
		jsonObj["dywaDisplayName"] = this._dywaDisplayName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static TurnState fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.TurnState') {
			return new TurnState(cache:cache,jsog:jsog);
		}
		return new TurnState(cache:cache,jsog:jsog);
	}
	
	void set dywaDisplayName (core.String value)
	{
		this._dywaDisplayNameHasBeenSet = true;
		this._dywaDisplayName = value;
	}
	
	core.String get dywaDisplayName
	{
		return this._dywaDisplayName;
	}
	
		core.String initOnDemanddywaDisplayName()
		{
			return this.dywaDisplayName;
		}
		
		void setValuedywaDisplayName(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
		void dywaDisplayNamesetValue(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
	
}

class GameState extends BaseModel
{
	core.bool _dywaDisplayNameHasBeenSet = false;
	core.bool dywaDisplayNameHasBeenChanged() => _dywaDisplayNameHasBeenSet;
	core.String _dywaDisplayName;
	
	static GameState fromId(core.int id) {
		var m = new GameState();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'dywaDisplayName': this.dywaDisplayName
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'dywaDisplayName': this.dywaDisplayName = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	GameState({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._dywaDisplayName = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("dywaDisplayName")) {
				core.String jsogObj = jsog["dywaDisplayName"];
				if(jsogObj != null) {
					core.String valueaJqSscX3xEe2ONMPeQEJUSA;
					
					if(jsogObj!=null){
					valueaJqSscX3xEe2ONMPeQEJUSA = jsogObj.toString();
					}
					this._dywaDisplayName = valueaJqSscX3xEe2ONMPeQEJUSA;
				}
				else {
					this._dywaDisplayName = null;
				}
			}
			
			
			else{
				this._dywaDisplayName = null;
			}
			_dywaDisplayNameHasBeenSet = false;
		}
	}
	
	void dywaDisplayNameHasBeenSetted() { _dywaDisplayNameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_dywaDisplayNameHasBeenSet
			;
	}
	
	core.String toString() {
		switch(this.dywa_name) {
			case 'win':
				return "win";
			case 'tie':
				return "tie";
			case 'progress':
				return "progress";
		}
	    	return this.dywa_name;
	  	}
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName)) {
			jsonObj["dywaDisplayName"] = this._dywaDisplayName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.GameState";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName) || this.dywa_id == 0) {
		jsonObj["dywaDisplayName"] = this._dywaDisplayName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static GameState fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.GameState') {
			return new GameState(cache:cache,jsog:jsog);
		}
		return new GameState(cache:cache,jsog:jsog);
	}
	
	void set dywaDisplayName (core.String value)
	{
		this._dywaDisplayNameHasBeenSet = true;
		this._dywaDisplayName = value;
	}
	
	core.String get dywaDisplayName
	{
		return this._dywaDisplayName;
	}
	
		core.String initOnDemanddywaDisplayName()
		{
			return this.dywaDisplayName;
		}
		
		void setValuedywaDisplayName(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
		void dywaDisplayNamesetValue(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
	
}
