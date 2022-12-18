// generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#generateJSONToContextTransformer
package info.scce.dime.process;

import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;

/**
 * Utility class to explicitly declare the required controllers that need to be injected.
 * This allows to resolve all injection points once at deploy time instead dynamically on each invocation, thus improving performance.
 */
public final class ContextTransformer {

private static ContextTransformer instance;

public static ContextTransformer getInstance(javax.enterprise.inject.spi.BeanManager bm) {
	if (instance == null) {
		instance = info.scce.dime.util.CDIUtil.getManagedInstance(bm, ContextTransformer.class);
	}
	return instance;
}


@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ConcreteUserController ConcreteUserController;
@Inject de.ls5.dywa.generated.rest.controller.ConcreteUserREST ConcreteUserREST;
@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BaseUserController BaseUserController;
@Inject de.ls5.dywa.generated.rest.controller.BaseUserREST BaseUserREST;
@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableController TableController;
@Inject de.ls5.dywa.generated.rest.controller.TableREST TableREST;
@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableRowController TableRowController;
@Inject de.ls5.dywa.generated.rest.controller.TableRowREST TableRowREST;
@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableEntryController TableEntryController;
@Inject de.ls5.dywa.generated.rest.controller.TableEntryREST TableEntryREST;
@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.EntryStateController EntryStateController;
@Inject de.ls5.dywa.generated.rest.controller.EntryStateREST EntryStateREST;
@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TurnStateController TurnStateController;
@Inject de.ls5.dywa.generated.rest.controller.TurnStateREST TurnStateREST;
@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.GameStateController GameStateController;
@Inject de.ls5.dywa.generated.rest.controller.GameStateREST GameStateREST;
@Inject de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.LeaderboardController LeaderboardController;
@Inject de.ls5.dywa.generated.rest.controller.LeaderboardREST LeaderboardREST;

@Inject de.ls5.dywa.generated.util.DomainFileController domainFileController;

public de.ls5.dywa.generated.util.FileReference transformFile(long dywaId) {
	return domainFileController.getFileReference(dywaId);
}

public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser transform(de.ls5.dywa.generated.rest.types.ConcreteUser o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser obj;
	if (o.getDywaId() > 0) {
		obj = ConcreteUserController.read(o.getDywaId());
	}
	 else if (o instanceof de.ls5.dywa.generated.rest.types.ConcreteUser) {
		obj = ConcreteUserREST.copyToTransient((de.ls5.dywa.generated.rest.types.ConcreteUser) o);
	}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
	return obj;
}
public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser transform(de.ls5.dywa.generated.rest.types.BaseUser o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser obj;
	if (o.getDywaId() > 0) {
		obj = BaseUserController.read(o.getDywaId());
	}
	 else if (o instanceof de.ls5.dywa.generated.rest.types.BaseUser) {
		obj = BaseUserREST.copyToTransient((de.ls5.dywa.generated.rest.types.BaseUser) o);
	}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
	return obj;
}
public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table transform(de.ls5.dywa.generated.rest.types.Table o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table obj;
	if (o.getDywaId() > 0) {
		obj = TableController.read(o.getDywaId());
	}
	 else if (o instanceof de.ls5.dywa.generated.rest.types.Table) {
		obj = TableREST.copyToTransient((de.ls5.dywa.generated.rest.types.Table) o);
	}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
	return obj;
}
public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow transform(de.ls5.dywa.generated.rest.types.TableRow o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow obj;
	if (o.getDywaId() > 0) {
		obj = TableRowController.read(o.getDywaId());
	}
	 else if (o instanceof de.ls5.dywa.generated.rest.types.TableRow) {
		obj = TableRowREST.copyToTransient((de.ls5.dywa.generated.rest.types.TableRow) o);
	}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
	return obj;
}
public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry transform(de.ls5.dywa.generated.rest.types.TableEntry o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry obj;
	if (o.getDywaId() > 0) {
		obj = TableEntryController.read(o.getDywaId());
	}
	 else if (o instanceof de.ls5.dywa.generated.rest.types.TableEntry) {
		obj = TableEntryREST.copyToTransient((de.ls5.dywa.generated.rest.types.TableEntry) o);
	}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
	return obj;
}
public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState transform(de.ls5.dywa.generated.rest.types.EntryState o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState obj;
	if (o.getDywaId() > 0) {
		obj = EntryStateController.read(o.getDywaId());
	}
	else {
		throw new java.lang.IllegalArgumentException("Transient enum types are not allowed");
	}
	return obj;
}
public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState transform(de.ls5.dywa.generated.rest.types.TurnState o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState obj;
	if (o.getDywaId() > 0) {
		obj = TurnStateController.read(o.getDywaId());
	}
	else {
		throw new java.lang.IllegalArgumentException("Transient enum types are not allowed");
	}
	return obj;
}
public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState transform(de.ls5.dywa.generated.rest.types.GameState o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState obj;
	if (o.getDywaId() > 0) {
		obj = GameStateController.read(o.getDywaId());
	}
	else {
		throw new java.lang.IllegalArgumentException("Transient enum types are not allowed");
	}
	return obj;
}
public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard transform(de.ls5.dywa.generated.rest.types.Leaderboard o) {
	final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard obj;
	if (o.getDywaId() > 0) {
		obj = LeaderboardController.read(o.getDywaId());
	}
	 else if (o instanceof de.ls5.dywa.generated.rest.types.Leaderboard) {
		obj = LeaderboardREST.copyToTransient((de.ls5.dywa.generated.rest.types.Leaderboard) o);
	}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
	return obj;
}
}
