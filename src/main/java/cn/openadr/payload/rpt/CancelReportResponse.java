package cn.openadr.payload.rpt;

import javax.validation.constraints.NotNull;

import cn.openadr.model.report.PendingReports;
import cn.openadr.payload.DNResponse;

// OadrCanceledReportType
public class CancelReportResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	@NotNull
	private final PendingReports pendingReports = new PendingReports();

	public PendingReports getPendingReports() {
		return pendingReports;
	}
}
