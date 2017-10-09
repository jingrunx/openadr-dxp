package cn.openadr;

import org.junit.Test;

import cn.openadr.payload.Message;
import cn.openadr.payload.pull.PollRequest;
import cn.openadr.utils.CommonUtils;

public class MessageTest extends AbstractTest {
	@Test
	public void testMessage() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		Message message = new Message(req);
		object = message;
	}
}
