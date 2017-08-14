package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.pull.PullRequest;
import cn.openadr.payload.pull.PullResponse;

@Path("/pull")
public interface RestPull extends RestApi {
	/** 查询事件或报表 */
	@POST
	@Path("/")
	PullResponse query(PullRequest request);

	/** 查询事件 */
	@POST
	@Path("/event")
	PullResponse event(PullRequest request);

	/** 查询报表 */
	@POST
	@Path("/report")
	PullResponse report(PullRequest request);
}
