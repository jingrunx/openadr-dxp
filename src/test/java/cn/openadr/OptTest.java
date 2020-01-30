package cn.openadr;

import org.joda.time.DateTime;
import org.junit.Test;
import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;
import cn.openadr.utils.CommonUtils;

public class OptTest extends AbstractTest {
	@Test
	public void testCreateOptRequest() {
		CreateOptRequest req = new CreateOptRequest();
		CommonUtils.fillOptRequest(req);

		req.getQualifiedEventID()
			.setEventID(CommonUtils.id());
		req.getQualifiedEventID()
			.setModificationNumber(1);
		req.setOptType(OptType.OPT_OUT);
		req.setOptReason(OptReason.ECONOMIC);
		req.setCreatedDateTime(DateTime.now());
		CommonUtils.fillEndDeviceAsset(req.getTarget());

		object = req;
	}

	@Test
	public void testCreateOptResponse() {
		CreateOptResponse rep = new CreateOptResponse();
		CommonUtils.fillResponse(rep);

		rep.setOptID(CommonUtils.id());

		object = rep;
	}

	@Test
	public void testCancelOptRequest() {
		CancelOptRequest req = new CancelOptRequest();
		CommonUtils.fillOptRequest(req);

		object = req;
	}

	@Test
	public void testCancelOptResponse() {
		CancelOptResponse rep = new CancelOptResponse();
		CommonUtils.fillResponse(rep);

		rep.setOptID(CommonUtils.id());

		object = rep;
	}
}
