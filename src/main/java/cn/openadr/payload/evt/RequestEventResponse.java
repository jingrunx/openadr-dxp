package cn.openadr.payload.evt;

import cn.openadr.model.event.Event;
import cn.openadr.payload.OadrResponse;

public class RequestEventResponse extends OadrResponse<RequestEventRequest> {
	private static final long serialVersionUID = 1L;

	private final Event event = new Event();

	public RequestEventResponse(RequestEventRequest request) {
		super(request);
	}

	public Event getEvent() {
		return event;
	}
}
