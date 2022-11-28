package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class EntryImpl extends info.scce.dime.rest.RESTBaseImpl implements Entry
 {

	private java.lang.String
	 condition;
	private boolean isconditionSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("condition")
	@info.scce.dime.rest.JsonRenderIndicator("isconditionSet")
	@java.lang.Override
	public java.lang.String
	 getcondition() {
		return this.condition;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isconditionSet() {
		return this.isconditionSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("condition")
	@java.lang.Override
	public void setcondition(final java.lang.String
	 condition) {
		this.condition = condition;
		this.isconditionSet = true;
	}

	
}
