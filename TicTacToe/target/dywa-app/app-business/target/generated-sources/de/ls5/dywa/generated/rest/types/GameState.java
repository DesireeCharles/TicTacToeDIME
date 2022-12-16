package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class GameState extends info.scce.dime.rest.RESTBaseImpl implements info.scce.dime.rest.RESTBaseType
 {

	private java.lang.String
	 dywaDisplayName;
	private boolean isdywaDisplayNameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("dywaDisplayName")
	@info.scce.dime.rest.JsonRenderIndicator("isdywaDisplayNameSet")
	public java.lang.String
	 getdywaDisplayName() {
		return this.dywaDisplayName;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isdywaDisplayNameSet() {
		return this.isdywaDisplayNameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("dywaDisplayName")
	public void setdywaDisplayName(final java.lang.String
	 dywaDisplayName) {
		this.dywaDisplayName = dywaDisplayName;
		this.isdywaDisplayNameSet = true;
	}

	
	public static GameState fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final GameState result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState) {
			result = new de.ls5.dywa.generated.rest.types.GameState();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
