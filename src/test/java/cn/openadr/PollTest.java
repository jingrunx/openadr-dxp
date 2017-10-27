package cn.openadr;

import org.junit.Test;

import cn.openadr.payload.poll.Poll;
import cn.openadr.payload.poll.PollResponse;
import cn.openadr.utils.CommonUtils;

public class PollTest extends AbstractTest {
	@Test
	public void testPollRequest() {
		Poll req = new Poll();
		CommonUtils.fillRequest(req);

		object = req;
	}

	@Test
	public void testPollResponse() {
		PollResponse rep = new PollResponse();
		CommonUtils.fillResponse(rep);
		object = rep;
	}
}
