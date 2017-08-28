package cn.openadr;

import org.junit.Test;

import cn.openadr.payload.pull.PollRequest;
import cn.openadr.payload.pull.PollResponse;


public class PollTest extends AbstractJsonTest<Object>{
	@Test
	public void testPollRequest() {
		PollRequest request = new PollRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setVersion(0);
		object  = request;
	}
	
	@Test 
	public void testPollResponse() {
		PollRequest request = new PollRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setVersion(0);
		PollResponse response = new PollResponse(request);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
		response.setRegisterReport(true);
		response.setReregistration(false);
		object  = response;
	}
}
