package cn.openadr;

import org.junit.Test;

import cn.openadr.payload.DRPayload;
import cn.openadr.payload.poll.PollRequest;
import cn.openadr.utils.CommonUtils;

public class MessageTest extends AbstractTest {
	@Test
	public void testMessage() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		DRPayload message = new DRPayload(req);
		object = message;
	}
}
