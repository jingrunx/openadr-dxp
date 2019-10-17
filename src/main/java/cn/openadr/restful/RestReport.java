package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.rpt.*;

/** 报告 */
@Path("/report")
public interface RestReport extends RestApi {
	/** DN包含的测点信息 */
	@POST
	@Path("/register")
	RegisterReportResponse register(RegisterReportRequest request);

	/** 可以由UN或DN发起 */
	@POST
	@Path("/create")
	CreateReportResponse create(CreateReportRequest request);

	/** 取消报告 */
	@POST
	@Path("/cancel")
	CancelReportResponse cancel(CancelReportRequest request);

	/** 更新报告 */
	@POST
	@Path("/update")
	UpdateReportResponse update(UpdateReportRequest request);
}
