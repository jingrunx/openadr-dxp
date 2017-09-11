package cn.openadr.payload.reg;

import cn.openadr.domain.TransportType;

public class CreateRegistrationRequest extends RegistrationRequest {
	private static final long serialVersionUID = 1L;

	private String dnName;
	private boolean reportOnly;
	private boolean pullMode;
	private String profile;
	private TransportType transport;
	private String endpoint;

	public String getDnName() {
		return dnName;
	}

	public void setDnName(String dnName) {
		this.dnName = dnName;
	}

	public boolean isReportOnly() {
		return reportOnly;
	}

	public void setReportOnly(boolean reportOnly) {
		this.reportOnly = reportOnly;
	}

	public String getProfile() {
		return profile;
	}

	public boolean isPullMode() {
		return pullMode;
	}

	public void setPullMode(boolean pullMode) {
		this.pullMode = pullMode;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public TransportType getTransport() {
		return transport;
	}

	public void setTransport(TransportType transport) {
		this.transport = transport;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
}
