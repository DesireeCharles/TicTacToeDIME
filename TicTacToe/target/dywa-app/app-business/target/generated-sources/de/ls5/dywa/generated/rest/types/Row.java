package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Row extends info.scce.dime.rest.RESTBaseType  {

	java.util.List<
	Entry
	>
	 getentry_Entry();
	boolean isentry_EntrySet();

	void setentry_Entry(final java.util.List<
	Entry
	>
	 entry);

	public static Row fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Row entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Row result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Row) {
			result = new de.ls5.dywa.generated.rest.types.RowImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
