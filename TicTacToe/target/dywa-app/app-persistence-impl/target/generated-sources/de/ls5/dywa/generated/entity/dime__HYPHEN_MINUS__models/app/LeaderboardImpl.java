/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;
@javax.persistence.Entity
@javax.persistence.Cacheable
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@javax.persistence.Table(name = "t_Leaderboard__uhrwqx8dee29ivx", indexes={@javax.persistence.Index(columnList="meta_inheritance")})
@de.ls5.dywa.annotations.IdRef(id = 8L)
public class LeaderboardImpl implements Leaderboard {
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
	@de.ls5.dywa.annotations.IdRef(id = 37L)
	@javax.persistence.Column(name = "a_XWins__xgahix8dee29ivx", columnDefinition="bigint")
	private java.lang.Long xWins;
	
	@de.ls5.dywa.annotations.IdRef(id = 38L)
	@javax.persistence.Column(name = "a_OWins__xsgcyx8dee29ivx", columnDefinition="bigint")
	private java.lang.Long oWins;
	
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
	public LeaderboardImpl() {
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
	public java.lang.Long getxWins() {
		return this.xWins;
	}
	
	@java.lang.Override
	public void setxWins(java.lang.Long object) {
		this.xWins = object;
	}
	
	
	@java.lang.Override
	public java.lang.Long getoWins() {
		return this.oWins;
	}
	
	@java.lang.Override
	public void setoWins(java.lang.Long object) {
		this.oWins = object;
	}
	
	
	@java.lang.Override
	public String toString() {
		return "Leaderboard[id: " + this.id_ + ", name: " + this.name_ + "]";
	}
}
