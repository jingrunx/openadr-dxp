package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.reg.*;

@Path("/registration")
public interface RestRegistration extends RestApi {
	@POST
	@Path("/create")
	CreateRegistrationResponse create(CreateRegistrationRequest request);

	@POST
	@Path("/query")
	CreateRegistrationResponse query(QueryRegistrationRequest request);

	@POST
	@Path("/cancel")
	CancelRegistrationResponse cancel(CancelRegistrationRequest request);
}
