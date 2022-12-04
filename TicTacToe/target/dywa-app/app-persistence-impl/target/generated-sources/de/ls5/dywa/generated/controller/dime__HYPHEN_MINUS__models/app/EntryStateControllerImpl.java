/* generated by info.scce.dime.generator.scheme.ControllerGenerator */
package de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app;

import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState;
import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity;

import java.util.Arrays;
import java.util.stream.Collectors;

@javax.enterprise.context.RequestScoped
public class EntryStateControllerImpl implements EntryStateController {
	private static final org.slf4j.Logger LOGGER =  org.slf4j.LoggerFactory.getLogger(EntryStateController.class);

	@javax.persistence.PersistenceContext
	private javax.persistence.EntityManager entityManager;

	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;

@javax.inject.Inject //referenceMap
private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableEntryController tableEntryController;

@javax.inject.Inject //referenceMap
private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.EntryStateController entryStateController;

    
    @Override
	public EntryState read(final java.lang.Long id) {

		EntryStateEntity result = entityManager.find(EntryStateEntity.class, id);
		if (result != null) {
			return EntryState.valueOf(result.getDywaName());
		}
		return EntryState.forId(id);
	}

    @Override
	public java.util.List<EntryState> findByProperties(EntryState searchObject) {
		throw new java.lang.UnsupportedOperationException("Cannot perform this operation on an enumerable object");
	}

	@Override
	public EntryState findFirstByProperties(EntryState searchObject) {
		throw new java.lang.UnsupportedOperationException("Cannot perform this operation on an enumerable object");
	}

	@Override
	public java.util.Set<EntryState> fetch() {
		return java.util.stream.Stream.of(EntryState.values()).collect(java.util.stream.Collectors.toSet());
	}

	@Override
	public java.util.Set<EntryState> fetchByName(final java.lang.String name) {
		return java.util.stream.Stream.of(EntryState.values()).filter(e -> java.util.Objects.equals(e.getDywaName(), name)).collect(java.util.stream.Collectors.toSet());
	}

}
