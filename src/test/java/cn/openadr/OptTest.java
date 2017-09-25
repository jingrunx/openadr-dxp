package cn.openadr;

import org.joda.time.DateTime;
import org.junit.Test;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.model.event.EventDescriptor;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;
import cn.openadr.utils.CommonUtils;

public class OptTest extends AbstractTest {
	@Test
	public void testCreateOptRequest() {
		EventDescriptor evtDesc = new EventDescriptor();
		evtDesc.setEventID(CommonUtils.id());
		evtDesc.setModificationNumber(1);

		CreateOptRequest req = new CreateOptRequest(evtDesc);
		CommonUtils.fillOptRequest(req);

		req.setOptType(OptType.OPT_OUT);
		req.setOptReason(OptReason.ECONOMIC);
		req.setCreatedDateTime(DateTime.now());
		CommonUtils.fillEndDeviceAsset(req.getTarget());

		object = req;
	}

	@Test
	public void testCreateOptResponse() {
		EventDescriptor evtDesc = new EventDescriptor();
		evtDesc.setEventID(CommonUtils.id());
		evtDesc.setModificationNumber(1);

		CreateOptRequest req = new CreateOptRequest(evtDesc);
		CommonUtils.fillOptRequest(req);

		CreateOptResponse rep = new CreateOptResponse(req);
		CommonUtils.fillResponse(rep);

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
		CancelOptRequest req = new CancelOptRequest();
		CommonUtils.fillOptRequest(req);

		CancelOptResponse rep = new CancelOptResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}
}
