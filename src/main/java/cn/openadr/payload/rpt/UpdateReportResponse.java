package cn.openadr.payload.rpt;

import cn.openadr.payload.DNResponse;

// OadrUpdatedReportType
public class UpdateReportResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	private CancelReportRequest cancelReport;

	public CancelReportRequest getCancelReport() {
		return cancelReport;
	}

	public void setCancelReport(CancelReportRequest cancelReport) {
		this.cancelReport = cancelReport;
	}
}
