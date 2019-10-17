package cn.openadr.payload.rpt;

import cn.openadr.payload.DNResponse;

// OadrUpdatedReportType
@lombok.Getter
@lombok.Setter
public class UpdateReportResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	private CancelReportRequest cancelReport;
}
