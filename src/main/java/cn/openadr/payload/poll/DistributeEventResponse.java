package cn.openadr.payload.poll;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.Event;

public class DistributeEventResponse extends PollResponse {
	private static final long serialVersionUID = 1L;

	private final List<Event> events = new ArrayList<>();

	public DistributeEventResponse(PollRequest request) {
		super(request);
	}

	public List<Event> getEvents() {
		return events;
	}
}
