/* generated by info.scce.dime.generator.scheme.EnumGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;

@de.ls5.dywa.annotations.IdRef(id = 6L)
@de.ls5.dywa.annotations.OriginalName(name = "TurnState")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
@javax.persistence.Entity
@javax.persistence.Table(name = "e_TurnState__x66fwxpoee2egku")
public class TurnStateEntity implements TurnStateInterface {
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE)
	@javax.persistence.Column(name = "meta_id")
	private long id_;
	
	/* DYWA METADATA START */
	@javax.persistence.Column(name = "meta_name")
	private java.lang.String name_;
	
	@javax.persistence.Column(name = "meta_version")
	private long version_;
	
	@javax.persistence.Column(name = "meta_inheritance")
	private boolean inheritance_ = false;

	/* DYWA METADATA END */
	
	/* MAIN ATTRIBUTES START */
	@de.ls5.dywa.annotations.IdRef(id = 30L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_X__znsxsxpoee2egku")
	@javax.persistence.ManyToOne
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity X;
	
	@de.ls5.dywa.annotations.IdRef(id = 31L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_O__z97gyxpoee2egku")
	@javax.persistence.ManyToOne
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity O;
	
	@de.ls5.dywa.annotations.IdRef(id = 32L)
	@javax.persistence.Column(name = "a_DywaDisplayName__hchzox8oee29ivx", columnDefinition="varchar")
	private java.lang.String dywaDisplayName;
	
	/* MAIN ATTRIBUTES END */
	
	/* IMPLICIT ATTRIBUTES START */
	/* IMPLICIT ATTRIBUTES END */
	
	/* INHERITED MODELS START */
	/* INHERITED MODELS END */
	
	/* ADDITIONAL INHERITED MODELS START */
	/* ADDITIONAL INHERITED MODELS END */
	
	// Constructors
	public TurnStateEntity() { }
	
	public TurnStateEntity(long id) {
		this.id_ = id;
	}
	
	public TurnStateEntity(boolean inheritance) {
		this.inheritance_ = inheritance;
	}
	
	// Methods
	public long getId_() {
		return this.id_;
	}
	
	public void setId_(long id) {
		this.id_ = id;
	}
	
	@java.lang.Override
	public long getDywaId() {
		return this.id_;
	}
	
	public java.lang.String getDywaName() {
		return this.name_;
	}
	
	public void setDywaName(java.lang.String name) {
		this.name_ = name;
	}
	
	public long getDywaVersion() {
		return this.version_;
	}
	
	public void setDywaVersion(final long version) {
		this.version_ = version;
	}
	
	@java.lang.Override
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState getX() {
		if (this.X != null) {
			return de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState.valueOf(this.X.getDywaName());
		}
		return null;
	}
	
	@java.lang.Override
	public void setX(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState object) {
		this.X = object != null ? object.getEntityAs(TurnStateEntity.class) : null;
	}
	
	protected void setX_(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity object) {
		this.X = object;
	}
	
	protected de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity getX_() {
		return this.X;
	}
	
	
	@java.lang.Override
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState getO() {
		if (this.O != null) {
			return de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState.valueOf(this.O.getDywaName());
		}
		return null;
	}
	
	@java.lang.Override
	public void setO(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState object) {
		this.O = object != null ? object.getEntityAs(TurnStateEntity.class) : null;
	}
	
	protected void setO_(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity object) {
		this.O = object;
	}
	
	protected de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity getO_() {
		return this.O;
	}
	
	
	@java.lang.Override
	public java.lang.String getdywaDisplayName() {
		return this.dywaDisplayName;
	}
	
	@java.lang.Override
	public void setdywaDisplayName(java.lang.String object) {
		this.dywaDisplayName = object;
	}
	
	
}

