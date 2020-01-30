package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.DRObject;
import cn.openadr.payload.poll.DrResponse;
import cn.openadr.payload.poll.Poll;

@Path("/poll")
public interface RestPoll extends RestApi {
	/**
	 * 查询事件或报表
	 */
	@POST
	@Path("/request")
	DRObject request(Poll request);

	@POST
	@Path("/response")
	void response(DrResponse response);
}
