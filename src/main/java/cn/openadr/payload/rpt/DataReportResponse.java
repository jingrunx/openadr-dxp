package cn.openadr.payload.rpt;

import cn.openadr.payload.DNResponse;

// OadrUpdatedReportType
@lombok.Getter
@lombok.Setter
public class DataReportResponse extends DNResponse {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public CancelReportRequest cancelReport;
}
