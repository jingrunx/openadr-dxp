package cn.openadr.payload.pull;

import cn.openadr.payload.DRResponse;

public class ReregistrationResponse extends DRResponse<PollRequest> {
	private static final long serialVersionUID = 1L;

	public ReregistrationResponse(PollRequest request) {
		super(request);
	}
}
