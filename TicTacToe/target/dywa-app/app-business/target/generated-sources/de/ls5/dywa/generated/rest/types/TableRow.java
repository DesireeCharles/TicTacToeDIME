package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface TableRow extends info.scce.dime.rest.RESTBaseType  {

	java.util.List<
	TableEntry
	>
	 gettableEntry_TableEntry();
	boolean istableEntry_TableEntrySet();

	void settableEntry_TableEntry(final java.util.List<
	TableEntry
	>
	 tableEntry);

	public static TableRow fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final TableRow result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow) {
			result = new de.ls5.dywa.generated.rest.types.TableRowImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
