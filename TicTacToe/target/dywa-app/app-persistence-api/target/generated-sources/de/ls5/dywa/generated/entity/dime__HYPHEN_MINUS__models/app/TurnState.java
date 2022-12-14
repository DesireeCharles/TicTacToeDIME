/* generated by info.scce.dime.generator.scheme.EnumGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;

@de.ls5.dywa.annotations.IdRef(id = 6L)
@de.ls5.dywa.annotations.OriginalName(name = "TurnState")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
public enum TurnState implements de.ls5.dywa.generated.util.Identifiable, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateInterface {
	X(47L), O(48L);
	
	private final long id;
	private TurnStateInterface internalDelegate;
	private static de.ls5.dywa.generated.util.EntityManagerProvider emp;
	
	TurnState(long id) {
		this.id = id;
	}

	public long getDywaEnumId() {
		return this.id;
	}

	public long getDywaId() {
		loadOrRefresh();
		return this.internalDelegate.getDywaId();
	}

	public java.lang.String getDywaName() {
		loadOrRefresh();
		return this.internalDelegate.getDywaName();
	}

	public void setDywaName(java.lang.String name) {
		loadOrRefresh();
		this.internalDelegate.setDywaName(name);
	}
	
	public long getDywaVersion() {
		loadOrRefresh();
		return this.internalDelegate.getDywaVersion();
	}
	
	public void setDywaVersion(final long version) {
		loadOrRefresh();
		this.internalDelegate.setDywaVersion(version);
	}
	
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState getX() {
		loadOrRefresh();
		return this.internalDelegate != null ? this.internalDelegate.getX() : null;
	}
	
	public void setX(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState newValue) {
		loadOrRefresh();
		if (this.internalDelegate != null) {
			this.internalDelegate.setX(newValue);
		}
	}

	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState getO() {
		loadOrRefresh();
		return this.internalDelegate != null ? this.internalDelegate.getO() : null;
	}
	
	public void setO(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState newValue) {
		loadOrRefresh();
		if (this.internalDelegate != null) {
			this.internalDelegate.setO(newValue);
		}
	}

	public java.lang.String getdywaDisplayName() {
		loadOrRefresh();
		return this.internalDelegate != null ? this.internalDelegate.getdywaDisplayName() : null;
	}
	
	public void setdywaDisplayName(java.lang.String newValue) {
		loadOrRefresh();
		if (this.internalDelegate != null) {
			this.internalDelegate.setdywaDisplayName(newValue);
		}
	}

	
	private void loadOrRefresh() {
		javax.persistence.EntityManager em = getEntityManager();
		if (this.internalDelegate == null || !em.contains(this.internalDelegate)) {
			javax.persistence.TypedQuery<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateInterface> query = em.createQuery(
				"SELECT ent " +
				"FROM de.ls5.dywa.generated.util.EnumMapping map " +
					"JOIN de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity ent " +
					"ON (map.objectId = ent.id_) " +
				"WHERE map.enumId = :id",
				de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateInterface.class);
			query.setParameter("id", this.id);
			this.internalDelegate = query.getSingleResult();
		}
	}
	
	private javax.persistence.EntityManager getEntityManager() {
		if (emp == null) {
			javax.enterprise.inject.spi.BeanManager beanManager = javax.enterprise.inject.spi.CDI.current().getBeanManager();
			javax.enterprise.inject.spi.Bean bean = (javax.enterprise.inject.spi.Bean) beanManager.getBeans(de.ls5.dywa.generated.util.EntityManagerProvider.class).iterator().next();
			javax.enterprise.context.spi.CreationalContext<de.ls5.dywa.generated.util.EntityManagerProvider> cctx = beanManager.createCreationalContext(bean);
			emp = (de.ls5.dywa.generated.util.EntityManagerProvider) beanManager.getReference(bean, de.ls5.dywa.generated.util.EntityManagerProvider.class, cctx);
		}
		return emp.getEntityManager();
	}
	
	<T extends TurnStateInterface> T getEntityAs(Class<T> clazz) {
		loadOrRefresh();
		return (T) this.internalDelegate;
	}
	
	public static TurnState forId(long id) {
		if (id == 47) {
			return TurnState.X;
		} else 
		if (id == 48) {
			return TurnState.O;
		}
		return null;
	}
}

