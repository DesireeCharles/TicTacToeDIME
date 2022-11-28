/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;
@javax.persistence.Entity
@javax.persistence.Cacheable
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@javax.persistence.Table(name = "t_TableRow__j1likw8qee2x_c6", indexes={@javax.persistence.Index(columnList="meta_inheritance")})
@de.ls5.dywa.annotations.IdRef(id = 3L)
public class TableRowImpl implements TableRow {
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
	@de.ls5.dywa.annotations.IdRef(id = 14L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinTable(name="r_TableRow_TableEntry__rmkz8w8qee2x_c6", joinColumns = { @javax.persistence.JoinColumn(name = "r1_TableRow_id") }, inverseJoinColumns = { @javax.persistence.JoinColumn(name = "r2_TableEntry_id") })
	@org.hibernate.annotations.ManyToAny(metaColumn=@javax.persistence.Column(name="m_TableEntry_Type__rmkz8w8qee2x_c6"))
	@org.hibernate.annotations.AnyMetaDef(
		idType="long", metaType="string",
		metaValues={
			@org.hibernate.annotations.MetaValue(targetEntity=de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntryImpl.class, value="_kekm0w8qee2x_c6")
		}
	)
	private java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry> tableEntry  = new java.util.ArrayList<>();
	
	/* MAIN ATTRIBUTES END */
	
	/* IMPLICIT ATTRIBUTES START */
	/* IMPLICIT ATTRIBUTES END */
	
	/* INHERITED MODELS START */
	/* INHERITED MODELS END */

	/* INHERITED ABSTRACT MODELS START */
	/* INHERITED ABSTRACT MODELS END */
	
	/* ADDITIONAL INHERITED MODELS START */
	/* ADDITIONAL INHERITED MODELS END */
	
	// Constructors
	public TableRowImpl() {
	}



	// EXTENSION ATTRIBUTES

	public long getId_() {
		return this.id_;
	}

	public void setId_(final long id) {
		this.id_ = id;
	}

	@java.lang.Override
	public java.lang.String getDywaName() {
		return this.name_;
	}

	@java.lang.Override
	public void setDywaName(final java.lang.String name) {
		this.name_ = name;
	}

	// return existing id on runtime
	@java.lang.Override
	public long getDywaId() {
		return this.id_;
	}

	@java.lang.Override
	public long getDywaVersion() {
		return this.version_;
	}

	@java.lang.Override
	public void setDywaVersion(final long version) {
		this.version_ = version;
	}
	
	@java.lang.Override
	public java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry> gettableEntry_TableEntry() {
		return this.tableEntry;
	}
	
	@java.lang.Override
	public void settableEntry_TableEntry(java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry> object) {
		this.tableEntry = object;
	}
	
	
	@java.lang.Override
	public String toString() {
		return "TableRow[id: " + this.id_ + ", name: " + this.name_ + "]";
	}
}

