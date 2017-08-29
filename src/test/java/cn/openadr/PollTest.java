package cn.openadr;

import org.junit.Test;

import cn.openadr.model.event.Event;
import cn.openadr.payload.pull.PollRequest;
import cn.openadr.payload.pull.PollResponse;
import cn.openadr.utils.CommonUtils;
import cn.openadr.utils.EventUtils;

public class PollTest extends AbstractTest {
	@Test
	public void testPollRequest() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		object = req;
	}

	@Test
	public void testPollResponse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		PollResponse rep = new PollResponse(req);
		CommonUtils.fillResponse(rep);

		rep.setReregistration(true);
		rep.setRegisterReport(true);
		rep.setCreateReport(true);

		Event event = new Event();
		EventUtils.fillEvent(event);
		rep.getEvents()
			.add(event);

		object = rep;
	}
}
