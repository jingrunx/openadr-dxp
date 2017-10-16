package cn.openadr;

import org.junit.Test;

import cn.openadr.payload.poll.DistributeEventResponse;
import cn.openadr.payload.poll.PendingReportResponse;
import cn.openadr.payload.poll.PollRequest;
import cn.openadr.payload.poll.PollResponse;
import cn.openadr.payload.poll.ReregistrationResponse;
import cn.openadr.payload.poll.RereportResponse;
import cn.openadr.payload.poll.UpdateReportResponse;
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
	public void testDistributeEventResponse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		DistributeEventResponse rep = new DistributeEventResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testRereportReponse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		UpdateReportResponse rep = new UpdateReportResponse(req);
		CommonUtils.fillResponse(rep);

		rep.setReportSpecifierID(CommonUtils.id());

		object = rep;
	}

	@Test
	public void testRereportResponse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		RereportResponse rep = new RereportResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testUpdateReportResponse() {
		PollRequest req = new PollRequest();
		CommonUtils.fillRequest(req);

		UpdateReportResponse rep = new UpdateReportResponse(req);
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
