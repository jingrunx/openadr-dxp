package cn.openadr.payload.evt;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.EventResponse;
import cn.openadr.payload.DNResponse;

// OadrCreatedEventType
@lombok.Getter
public class CreateEventResponse extends DNResponse {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<EventResponse> eventResponses = new ArrayList<>();
}
