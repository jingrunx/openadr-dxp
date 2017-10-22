package cn.openadr;

import org.junit.Test;

import cn.openadr.payload.poll.PollRequest;
import cn.openadr.utils.CommonUtils;

public class PollTest extends AbstractTest {
	@Test
	public void testPollRequest() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		object = req;
	}
}
