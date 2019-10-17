package cn.openadr.payload.rpt;

import cn.openadr.model.report.PendingReports;
import cn.openadr.payload.DNResponse;

/**
 * 由UN发起，要求DN按照规范要求创建的自定义报表
 */
// OadrCreatedReportType
@lombok.Getter
public class CreateReportResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	private final PendingReports pendingReports = new PendingReports();
}
