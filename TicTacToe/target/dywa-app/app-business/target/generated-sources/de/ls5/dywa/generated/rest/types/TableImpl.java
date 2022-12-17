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

	private TurnState
	 turnState;
	private boolean isturnStateSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("turnState")
	@info.scce.dime.rest.JsonRenderIndicator("isturnStateSet")
	@java.lang.Override
	public TurnState
	 getturnState() {
		return this.turnState;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isturnStateSet() {
		return this.isturnStateSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("turnState")
	@java.lang.Override
	public void setturnState(final TurnState
	 turnState) {
		this.turnState = turnState;
		this.isturnStateSet = true;
	}

	private GameState
	 gameState;
	private boolean isgameStateSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("gameState")
	@info.scce.dime.rest.JsonRenderIndicator("isgameStateSet")
	@java.lang.Override
	public GameState
	 getgameState() {
		return this.gameState;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isgameStateSet() {
		return this.isgameStateSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("gameState")
	@java.lang.Override
	public void setgameState(final GameState
	 gameState) {
		this.gameState = gameState;
		this.isgameStateSet = true;
	}

	private java.lang.Long
	 moveCounter;
	private boolean ismoveCounterSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("moveCounter")
	@info.scce.dime.rest.JsonRenderIndicator("ismoveCounterSet")
	@java.lang.Override
	public java.lang.Long
	 getmoveCounter() {
		return this.moveCounter;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean ismoveCounterSet() {
		return this.ismoveCounterSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("moveCounter")
	@java.lang.Override
	public void setmoveCounter(final java.lang.Long
	 moveCounter) {
		this.moveCounter = moveCounter;
		this.ismoveCounterSet = true;
	}

	private java.lang.Boolean
	 isWin;
	private boolean isisWinSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("isWin")
	@info.scce.dime.rest.JsonRenderIndicator("isisWinSet")
	@java.lang.Override
	public java.lang.Boolean
	 getisWin() {
		return this.isWin;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isisWinSet() {
		return this.isisWinSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("isWin")
	@java.lang.Override
	public void setisWin(final java.lang.Boolean
	 isWin) {
		this.isWin = isWin;
		this.isisWinSet = true;
	}

	private java.lang.String
	 turnText;
	private boolean isturnTextSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("turnText")
	@info.scce.dime.rest.JsonRenderIndicator("isturnTextSet")
	@java.lang.Override
	public java.lang.String
	 getturnText() {
		return this.turnText;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isturnTextSet() {
		return this.isturnTextSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("turnText")
	@java.lang.Override
	public void setturnText(final java.lang.String
	 turnText) {
		this.turnText = turnText;
		this.isturnTextSet = true;
	}

	
}
