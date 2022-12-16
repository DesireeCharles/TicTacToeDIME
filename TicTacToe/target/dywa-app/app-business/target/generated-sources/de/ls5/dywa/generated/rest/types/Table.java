package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Table extends info.scce.dime.rest.RESTBaseType  {

	java.util.List<
	TableRow
	>
	 gettableRow_TableRow();
	boolean istableRow_TableRowSet();

	void settableRow_TableRow(final java.util.List<
	TableRow
	>
	 tableRow);
	TurnState
	 getturnState();
	boolean isturnStateSet();

	void setturnState(final TurnState
	 turnState);
	GameState
	 getgameState();
	boolean isgameStateSet();

	void setgameState(final GameState
	 gameState);
	java.lang.Long
	 getmoveCounter();
	boolean ismoveCounterSet();

	void setmoveCounter(final java.lang.Long
	 moveCounter);
	java.lang.Boolean
	 getisWin();
	boolean isisWinSet();

	void setisWin(final java.lang.Boolean
	 isWin);

	public static Table fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Table result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table) {
			result = new de.ls5.dywa.generated.rest.types.TableImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
