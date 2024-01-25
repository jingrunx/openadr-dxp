package cn.openadr.payload.rpt;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.ReportRequest;
import cn.openadr.payload.DNResponse;

// OadrRegisteredReportType
@lombok.Getter
public class RegisterReportResponse extends DNResponse {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<ReportRequest> reportRequest = new ArrayList<>();
}
