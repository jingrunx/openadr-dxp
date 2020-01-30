package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.evt.DistributeEventRequest;
import cn.openadr.payload.evt.QueryEventRequest;

@Path("/event")
public interface RestEvent extends RestApi {
	/**
	 * 查询
	 */
	@POST
	@Path("/query")
	DistributeEventRequest request(QueryEventRequest request);
}
