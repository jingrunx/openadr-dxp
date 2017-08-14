package cn.openadr;

import java.util.UUID;

import org.joda.time.DateTime;
import org.junit.Test;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.model.target.EndDeviceAsset;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.OptRequest;

public class OptTest extends AbstractJsonTest<OptRequest> {
	@Test
	public void testOpt() {
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
}
