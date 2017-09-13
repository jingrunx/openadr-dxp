package cn.openadr;

import org.junit.Test;

import cn.openadr.payload.pull.PendingReportResponse;
import cn.openadr.payload.pull.PollRequest;
import cn.openadr.payload.pull.PollResponse;
import cn.openadr.payload.pull.ReregistrationResponse;
import cn.openadr.payload.pull.RereportReponse;
import cn.openadr.utils.CommonUtils;
import cn.openadr.utils.RptUtils;

public class PollTest extends AbstractTest {
	@Test
	public void testPollRequest() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		object = req;
	}

	@Test
	public void testPollResoonse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		PollResponse rep = new PollResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testReregistrationResponse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		ReregistrationResponse rep = new ReregistrationResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testRereportReponse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		RereportReponse rep = new RereportReponse(req);
		CommonUtils.fillResponse(rep);

		rep.setReportSpecifierID(CommonUtils.id());

		object = rep;
	}

	@Test
	public void testPendingReportResponse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		PendingReportResponse rep = new PendingReportResponse(req);
		CommonUtils.fillResponse(rep);
		RptUtils.fillReportSpecifier(rep.getReportSpecifier());

		object = rep;
	}
}
