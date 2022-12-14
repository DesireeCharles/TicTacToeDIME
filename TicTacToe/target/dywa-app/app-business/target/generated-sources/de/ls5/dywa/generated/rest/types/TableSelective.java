// generated by SelectiveGenerator#generateFullSelective(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class TableSelective {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table from,
		final de.ls5.dywa.generated.rest.types.Table to,
		final info.scce.dime.rest.ObjectCache objectCache) {


		if (objectCache.containsSelective(to, "TableSelective")) {
			return;
		}

		to.setDywaId(from.getDywaId());

		// put to cache, after id has been set
		objectCache.putSelective(to, "TableSelective");

		// non-transient objects can be fetched completely from the DB
		if (from.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
			return;
		}

		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());

		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow>
		 source = effectiveFrom.gettableRow_TableRow();
		final java.util.List<de.ls5.dywa.generated.rest.types.TableRow>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow
		 s : source) {
			// original selective: TableRowSelective
			de.ls5.dywa.generated.rest.types.TableRow cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.TableRow.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "TableRowSelective")) {
				de.ls5.dywa.generated.rest.types.TableRowSelective.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.settableRow_TableRow(target);
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState
		 source = effectiveFrom.getturnState();
		if (source != null) {
			// original selective: TurnStateSelective
			de.ls5.dywa.generated.rest.types.TurnState cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.TurnState.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "TurnStateSelective")) {
				de.ls5.dywa.generated.rest.types.TurnStateSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setturnState(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState
		 source = effectiveFrom.getgameState();
		if (source != null) {
			// original selective: GameStateSelective
			de.ls5.dywa.generated.rest.types.GameState cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.GameState.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "GameStateSelective")) {
				de.ls5.dywa.generated.rest.types.GameStateSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setgameState(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		effectiveTo.setmoveCounter(effectiveFrom.getmoveCounter());
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		effectiveTo.setisWin(effectiveFrom.getisWin());
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		effectiveTo.setturnText(effectiveFrom.getturnText());
		}
	}
}
