package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class TableImpl extends info.scce.dime.rest.RESTBaseImpl implements Table
 {

	private java.util.List<
	Row
	>
	 row = new java.util.LinkedList<>();
	private boolean isrowSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("row")
	@info.scce.dime.rest.JsonRenderIndicator("isrow_RowSet")
	@java.lang.Override
	public java.util.List<
	Row
	>
	 getrow_Row() {
		return this.row;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isrow_RowSet() {
		return this.isrowSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("row")
	@java.lang.Override
	public void setrow_Row(final java.util.List<
	Row
	>
	 row) {
		this.row = row;
		this.isrowSet = true;
	}

	
}
