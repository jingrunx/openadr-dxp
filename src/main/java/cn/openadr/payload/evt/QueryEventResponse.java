package cn.openadr.payload.evt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.Event;
import cn.openadr.payload.DRResponse;

public class QueryEventResponse extends DRResponse<QueryEventRequest> {
	private static final long serialVersionUID = 1L;

	private final List<Event> events = new ArrayList<>();

	public QueryEventResponse(QueryEventRequest request) {
		super(request);
	}

	public List<Event> getEvents() {
		return events;
	}
}
