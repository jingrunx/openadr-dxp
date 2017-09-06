package cn.openadr.payload.reg;

import cn.openadr.payload.DRResponse;

public class RegistrationResponse extends DRResponse<RegistrationRequest> {
	private static final long serialVersionUID = 1L;

	public RegistrationResponse(RegistrationRequest request) {
		super(request);
	}

	public String getRegistrationID() {
		return request.getRegistrationID();
	}

	public String getDnID() {
		return request.getDnID();
	}
}
