package cn.openadr.payload.reg;

import cn.openadr.domain.TransportType;

public class CreateRegistrationRequest extends RegistrationRequest {
	private static final long serialVersionUID = 1L;

	private boolean reportOnly;
	private String profile;
	private TransportType transport;
	private String endpoint;

	public boolean isReportOnly() {
		return reportOnly;
	}

	public void setReportOnly(boolean reportOnly) {
		this.reportOnly = reportOnly;
	}

	public String getProfile() {
		return profile;
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
