package cn.openadr.model.report;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.NonNull;

// OadrReportRequestType
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class ReportRequest implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@NonNull
	public String reportRequestID;
	public final ReportSpecifier reportSpecifier = new ReportSpecifier();
}
