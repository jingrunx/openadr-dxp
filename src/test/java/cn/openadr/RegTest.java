package cn.openadr;

import org.joda.time.Minutes;
import org.junit.Test;

import cn.openadr.domain.ServiceName;
import cn.openadr.domain.TransportType;
import cn.openadr.model.register.ServiceSpecific;
import cn.openadr.payload.reg.CancelRegistrationRequest;
import cn.openadr.payload.reg.CancelRegistrationResponse;
import cn.openadr.payload.reg.CreateRegistrationRequest;
import cn.openadr.payload.reg.CreateRegistrationResponse;
import cn.openadr.payload.reg.QueryRegistrationRequest;
import cn.openadr.payload.reg.QueryRegistrationResponse;
import cn.openadr.utils.CommonUtils;

public class RegTest extends AbstractTest {

	@Test
	public void testQueryRegistrationRequest() {
		QueryRegistrationRequest req = new QueryRegistrationRequest();
		CommonUtils.fillRegRequest(req);

		object = req;
	}

	@Test
	public void testQueryRegistrationResponse() {
		QueryRegistrationRequest req = new QueryRegistrationRequest();
		CommonUtils.fillRegRequest(req);

		QueryRegistrationResponse rep = new QueryRegistrationResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testCreateRegistrationRequest() {
		CreateRegistrationRequest req = new CreateRegistrationRequest();
		CommonUtils.fillRegRequest(req);

		req.setDnName("dnname");
		req.setReportOnly(false);
		req.setTransport(TransportType.JSON);
		req.setEndpoint("http://www.openadr.cn/rest/api/");
		req.setProfile("unknown");//此处存在疑问，是否该传一个Profile对象
		req.setPullMode(true);

		object = req;
	}

	@Test
	public void testCreateRegistrationResponse() {
		CreateRegistrationRequest req = new CreateRegistrationRequest();
		CommonUtils.fillRegRequest(req);

		CreateRegistrationResponse rep = new CreateRegistrationResponse(req);
		CommonUtils.fillResponse(rep);

		rep.setUnID(CommonUtils.id());
		rep.setPollFreq(Minutes.minutes(5)
			.toPeriod());

		rep.getTransport()
			.add(TransportType.JSON);

		ServiceSpecific spec = new ServiceSpecific();
		spec.setName(ServiceName.EI_EVENT);
		spec.getInfo()
			.put("IP", "192.168.1.1");
		spec.getInfo()
			.put("PORT", "80");
		rep.getService()
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
		CancelRegistrationRequest req = new CancelRegistrationRequest();
		CommonUtils.fillRegRequest(req);

		CancelRegistrationResponse rep = new CancelRegistrationResponse(req);
		CommonUtils.fillResponse(rep);
		object = rep;
	}
}
