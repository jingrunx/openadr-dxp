package cn.openadr;

import org.junit.Test;

import cn.openadr.payload.pull.PullRequest;
import cn.openadr.payload.pull.PullResponse;

public class PollTest extends AbstractJsonTest<Object>{
	@Test
	public void testPullRequest() {
		PullRequest request = new PullRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setVersion(0);
		object  = request;
	}
	
	@Test 
	public void testPullResponse() {
		PullRequest request = new PullRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setVersion(0);
		PullResponse response = new PullResponse(request);
		response.setAbility(true);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
		response.setRegisterReport(true);
		response.setReportMetadata(true);
		response.setReregistration(false);
		object  = response;
	}
}
