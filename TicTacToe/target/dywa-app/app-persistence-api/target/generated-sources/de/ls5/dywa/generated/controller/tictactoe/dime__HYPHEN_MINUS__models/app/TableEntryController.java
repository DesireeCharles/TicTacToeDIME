/* generated by info.scce.dime.generator.scheme.ControllerGenerator */
package de.ls5.dywa.generated.controller.tictactoe.dime__HYPHEN_MINUS__models.app;

import de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.TableEntry;

public interface TableEntryController {

	TableEntry read(java.lang.Long id);

	java.util.List<TableEntry> findByProperties(TableEntry searchObject);

	TableEntry findFirstByProperties(TableEntry searchObject);

	java.util.Set<TableEntry> fetch();

	java.util.Set<TableEntry> fetchByName(java.lang.String name);

	TableEntry create(java.lang.String name);
	TableEntry createTransient(java.lang.String name);

	TableEntry createSearchObject(java.lang.String name);

	java.util.Set<TableEntry> fetchWithSubtypes();

	void delete(TableEntry entity);

	void deleteWithIncomingReferences(TableEntry entity);
}
