package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class TableRowImpl extends info.scce.dime.rest.RESTBaseImpl implements TableRow
 {

	private java.util.List<
	TableEntry
	>
	 tableEntry = new java.util.LinkedList<>();
	private boolean istableEntrySet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("tableEntry")
	@info.scce.dime.rest.JsonRenderIndicator("istableEntry_TableEntrySet")
	@java.lang.Override
	public java.util.List<
	TableEntry
	>
	 gettableEntry_TableEntry() {
		return this.tableEntry;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean istableEntry_TableEntrySet() {
		return this.istableEntrySet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("tableEntry")
	@java.lang.Override
	public void settableEntry_TableEntry(final java.util.List<
	TableEntry
	>
	 tableEntry) {
		this.tableEntry = tableEntry;
		this.istableEntrySet = true;
	}

	
}
