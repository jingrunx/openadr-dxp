package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.evt.RequestEventRequest;
import cn.openadr.payload.evt.RequestEventResponse;

@Path("/event")
public interface RestEvent extends RestApi {
	@POST
	@Path("/query")
	RequestEventResponse request(RequestEventRequest request);
}
