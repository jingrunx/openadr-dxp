package cn.openadr.payload.rpt;

import java.io.Serial;

import cn.openadr.payload.DNResponse;

// OadrUpdatedReportType
@lombok.Getter
@lombok.Setter
public class UpdateReportResponse extends DNResponse {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public CancelReportRequest cancelReport;
}
