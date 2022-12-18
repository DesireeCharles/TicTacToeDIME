package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class TableEntryImpl extends info.scce.dime.rest.RESTBaseImpl implements TableEntry
 {

	private EntryState
	 entryState;
	private boolean isentryStateSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("entryState")
	@info.scce.dime.rest.JsonRenderIndicator("isentryStateSet")
	@java.lang.Override
	public EntryState
	 getentryState() {
		return this.entryState;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isentryStateSet() {
		return this.isentryStateSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("entryState")
	@java.lang.Override
	public void setentryState(final EntryState
	 entryState) {
		this.entryState = entryState;
		this.isentryStateSet = true;
	}

	private java.lang.Long
	 stateValue;
	private boolean isstateValueSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("stateValue")
	@info.scce.dime.rest.JsonRenderIndicator("isstateValueSet")
	@java.lang.Override
	public java.lang.Long
	 getstateValue() {
		return this.stateValue;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isstateValueSet() {
		return this.isstateValueSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("stateValue")
	@java.lang.Override
	public void setstateValue(final java.lang.Long
	 stateValue) {
		this.stateValue = stateValue;
		this.isstateValueSet = true;
	}

	
}
