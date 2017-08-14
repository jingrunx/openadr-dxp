package cn.openadr.payload.evt;

import cn.openadr.payload.OadrResponse;

public class RequestEventResponse extends OadrResponse<RequestEventRequest> {
	private static final long serialVersionUID = 1L;

	public RequestEventResponse(RequestEventRequest request) {
		super(request);
	}
}
