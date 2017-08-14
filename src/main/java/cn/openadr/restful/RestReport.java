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
import cn.openadr.payload.rpt.MetaDataReportRequest;
import cn.openadr.payload.rpt.RegisterReportRequest;
import cn.openadr.payload.rpt.RegisterReportResponse;

/** 报告 */
@Path("/report")
public interface RestReport {
	/** VEN注册默认报告 */
	@POST
	@Path("/register")
	RegisterReportResponse register(RegisterReportRequest request);

	/** VTN要求VEN创建报告 */
	@POST
	@Path("/create")
	CreateReportResponse create(CreateReportRequest request);

	/** 取消报告 */
	@POST
	@Path("/cancel")
	CancelReportResponse cancel(CancelReportRequest request);

	/** 元数据 */
	@POST
	@Path("/metadata")
	DataReportResponse metadata(MetaDataReportRequest request);

	/** 实时数据 */
	@POST
	@Path("/live")
	DataReportResponse live(LiveReportRequest request);

	/** 历史数据 */
	@POST
	@Path("/history")
	DataReportResponse history(HistoryReportRequest request);
}
