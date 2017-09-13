package cn.openadr.payload.opt;

import cn.openadr.payload.DRResponse;

public class OptResponse<T extends OptRequest> extends DRResponse<T> {
	private static final long serialVersionUID = 1L;

	public OptResponse(T request) {
		super(request);
	}

	public String getOptID() {
		return request.getOptID();
	}
}
