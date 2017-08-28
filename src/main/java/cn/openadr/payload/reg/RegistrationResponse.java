package cn.openadr.payload.reg;

import cn.openadr.payload.DRResponse;

public class RegistrationResponse<R extends RegistrationRequest> extends DRResponse<R> {
	private static final long serialVersionUID = 1L;

	public RegistrationResponse(R request) {
		super(request);
	}

	public String getRegistrationID() {
		return request.getRegistrationID();
	}

	public String getVenID() {
		return request.getVenID();
	}
}
