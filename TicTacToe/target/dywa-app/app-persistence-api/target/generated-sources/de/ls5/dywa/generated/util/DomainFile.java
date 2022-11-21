package de.ls5.dywa.generated.util;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="domain_file")
public class DomainFile {
	@Id
	@GeneratedValue
	@Column(name="meta_id")
	private long id_;
	
	@Column(name="meta_dywa_id", unique = true)
	private Long dywaId_;
	
	@Basic(optional = false)
	private String fileName;

	@Basic(optional = false)
	private String contentType;

	@Basic(optional = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	public DomainFile() { }

	public DomainFile(final String fileName, final String contentType) {
		this.fileName = fileName;
		this.contentType = contentType;
		this.createdAt = new Date();
	}

	public Long getId() {
	return id_;
	}

	public void setId(Long id) {
		this.id_ = id;
	}

	// return existing id on runtime
	public long getDywaId() {
			return this.id_;
	}

	public String getFileName() {
		return this.fileName;
	}

	
	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(final String contentType) {
		this.contentType = contentType;
	}

	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}

	public Date getCreatedAt() {
	return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "DomainFile{" + "id_=" + id_ + ", fileName='" + fileName + '\'' + ", contentType='" + contentType + '\'' + '}';
	}
}

