package de.ls5.dywa.generated.rest.util;

import java.util.Date;

public class FileReference {

	private long dywaId;
	private String fileName;
	private String contentType;
	private Date createdAt;

	public FileReference() {}

	public FileReference(final de.ls5.dywa.generated.util.FileReference delegate) {
		this.setDywaId(delegate.getDywaId());

		this.setFileName(delegate.getFileName());
		this.setContentType(delegate.getContentType());
		this.setCreatedAt(delegate.getCreatedAt());
	}

	@com.fasterxml.jackson.annotation.JsonProperty("dywaId")
	public long getDywaId() {
		return dywaId;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("dywaId")
	public void setDywaId(long id) {
		this.dywaId = id;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("fileName")
	public String getFileName() {
		return fileName;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("fileName")
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("contentType")
	public String getContentType() {
		return contentType;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("contentType")
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	@com.fasterxml.jackson.annotation.JsonProperty("createdAt")
	public Date getCreatedAt() {
		return this.createdAt;
	}
			
	@com.fasterxml.jackson.annotation.JsonProperty("createdAt")
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FileReference)) {
			return false;
		}

		final FileReference that = (FileReference) obj;
		if (this.getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT && that.getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
			return this == that;
		}

		return this.getDywaId() == that.getDywaId();
	}
}
