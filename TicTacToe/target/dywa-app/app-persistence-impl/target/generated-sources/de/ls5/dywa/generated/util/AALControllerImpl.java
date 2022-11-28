package de.ls5.dywa.generated.util;

import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;

@RequestScoped
public class AALControllerImpl implements AALController {

	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ConcreteUserController ConcreteUserController;
	@Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BaseUserController BaseUserController;
	@Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableController TableController;
	@Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableRowController TableRowController;
	@Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableEntryController TableEntryController;

	@Override
	public void reset() {

	final FlushModeType oldFlushMode = this.entityManager.getFlushMode();
	this.entityManager.flush();
	this.entityManager.setFlushMode(FlushModeType.COMMIT);

	for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser o : ConcreteUserController.fetch()) {
	ConcreteUserController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser o : BaseUserController.fetch()) {
	BaseUserController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table o : TableController.fetch()) {
	TableController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow o : TableRowController.fetch()) {
	TableRowController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry o : TableEntryController.fetch()) {
	TableEntryController.deleteWithIncomingReferences(o);
	}

		this.entityManager.setFlushMode(oldFlushMode);
	}
}
