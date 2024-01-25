package cn.openadr.payload.rpt;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.ReportRequest;
import cn.openadr.payload.DNRequest;

/**
 * 由DN主动创建的或者由UN发起创建的报告，作为定期传送数据的规范
 */
// OadrCreateReportType
@lombok.Getter
@lombok.NoArgsConstructor
public class CreateReportRequest extends DNRequest {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 报表样式
	 */
	public final List<ReportRequest> reportRequest = new ArrayList<>();

	public CreateReportRequest(ReportRequest reportRequest) {
		this.reportRequest.add(reportRequest);
	}
}
