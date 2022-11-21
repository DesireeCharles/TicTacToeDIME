package info.scce.dime.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import info.scce.dime.util.Constants;

public class RESTBaseImpl implements RESTBaseType {

	private long dywaId;
	private long dywaVersion;
	private String dywaName;

	private boolean isDywaVersionSet;
	private boolean isDywaNameSet;

	@JsonProperty(Constants.DYWA_ID)
	public long getDywaId() {
		return this.dywaId;
	}

	@JsonProperty(Constants.DYWA_ID)
	public void setDywaId(final long id) {
		this.dywaId = id;
	}

	@JsonProperty(Constants.DYWA_VERSION)
	@JsonRenderIndicator("isDywaVersionSet")
	public long getDywaVersion() {
		return this.dywaVersion;
	}

	@JsonIgnore
	public boolean isDywaVersionSet() {
		return this.isDywaVersionSet;
	}

	@JsonProperty(Constants.DYWA_VERSION)
	public void setDywaVersion(final long version) {
		this.isDywaVersionSet = true;
		this.dywaVersion = version;
	}

	@JsonProperty(Constants.DYWA_NAME)
	@JsonRenderIndicator("isDywaNameSet")
	public String getDywaName() {
		return this.dywaName;
	}

	@JsonIgnore
	public boolean isDywaNameSet() {
		return this.isDywaNameSet;
	}

	@JsonProperty(Constants.DYWA_NAME)
	public void setDywaName(final String name) {
		this.isDywaNameSet = true;
		this.dywaName = name;
	}

	@Override
	public int hashCode() {
		return Long.hashCode(this.getDywaId());
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(getClass().isInstance(obj))) {
			return false;
		}

		final RESTBaseType that = (RESTBaseType) obj;
		if (this.getDywaId() > Constants.DYWA_ID_TRANSIENT && that.getDywaId() > Constants.DYWA_ID_TRANSIENT) {
			return this.getDywaId() == that.getDywaId();
		}

		return false;
	}

}
