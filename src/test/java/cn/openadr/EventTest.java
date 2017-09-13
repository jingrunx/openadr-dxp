package cn.openadr;

import org.junit.Test;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.model.event.Event;
import cn.openadr.model.event.EventDescriptor;
import cn.openadr.payload.evt.QueryEventRequest;
import cn.openadr.payload.evt.QueryEventResponse;
import cn.openadr.payload.evt.ReplyEventRequest;
import cn.openadr.payload.evt.ReplyEventResponse;
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
	public void testQueryEventResponse() {
		QueryEventRequest req = new QueryEventRequest();
		CommonUtils.fillRequest(req);

		QueryEventResponse rep = new QueryEventResponse(req);
		CommonUtils.fillResponse(rep);

		Event event = new Event();
		EventUtils.fillEvent(event);
		rep.getEvents()
			.add(event);

		object = rep;
	}

	@Test
	public void testReplyEventRequest() {
		EventDescriptor evtDesc = new EventDescriptor();
		evtDesc.setEventID(CommonUtils.id());
		evtDesc.setModificationNumber(1);

		ReplyEventRequest req = new ReplyEventRequest(evtDesc);
		CommonUtils.fillRequest(req);

		req.setOpt(OptType.OPT_IN);
		req.setReason(OptReason.ECONOMIC);

		object = req;
	}

	@Test
	public void testReplyEventResponse() {
		EventDescriptor evtDesc = new EventDescriptor();
		evtDesc.setEventID(CommonUtils.id());
		evtDesc.setModificationNumber(1);

		ReplyEventRequest req = new ReplyEventRequest(evtDesc);
		CommonUtils.fillRequest(req);

		ReplyEventResponse rep = new ReplyEventResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}
}
