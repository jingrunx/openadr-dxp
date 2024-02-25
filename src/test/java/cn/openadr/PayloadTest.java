package cn.openadr;

import org.apache.commons.lang3.ClassUtils;
import org.junit.jupiter.api.Test;
import cn.openadr.payload.DRPayload;
import cn.openadr.payload.SignMethod;
import cn.openadr.payload.SignedObject;
import cn.openadr.payload.opt.CancelOptRequest;

public class PayloadTest extends AbstractTest {
	@Test
	public void testPayload() {
		DRPayload payload = new DRPayload();

		CancelOptRequest req = new CancelOptRequest();
		SignedObject signedObject = payload.getSignedObject();
		signedObject.setId(ClassUtils.getSimpleName(req.getClass()));
		signedObject.setCancelOptRequest(req);
		payload.setSignMethod(SignMethod.HmacMD5);

		object = payload;
	}
}
