package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class TableImpl extends info.scce.dime.rest.RESTBaseImpl implements Table
 {

	private java.util.List<
	TableRow
	>
	 tableRow = new java.util.LinkedList<>();
	private boolean istableRowSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("tableRow")
	@info.scce.dime.rest.JsonRenderIndicator("istableRow_TableRowSet")
	@java.lang.Override
	public java.util.List<
	TableRow
	>
	 gettableRow_TableRow() {
		return this.tableRow;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean istableRow_TableRowSet() {
		return this.istableRowSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("tableRow")
	@java.lang.Override
	public void settableRow_TableRow(final java.util.List<
	TableRow
	>
	 tableRow) {
		this.tableRow = tableRow;
		this.istableRowSet = true;
	}

	
}
