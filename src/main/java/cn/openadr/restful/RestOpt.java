package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;

@Path("/opt")
public interface RestOpt extends RestApi {
	@POST
	@Path("/create")
	CreateOptResponse create(CreateOptRequest request);

	@POST
	@Path("/cancel")
	CancelOptResponse cancel(CancelOptRequest request);
}
