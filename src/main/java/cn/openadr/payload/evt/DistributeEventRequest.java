package cn.openadr.payload.evt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.Event;
import cn.openadr.payload.DRRequest;

// OadrDistributeEventType
@lombok.Getter
public class DistributeEventRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	private final List<Event> events = new ArrayList<>();
}
