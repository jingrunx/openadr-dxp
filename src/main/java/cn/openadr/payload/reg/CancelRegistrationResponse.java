package cn.openadr.payload.reg;

import cn.openadr.payload.DRResponse;

public class CancelRegistrationResponse extends DRResponse<CancelRegistrationRequest> {
	private static final long serialVersionUID = 1L;

	public CancelRegistrationResponse(CancelRegistrationRequest request) {
		super(request);
	}

	public String getRegistrationID() {
		return request.getRegistrationID();
	}
}
