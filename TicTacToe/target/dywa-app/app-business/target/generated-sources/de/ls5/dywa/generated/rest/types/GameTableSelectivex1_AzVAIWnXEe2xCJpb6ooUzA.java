// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class GameTableSelectivex1_AzVAIWnXEe2xCJpb6ooUzA {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table from,
		final de.ls5.dywa.generated.rest.types.Table to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "GameTableSelectivex1_AzVAIWnXEe2xCJpb6ooUzA")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "GameTableSelectivex1_AzVAIWnXEe2xCJpb6ooUzA");
	
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow>
		 source = effectiveFrom.gettableRow_TableRow();
		final java.util.List<de.ls5.dywa.generated.rest.types.TableRow>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow
		 s : source) {
			// original selective: GameTableRowSelectivex1x1x1_AzVAIWnXEe2xCJpb6ooUzA
			de.ls5.dywa.generated.rest.types.TableRow cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.TableRow.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "GameTableRowSelectivex1x1x1_AzVAIWnXEe2xCJpb6ooUzA")) {
				de.ls5.dywa.generated.rest.types.GameTableRowSelectivex1x1x1_AzVAIWnXEe2xCJpb6ooUzA.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.settableRow_TableRow(target);
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		effectiveTo.setisWin(effectiveFrom.getisWin());
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState
		 source = effectiveFrom.getgameState();
		if (source != null) {
			// original selective: GameGameStateSelectivex1x3_AzVAIWnXEe2xCJpb6ooUzA
			de.ls5.dywa.generated.rest.types.GameState cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.GameState.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "GameStateGameStateSelectivex1x1x1_0WZ_gH0pEe2__HYPHEN_MINUS__urIT6LmdwA")) {
				de.ls5.dywa.generated.rest.types.GameStateGameStateSelectivex1x1x1_0WZ_gH0pEe2__HYPHEN_MINUS__urIT6LmdwA.copy(source, cached, objectCache);
			}
		
			effectiveTo.setgameState(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Table effectiveTo = to;
		effectiveTo.setturnText(effectiveFrom.getturnText());
		}
	}
}
