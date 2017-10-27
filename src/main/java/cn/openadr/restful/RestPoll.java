package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.DRRequest;
import cn.openadr.payload.poll.Poll;

@Path("/poll")
public interface RestPoll extends RestApi {
	/** 查询事件或报表 */
	@POST
	@Path("/")
	<S extends DRRequest> S poll(Poll request);
}
