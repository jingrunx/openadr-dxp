package cn.openadr.model.report;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.NonNull;

// OadrReportRequestType
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class ReportRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@NonNull
	private String reportRequestID;
	private final ReportSpecifier reportSpecifier = new ReportSpecifier();
}
