package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.evt.QueryEventRequest;
import cn.openadr.payload.evt.QueryEventResponse;
import cn.openadr.payload.evt.ReplyEventRequest;
import cn.openadr.payload.evt.ReplyEventResponse;

@Path("/event")
public interface RestEvent extends RestApi {
	/** 查询 */
	@POST
	@Path("/query")
	QueryEventResponse request(QueryEventRequest request);

	@POST
	@Path("/reply")
	ReplyEventResponse reply(ReplyEventRequest request);
}
