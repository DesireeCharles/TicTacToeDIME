/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;
@javax.persistence.Entity
@javax.persistence.Cacheable
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@javax.persistence.Table(name = "t_ConcreteUser__dh6bymwneewzvvv", indexes={@javax.persistence.Index(columnList="meta_inheritance")})
@de.ls5.dywa.annotations.IdRef(id = 0L)
public class ConcreteUserImpl implements ConcreteUser {
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


	@javax.persistence.Transient
	private boolean bidirectionalDirtyFlag;
	/* DYWA METADATA END */

	
	/* MAIN ATTRIBUTES START */
	@de.ls5.dywa.annotations.IdRef(id = 7L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_BaseUser__fpy24mwneewzvvv")
	@org.hibernate.annotations.Any(metaColumn=@javax.persistence.Column(name="m_BaseUser_Type__fpy24mwneewzvvv"))
	@org.hibernate.annotations.AnyMetaDef(
		idType="long", metaType="string",
		metaValues={
			@org.hibernate.annotations.MetaValue(targetEntity=de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUserImpl.class, value="_udys4mwneewzvvv")
		}
	)
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser baseUser;
	
	@de.ls5.dywa.annotations.IdRef(id = 8L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_DywaSwitchedTo__yfpt4xbzee2qntw")
	@org.hibernate.annotations.Any(metaColumn=@javax.persistence.Column(name="m_DywaSwitchedTo_Type__yfpt4xbzee2qntw"))
	@org.hibernate.annotations.AnyMetaDef(
		idType="long", metaType="string",
		metaValues={
			@org.hibernate.annotations.MetaValue(targetEntity=de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUserImpl.class, value="_dh6bymwneewzvvv")
		}
	)
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser dywaSwitchedTo;
	
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
	public ConcreteUserImpl() {
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
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser getbaseUser() {
		return this.baseUser;
	}
	
	@java.lang.Override
	public void setbaseUser(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser object) {
		if (!this.bidirectionalDirtyFlag) {
			this.bidirectionalDirtyFlag = true;
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser current = this.getbaseUser();
			final ConcreteUser _instance =
			this;
			if(current != null){
				// redundant updates can be skipped
				if (object != null && current.equals(object)) {
					this.bidirectionalDirtyFlag = false;
					return;
				}
	
				current.getconcreteUser_ConcreteUser().remove(_instance);
			}
			if (object != null) {
				object.getconcreteUser_ConcreteUser().add(_instance);
			}
			this.baseUser = object;
			this.bidirectionalDirtyFlag = false;
		}
	}
	
	
	@java.lang.Override
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser getdywaSwitchedTo() {
		return this.dywaSwitchedTo;
	}
	
	@java.lang.Override
	public void setdywaSwitchedTo(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser object) {
		this.dywaSwitchedTo = object;
	}
	
	
	@java.lang.Override
	public String toString() {
		return "ConcreteUser[id: " + this.id_ + ", name: " + this.name_ + "]";
	}
}

