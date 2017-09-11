package cn.openadr.restful;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.openadr.payload.rpt.CancelReportRequest;
import cn.openadr.payload.rpt.CreateReportRequest;
import cn.openadr.payload.rpt.CreateReportResponse;
import cn.openadr.payload.rpt.DataReportResponse;
import cn.openadr.payload.rpt.HistoryReportRequest;
import cn.openadr.payload.rpt.LiveReportRequest;
import cn.openadr.payload.rpt.MetadataReportRequest;
import cn.openadr.payload.rpt.ReportResponse;

/** 报告 */
@Path("/report")
public interface RestReport extends RestApi {
	/** DN包含的测点信息 */
	@POST
	@Path("/register")
	ReportResponse register(MetadataReportRequest request);

	/** 可以由UN或DN发起 */
	@POST
	@Path("/create")
	CreateReportResponse create(CreateReportRequest request);

	//由UN主动要求DN报送的报告在poll中实现

	/** 取消报告 */
	@POST
	@Path("/cancel")
	ReportResponse cancel(CancelReportRequest request);

	/** 实时数据 */
	@POST
	@Path("/live")
	DataReportResponse live(LiveReportRequest request);

	/** 历史数据 */
	@POST
	@Path("/history")
	DataReportResponse history(HistoryReportRequest request);
}
