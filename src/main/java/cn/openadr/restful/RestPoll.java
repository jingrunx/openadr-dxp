package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.DRResponse;
import cn.openadr.payload.pull.PollRequest;

@Path("/poll")
public interface RestPoll extends RestApi {
	/** 查询事件或报表 */
	@POST
	@Path("/")
	<S extends DRResponse<?>> S query(PollRequest request);

	/** 查询事件 */
	@POST
	@Path("/event")
	<S extends DRResponse<?>> S event(PollRequest request);

	/** 查询报表 */
	@POST
	@Path("/report")
	<S extends DRResponse<?>> S report(PollRequest request);
}
