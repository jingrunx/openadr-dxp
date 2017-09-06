package cn.openadr.payload.evt;

import cn.openadr.payload.DRResponse;

public class ReplyEventResponse extends DRResponse<ReplyEventRequest> {
	private static final long serialVersionUID = 1L;

	public ReplyEventResponse(ReplyEventRequest request) {
		super(request);
	}
}
