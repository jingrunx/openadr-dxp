package cn.openadr.payload.evt;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.Event;
import cn.openadr.payload.DNRequest;

// OadrDistributeEventType
@lombok.Getter
public class DistributeEventRequest extends DNRequest {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<Event> events = new ArrayList<>();
}
