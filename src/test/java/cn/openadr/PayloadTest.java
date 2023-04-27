package cn.openadr;

import org.junit.jupiter.api.Test;
import cn.openadr.payload.DRPayload;
import cn.openadr.payload.SignMethod;
import cn.openadr.payload.opt.CancelOptRequest;

public class PayloadTest extends AbstractTest {
	@Test
	public void testPayload() {
		DRPayload payload = new DRPayload();

		CancelOptRequest req = new CancelOptRequest();
		payload.getSignedObject()
			.setId(req.getClass()
				.getSimpleName());
		payload.getSignedObject()
			.setCancelOptRequest(req);
		payload.setSignMethod(SignMethod.HmacMD5);

		object = payload;
	}
}
