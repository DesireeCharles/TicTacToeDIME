/* generated by info.scce.dime.generator.scheme.ControllerGenerator */
package de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app;

import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState;

public interface GameStateController {

	GameState read(java.lang.Long id);

	java.util.List<GameState> findByProperties(GameState searchObject);

	GameState findFirstByProperties(GameState searchObject);

	java.util.Set<GameState> fetch();

	java.util.Set<GameState> fetchByName(java.lang.String name);

}
