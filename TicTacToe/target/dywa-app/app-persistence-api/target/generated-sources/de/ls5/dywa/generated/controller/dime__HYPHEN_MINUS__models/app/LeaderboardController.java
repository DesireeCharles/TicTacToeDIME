/* generated by info.scce.dime.generator.scheme.ControllerGenerator */
package de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app;

import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard;

public interface LeaderboardController {

	Leaderboard read(java.lang.Long id);

	java.util.List<Leaderboard> findByProperties(Leaderboard searchObject);

	Leaderboard findFirstByProperties(Leaderboard searchObject);

	java.util.Set<Leaderboard> fetch();

	java.util.Set<Leaderboard> fetchByName(java.lang.String name);

	Leaderboard create(java.lang.String name);
	Leaderboard createTransient(java.lang.String name);

	Leaderboard createSearchObject(java.lang.String name);

	java.util.Set<Leaderboard> fetchWithSubtypes();

	void delete(Leaderboard entity);

	void deleteWithIncomingReferences(Leaderboard entity);
}
