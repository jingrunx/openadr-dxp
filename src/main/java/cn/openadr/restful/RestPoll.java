package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.pull.PollRequest;
import cn.openadr.payload.pull.PollResponse;

@Path("/poll")
public interface RestPoll extends RestApi {
	/** 查询事件或报表 */
	@POST
	@Path("/")
	PollResponse query(PollRequest request);

	/** 查询事件 */
	@POST
	@Path("/event")
	PollResponse event(PollRequest request);

	/** 查询报表 */
	@POST
	@Path("/report")
	PollResponse report(PollRequest request);
}
