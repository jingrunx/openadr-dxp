package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.model.event.EventResponse;
import cn.openadr.payload.evt.QueryEventRequest;

@Path("/event")
public interface RestEvent extends RestApi {
	/** 查询 */
	@POST
	@Path("/query")
	QueryEventResponse request(QueryEventRequest request);

	@POST
	@Path("/reply")
	EventResponse reply(ReplyEventRequest request);
}
