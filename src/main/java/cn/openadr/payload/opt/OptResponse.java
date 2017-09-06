package cn.openadr.payload.opt;

import cn.openadr.payload.DRResponse;

public class OptResponse extends DRResponse<OptRequest> {
	private static final long serialVersionUID = 1L;

	public OptResponse(OptRequest request) {
		super(request);
	}

	public String getOptID() {
		return request.getOptID();
	}
}
