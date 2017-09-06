package cn.openadr;

import org.joda.time.DateTime;
import org.junit.Test;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.OptResponse;
import cn.openadr.utils.CommonUtils;

public class OptTest extends AbstractTest {
	@Test
	public void testCreateOptRequest() {
		CreateOptRequest req = new CreateOptRequest();
		CommonUtils.fillOptRequest(req);

		req.setType(OptType.OPT_OUT);
		req.setOptReason(OptReason.ECONOMIC);
		req.setEventID(CommonUtils.id());
		req.setCreatedDateTime(DateTime.now());
		CommonUtils.fillEndDeviceAsset(req.getTarget());

		object = req;
	}

	@Test
	public void testCancelOptRequest() {
		CancelOptRequest req = new CancelOptRequest();
		CommonUtils.fillOptRequest(req);

		object = req;
	}

	@Test
	public void testOptResponse() {
		CreateOptRequest req = new CreateOptRequest();
		CommonUtils.fillOptRequest(req);

		OptResponse rep = new OptResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}
}
