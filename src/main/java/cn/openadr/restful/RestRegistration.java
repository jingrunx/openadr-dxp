package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.reg.CancelRegistrationRequest;
import cn.openadr.payload.reg.CancelRegistrationResponse;
import cn.openadr.payload.reg.CreateRegistrationRequest;
import cn.openadr.payload.reg.CreateRegistrationResponse;
import cn.openadr.payload.reg.QueryRegistrationRequest;
import cn.openadr.payload.reg.QueryRegistrationResponse;

@Path("/registration")
public interface RestRegistration extends RestApi {
	@POST
	@Path("/create")
	CreateRegistrationResponse create(CreateRegistrationRequest request);

	@POST
	@Path("/query")
	QueryRegistrationResponse query(QueryRegistrationRequest request);

	@POST
	@Path("/cancel")
	CancelRegistrationResponse cancel(CancelRegistrationRequest request);
}
