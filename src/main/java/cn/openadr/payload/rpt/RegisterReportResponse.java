package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.ReportRequest;
import cn.openadr.payload.DNResponse;

// OadrRegisteredReportType
@lombok.Getter
public class RegisterReportResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	private final List<ReportRequest> reportRequest = new ArrayList<>();
}
