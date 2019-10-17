package cn.openadr;

import org.junit.Test;

import cn.openadr.domain.OptType;
import cn.openadr.model.event.Event;
import cn.openadr.model.event.EventResponse;
import cn.openadr.payload.evt.CreateEventResponse;
import cn.openadr.payload.evt.DistributeEventRequest;
import cn.openadr.payload.evt.QueryEventRequest;
import cn.openadr.utils.CommonUtils;
import cn.openadr.utils.EventUtils;

public class EventTest extends AbstractTest {
	@Test
	public void testQueryEventRequest() {
		QueryEventRequest req = new QueryEventRequest();
		CommonUtils.fillRequest(req);

		req.setReplyLimit(5);

		object = req;
	}

	@Test
	public void testDistributeEventRequest() {
		DistributeEventRequest req = new DistributeEventRequest();

		for(int i = 0; i < 2; ++i) {
			Event event = new Event();
			EventUtils.fillEvent(event);
			req.getEvents()
				.add(event);
		}

		object = req;
	}

	@Test
	public void testCreatedEventResponse() {
		CreateEventResponse rep = new CreateEventResponse();
		CommonUtils.fillResponse(rep);

		for(int i = 0; i < 2; ++i) {
			EventResponse eventResponse = new EventResponse();

			CommonUtils.fillResponse(eventResponse.getResponse());
			eventResponse.setOptType(OptType.OPT_IN);
			eventResponse.getQualifiedEventID()
				.setEventID(CommonUtils.id());
			eventResponse.getQualifiedEventID()
				.setModificationNumber(1);

			rep.getEventResponses()
				.add(eventResponse);
		}

		object = rep;
	}
}
