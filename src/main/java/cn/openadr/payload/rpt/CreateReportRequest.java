package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.ReportRequest;
import cn.openadr.payload.DNRequest;

/**
 * 由DN主动创建的或者由UN发起创建的报告，作为定期传送数据的规范
 */
// OadrCreateReportType
@lombok.Getter
public class CreateReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	/**
	 * 报表样式
	 */
	private final List<ReportRequest> reportRequest = new ArrayList<>();
}
