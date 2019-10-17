package cn.openadr.payload.evt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.EventResponse;
import cn.openadr.payload.DNResponse;

// OadrCreatedEventType
@lombok.Getter
public class CreateEventResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	private final List<EventResponse> eventResponses = new ArrayList<>();
}
