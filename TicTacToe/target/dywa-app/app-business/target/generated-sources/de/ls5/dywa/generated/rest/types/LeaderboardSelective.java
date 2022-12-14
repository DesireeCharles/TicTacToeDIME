// generated by SelectiveGenerator#generateFullSelective(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class LeaderboardSelective {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard from,
		final de.ls5.dywa.generated.rest.types.Leaderboard to,
		final info.scce.dime.rest.ObjectCache objectCache) {


		if (objectCache.containsSelective(to, "LeaderboardSelective")) {
			return;
		}

		to.setDywaId(from.getDywaId());

		// put to cache, after id has been set
		objectCache.putSelective(to, "LeaderboardSelective");

		// non-transient objects can be fetched completely from the DB
		if (from.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
			return;
		}

		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());

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
