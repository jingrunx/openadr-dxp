package cn.openadr.payload.pull;

import cn.openadr.payload.DRResponse;

public class PollResponse extends DRResponse<PollRequest> {
	private static final long serialVersionUID = 1L;

	public PollResponse(PollRequest request) {
		super(request);
	}
}
