package cn.openadr.model.report;

import java.io.Serializable;

// OadrReportRequestType
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
public class ReportRequest implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final ReportSpecifier reportSpecifier = new ReportSpecifier();
	public String reportRequestID;

	public ReportRequest(String reportRequestID) {
		this.reportRequestID = reportRequestID;
	}
}
