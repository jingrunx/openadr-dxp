package cn.openadr;

import java.util.UUID;

import org.joda.time.DateTime;
import org.junit.Test;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.model.target.EndDeviceAsset;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;

public class OptTest extends AbstractJsonTest<Object> {
	@Test
	public void testCreateOptRequest() {
		CreateOptRequest request = new CreateOptRequest();

		request.setCreatedDateTime(DateTime.now());
		request.setType(OptType.OPT_OUT);
		request.setOptReason(OptReason.ECONOMIC);
		request.getTarget()
			.getEndDeviceAsset()
			.add(new EndDeviceAsset(UUID.randomUUID()
				.toString()));

		object = request;
	}
	
	@Test
	public void testCreateOptResponse(){
		CreateOptRequest request = new CreateOptRequest();
		request.setCreatedDateTime(DateTime.now());
		request.setType(OptType.OPT_OUT);
		request.setOptReason(OptReason.ECONOMIC);
		request.getTarget()
			.getEndDeviceAsset()
			.add(new EndDeviceAsset(UUID.randomUUID()
				.toString()));
		CreateOptResponse response = new CreateOptResponse(request);
		response.setId(FillUtils.uuid());
		response.setCode(200);
		response.setReason("no reason");
		object = response;
	}
	@Test
	public void testCancelOptRequest(){
		CancelOptRequest request = new CancelOptRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setOptID(FillUtils.uuid());
		request.setVersion(0);
	}
	
	@Test
	public void testCancelOptResponse(){
		CancelOptRequest request = new CancelOptRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setOptID(FillUtils.uuid());
		request.setVersion(0);
		CancelOptResponse response = new CancelOptResponse(request);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
	}
	
}
