package cn.openadr.payload.evt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.Event;
import cn.openadr.payload.DRResponse;

public class RequestEventResponse extends DRResponse<RequestEventRequest> {
	private static final long serialVersionUID = 1L;

	private final List<Event> events = new ArrayList<>();

	public RequestEventResponse(RequestEventRequest request) {
		super(request);
	}

	public List<Event> getEvents() {
		return events;
	}
}
