package cn.openadr.payload.reg;

import cn.openadr.payload.OadrResponse;

public class RegistrationResponse<R extends RegistrationRequest> extends OadrResponse<R> {
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
