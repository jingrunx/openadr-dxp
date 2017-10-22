package cn.openadr.payload.rpt;

import javax.validation.constraints.NotNull;

import cn.openadr.model.report.PendingReports;
import cn.openadr.payload.DNResponse;

/** 由UN发起，要求DN按照规范要求创建的自定义报表 */
// OadrCreatedReportType
public class CreateReportResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	@NotNull
	private final PendingReports pendingReports = new PendingReports();

	public PendingReports getPendingReports() {
		return pendingReports;
	}
}
