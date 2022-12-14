package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface TableEntry extends info.scce.dime.rest.RESTBaseType  {

	EntryState
	 getentryState();
	boolean isentryStateSet();

	void setentryState(final EntryState
	 entryState);
	java.lang.Long
	 getstateValue();
	boolean isstateValueSet();

	void setstateValue(final java.lang.Long
	 stateValue);

	public static TableEntry fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final TableEntry result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry) {
			result = new de.ls5.dywa.generated.rest.types.TableEntryImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
