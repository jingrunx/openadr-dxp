package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.rpt.CancelReportRequest;
import cn.openadr.payload.rpt.CancelReportResponse;
import cn.openadr.payload.rpt.CreateReportRequest;
import cn.openadr.payload.rpt.CreateReportResponse;
import cn.openadr.payload.rpt.DataReportResponse;
import cn.openadr.payload.rpt.HistoryReportRequest;
import cn.openadr.payload.rpt.LiveReportRequest;
import cn.openadr.payload.rpt.RegisterReportRequest;
import cn.openadr.payload.rpt.RegisterReportResponse;

/** 报告 */
@Path("/report")
public interface RestReport extends RestApi {
	/** DN支持的元数据 */
	@POST
	@Path("/register")
	RegisterReportResponse register(RegisterReportRequest request);

	/** DN注册默认报告 */
	@POST
	@Path("/create")
	CreateReportResponse create(CreateReportRequest request);

	//由UN主动要求DN报送的报告在poll中实现

	/** 取消报告 */
	@POST
	@Path("/cancel")
	CancelReportResponse cancel(CancelReportRequest request);

	/** 实时数据 */
	@POST
	@Path("/update/live")
	DataReportResponse updateLive(LiveReportRequest request);

	/** 历史数据 */
	@POST
	@Path("/update/history")
	DataReportResponse updateHistory(HistoryReportRequest request);
}
