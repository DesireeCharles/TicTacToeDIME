/* generated by info.scce.dime.generator.scheme.EnumGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;

@de.ls5.dywa.annotations.IdRef(id = 5L)
@de.ls5.dywa.annotations.OriginalName(name = "EntryState")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
@javax.persistence.Entity
@javax.persistence.Table(name = "e_EntryState__m_tgwhkpee2rznr")
public class EntryStateEntity implements EntryStateInterface {
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
	@de.ls5.dywa.annotations.IdRef(id = 18L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_X__oqhfyxkpee2rznr")
	@javax.persistence.ManyToOne
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity X;
	
	@de.ls5.dywa.annotations.IdRef(id = 19L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_O__o_tsqxkpee2rznr")
	@javax.persistence.ManyToOne
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity O;
	
	@de.ls5.dywa.annotations.IdRef(id = 20L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_Empty__ppgbwxkpee2rznr")
	@javax.persistence.ManyToOne
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity empty;
	
	@de.ls5.dywa.annotations.IdRef(id = 21L)
	@javax.persistence.Column(name = "a_DywaDisplayName__mz8o4xpmee2egku", columnDefinition="varchar")
	private java.lang.String dywaDisplayName;
	
	/* MAIN ATTRIBUTES END */
	
	/* IMPLICIT ATTRIBUTES START */
	/* IMPLICIT ATTRIBUTES END */
	
	/* INHERITED MODELS START */
	/* INHERITED MODELS END */
	
	/* ADDITIONAL INHERITED MODELS START */
	/* ADDITIONAL INHERITED MODELS END */
	
	// Constructors
	public EntryStateEntity() { }
	
	public EntryStateEntity(long id) {
		this.id_ = id;
	}
	
	public EntryStateEntity(boolean inheritance) {
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
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState getX() {
		if (this.X != null) {
			return de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.valueOf(this.X.getDywaName());
		}
		return null;
	}
	
	@java.lang.Override
	public void setX(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState object) {
		this.X = object != null ? object.getEntityAs(EntryStateEntity.class) : null;
	}
	
	protected void setX_(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity object) {
		this.X = object;
	}
	
	protected de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity getX_() {
		return this.X;
	}
	
	
	@java.lang.Override
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState getO() {
		if (this.O != null) {
			return de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.valueOf(this.O.getDywaName());
		}
		return null;
	}
	
	@java.lang.Override
	public void setO(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState object) {
		this.O = object != null ? object.getEntityAs(EntryStateEntity.class) : null;
	}
	
	protected void setO_(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity object) {
		this.O = object;
	}
	
	protected de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity getO_() {
		return this.O;
	}
	
	
	@java.lang.Override
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState getempty() {
		if (this.empty != null) {
			return de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.valueOf(this.empty.getDywaName());
		}
		return null;
	}
	
	@java.lang.Override
	public void setempty(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState object) {
		this.empty = object != null ? object.getEntityAs(EntryStateEntity.class) : null;
	}
	
	protected void setempty_(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity object) {
		this.empty = object;
	}
	
	protected de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity getempty_() {
		return this.empty;
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

