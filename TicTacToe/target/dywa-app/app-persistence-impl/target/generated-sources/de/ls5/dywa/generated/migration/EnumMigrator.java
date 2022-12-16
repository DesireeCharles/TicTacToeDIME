package de.ls5.dywa.generated.migration;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import de.ls5.dywa.generated.util.EnumMapping;

@Singleton
@Startup
public class EnumMigrator {

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void migrate() {

        for (EnumMapping mapping : em.createQuery("SELECT mapping FROM de.ls5.dywa.generated.util.EnumMapping mapping", EnumMapping.class).getResultList()) {
            em.remove(mapping);
        }
        em.flush();

    			setupEntryState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.X, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.O, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.empty, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.empty_dis);
    			setupTurnState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState.X, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState.O);
    			setupGameState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState.win, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState.tie, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState.progress);
    }

	private void setupEntryState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState... values) {

	    for (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState value : values) {
	        final TypedQuery<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity> query = em.createQuery(
	                "SELECT o FROM de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity o WHERE o.name_ = :name", de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity.class);
	        query.setParameter("name", value.name());

	        final List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity> res = query.getResultList();
	        final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity entity;

	        switch (res.size()) {
	            case 0:
	                entity = new de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity();
	                entity.setDywaName(value.name());
	                em.persist(entity);
	                break;
	            case 1:
	                entity = res.get(0);
	                break;
	            default:
	                throw new IllegalStateException("There must not exist multiple enum-entities with the same name");
	        }

	        em.persist(new EnumMapping(value.getDywaEnumId(), entity.getId_()));
	    }
	}
	private void setupTurnState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState... values) {

	    for (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState value : values) {
	        final TypedQuery<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity> query = em.createQuery(
	                "SELECT o FROM de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity o WHERE o.name_ = :name", de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity.class);
	        query.setParameter("name", value.name());

	        final List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity> res = query.getResultList();
	        final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity entity;

	        switch (res.size()) {
	            case 0:
	                entity = new de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity();
	                entity.setDywaName(value.name());
	                em.persist(entity);
	                break;
	            case 1:
	                entity = res.get(0);
	                break;
	            default:
	                throw new IllegalStateException("There must not exist multiple enum-entities with the same name");
	        }

	        em.persist(new EnumMapping(value.getDywaEnumId(), entity.getId_()));
	    }
	}
	private void setupGameState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState... values) {

	    for (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState value : values) {
	        final TypedQuery<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameStateEntity> query = em.createQuery(
	                "SELECT o FROM de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameStateEntity o WHERE o.name_ = :name", de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameStateEntity.class);
	        query.setParameter("name", value.name());

	        final List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameStateEntity> res = query.getResultList();
	        final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameStateEntity entity;

	        switch (res.size()) {
	            case 0:
	                entity = new de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameStateEntity();
	                entity.setDywaName(value.name());
	                em.persist(entity);
	                break;
	            case 1:
	                entity = res.get(0);
	                break;
	            default:
	                throw new IllegalStateException("There must not exist multiple enum-entities with the same name");
	        }

	        em.persist(new EnumMapping(value.getDywaEnumId(), entity.getId_()));
	    }
	}
}
