package cn.openadr;

import org.joda.time.Minutes;
import org.junit.Test;
import cn.openadr.domain.ServiceType;
import cn.openadr.domain.TransportType;
import cn.openadr.model.register.KeyValue;
import cn.openadr.model.register.ServiceSpecific;
import cn.openadr.payload.reg.*;
import cn.openadr.utils.CommonUtils;

public class RegTest extends AbstractTest {

	@Test
	public void testCreateRegistrationRequest() {
		CreateRegistrationRequest req = new CreateRegistrationRequest();
		CommonUtils.fillRegRequest(req);

		req.setDnName("dnname");
		req.setReportOnly(false);
		req.setPullMode(true);
		req.setTransport(TransportType.REST);
		req.setTransportAddress("http://www.openadr.cn/rest/api/");

		object = req;
	}

	@Test
	public void testCreateRegistrationResponse() {
		CreateRegistrationResponse rep = new CreateRegistrationResponse();
		CommonUtils.fillResponse(rep);

		rep.setUnID(CommonUtils.id());
		rep.setPollFreq(Minutes.minutes(5)
			.toPeriod());

		rep.getTransport()
			.add(TransportType.REST);

		ServiceSpecific spec = new ServiceSpecific();
		spec.setServiceName(ServiceType.EVENT);
		spec.getKeyValue()
			.add(new KeyValue("IP", "192.168.1.1"));
		spec.getKeyValue()
			.add(new KeyValue("PORT", "80"));
		rep.getServiceSpecific()
			.add(spec);

		object = rep;
	}

	@Test
	public void testCancelRegstrationRequest() {
		CancelRegistrationRequest req = new CancelRegistrationRequest();
		CommonUtils.fillRegRequest(req);

		object = req;
	}

	@Test
	public void testCancelRegstrationResponse() {
		CancelRegistrationResponse rep = new CancelRegistrationResponse();
		CommonUtils.fillResponse(rep);
		object = rep;
	}

	@Test
	public void testQueryRegistrationRequest() {
		QueryRegistrationRequest req = new QueryRegistrationRequest();
		CommonUtils.fillRequest(req);

		object = req;
	}

	@Test
	public void testReregistrationRequest() {
		ReregistrationRequest req = new ReregistrationRequest();
		CommonUtils.fillRequest(req);

		object = req;
	}
}
