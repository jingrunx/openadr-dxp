package cn.openadr.payload.evt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.EventResponse;
import cn.openadr.payload.DNResponse;

// OadrCreatedEventType
public class CreatedEventResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	private final List<EventResponse> eventResponses = new ArrayList<>();

	public List<EventResponse> getEventResponses() {
		return eventResponses;
	}
}
