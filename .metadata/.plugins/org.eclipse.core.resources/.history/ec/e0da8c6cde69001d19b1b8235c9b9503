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

    }

}
