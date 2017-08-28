package cn.openadr;

import org.junit.Test;

import cn.openadr.domain.TransportType;
import cn.openadr.payload.reg.CancelRegistrationRequest;
import cn.openadr.payload.reg.CancelRegistrationResponse;
import cn.openadr.payload.reg.CreateRegistrationRequest;
import cn.openadr.payload.reg.CreateRegistrationResponse;
import cn.openadr.payload.reg.QueryRegistrationRequest;
import cn.openadr.payload.reg.QueryRegistrationResponse;

public class RegistrationTest extends AbstractJsonTest<Object>{
	
	@Test
	public void testQueryRegistrationRequest(){
		QueryRegistrationRequest request = new QueryRegistrationRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setRegistrationID(FillUtils.uuid());
		request.setVersion(0);
		object = request;
	}
	
	@Test
	public void testQueryRegistrationResponse(){
		QueryRegistrationRequest request = new QueryRegistrationRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setRegistrationID(FillUtils.uuid());
		request.setVersion(0);
		QueryRegistrationResponse response = new QueryRegistrationResponse(request);
		response.setId(FillUtils.uuid());
		response.setCode(200);
		response.setReason("no reason");
		object = response;
	}
	@Test
	public void testCreateRegistrationRequest(){
		CreateRegistrationRequest request =new CreateRegistrationRequest();
		request.setDnID(FillUtils.uuid());
		request.setEndpoint("www.openadr.cn");
		request.setId(FillUtils.uuid());
		request.setProfile("unknown");//此处存在疑问，是否该传一个Profile对象
		request.setPullMode(true);
		request.setRegistrationID(FillUtils.uuid());
		request.setReportOnly(false);
		request.setTransport(TransportType.JSON);
		request.setVersion(0);
		object  = request;
	}
	@Test
	public void testCreateRegistrationResponse(){
		CreateRegistrationRequest request =new CreateRegistrationRequest();
		request.setDnID(FillUtils.uuid());
		request.setEndpoint("www.openadr.cn");
		request.setId(FillUtils.uuid());
		request.setProfile("unknown");//此处存在疑问，是否该传一个Profile对象
		request.setPullMode(true);
		request.setRegistrationID(FillUtils.uuid());
		request.setReportOnly(false);
		request.setTransport(TransportType.JSON);
		request.setVersion(0);
		CreateRegistrationResponse response =new CreateRegistrationResponse(request);
		response.setId(FillUtils.uuid());
		response.setCode(200);
		response.setPollFreq(10);
		response.setReason("no reason");
		response.setVtnID(FillUtils.uuid());
		object  = response;
	}
	@Test
	public void testCancelRegstrationRequest() {
		CancelRegistrationRequest request =new CancelRegistrationRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setRegistrationID(FillUtils.uuid());
		request.setVersion(0);
		object  = request;
	}
	@Test
	public void testCancelRegstrationResponse() {
		CancelRegistrationRequest request =new CancelRegistrationRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setRegistrationID(FillUtils.uuid());
		request.setVersion(0);
		CancelRegistrationResponse response =new CancelRegistrationResponse(request);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
		object  = request;
	}
}
