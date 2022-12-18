package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class LeaderboardImpl extends info.scce.dime.rest.RESTBaseImpl implements Leaderboard
 {

	private java.lang.Long
	 xWins;
	private boolean isxWinsSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("xWins")
	@info.scce.dime.rest.JsonRenderIndicator("isxWinsSet")
	@java.lang.Override
	public java.lang.Long
	 getxWins() {
		return this.xWins;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isxWinsSet() {
		return this.isxWinsSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("xWins")
	@java.lang.Override
	public void setxWins(final java.lang.Long
	 xWins) {
		this.xWins = xWins;
		this.isxWinsSet = true;
	}

	private java.lang.Long
	 oWins;
	private boolean isoWinsSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("oWins")
	@info.scce.dime.rest.JsonRenderIndicator("isoWinsSet")
	@java.lang.Override
	public java.lang.Long
	 getoWins() {
		return this.oWins;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isoWinsSet() {
		return this.isoWinsSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("oWins")
	@java.lang.Override
	public void setoWins(final java.lang.Long
	 oWins) {
		this.oWins = oWins;
		this.isoWinsSet = true;
	}

	
}
