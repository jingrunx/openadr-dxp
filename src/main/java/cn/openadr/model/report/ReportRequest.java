package cn.openadr.model.report;

import java.io.Serial;
import java.io.Serializable;
import lombok.NoArgsConstructor;

// OadrReportRequestType
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class ReportRequest implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final ReportSpecifier reportSpecifier = new ReportSpecifier();
	public Long reportRequestID;

	public ReportRequest(Long reportRequestID) {
		this.reportRequestID = reportRequestID;
	}
}
