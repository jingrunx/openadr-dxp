package cn.openadr.payload.opt;

import cn.openadr.payload.OadrResponse;

public class OptResponse<R extends OptRequest> extends OadrResponse<R> {
	private static final long serialVersionUID = 1L;

	public OptResponse(R request) {
		super(request);
	}

	public String getOptID() {
		return request.getOptID();
	}
}
