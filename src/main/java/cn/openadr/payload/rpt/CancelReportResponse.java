package cn.openadr.payload.rpt;

import cn.openadr.model.report.PendingReports;
import cn.openadr.payload.DNResponse;

// OadrCanceledReportType
@lombok.Getter
@lombok.Setter
public class CancelReportResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	private final PendingReports pendingReports = new PendingReports();
}
