package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.OptResponse;

@Path("/opt")
public interface RestOpt extends RestApi {
	@POST
	@Path("/create")
	OptResponse create(CreateOptRequest request);

	@POST
	@Path("/cancel")
	OptResponse cancel(CancelOptRequest request);
}
