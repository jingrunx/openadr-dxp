package cn.openadr;

import org.junit.Test;

import cn.openadr.model.event.Event;
import cn.openadr.payload.evt.RequestEventRequest;
import cn.openadr.payload.evt.RequestEventResponse;
import cn.openadr.utils.CommonUtils;
import cn.openadr.utils.EventUtils;

public class EventTest extends AbstractTest {
	@Test
	public void testRequestEventRequest() {
		RequestEventRequest req = new RequestEventRequest();
		CommonUtils.fillRequest(req);

		req.setReplyLimit(5);

		object = req;
	}

	@Test
	public void testRequestEventResponse() {
		RequestEventRequest req = new RequestEventRequest();
		CommonUtils.fillRequest(req);

		RequestEventResponse rep = new RequestEventResponse(req);
		CommonUtils.fillResponse(rep);

		Event event = new Event();
		EventUtils.fillEvent(event);
		rep.getEvents()
			.add(event);

		object = rep;
	}
}
