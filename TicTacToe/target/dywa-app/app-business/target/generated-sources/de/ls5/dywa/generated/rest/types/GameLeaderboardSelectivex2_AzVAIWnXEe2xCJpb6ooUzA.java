// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class GameLeaderboardSelectivex2_AzVAIWnXEe2xCJpb6ooUzA {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard from,
		final de.ls5.dywa.generated.rest.types.Leaderboard to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "GameLeaderboardSelectivex2_AzVAIWnXEe2xCJpb6ooUzA")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "GameLeaderboardSelectivex2_AzVAIWnXEe2xCJpb6ooUzA");
	
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Leaderboard effectiveTo = to;
		effectiveTo.setxWins(effectiveFrom.getxWins());
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Leaderboard effectiveTo = to;
		effectiveTo.setoWins(effectiveFrom.getoWins());
		}
	}
}