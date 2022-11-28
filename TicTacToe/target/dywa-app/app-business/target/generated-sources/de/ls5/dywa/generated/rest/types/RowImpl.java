package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class RowImpl extends info.scce.dime.rest.RESTBaseImpl implements Row
 {

	private java.util.List<
	Entry
	>
	 entry = new java.util.LinkedList<>();
	private boolean isentrySet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("entry")
	@info.scce.dime.rest.JsonRenderIndicator("isentry_EntrySet")
	@java.lang.Override
	public java.util.List<
	Entry
	>
	 getentry_Entry() {
		return this.entry;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isentry_EntrySet() {
		return this.isentrySet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("entry")
	@java.lang.Override
	public void setentry_Entry(final java.util.List<
	Entry
	>
	 entry) {
		this.entry = entry;
		this.isentrySet = true;
	}

	
}
