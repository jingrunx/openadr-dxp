package cn.openadr.payload.rpt;

import cn.openadr.payload.DRResponse;

public class ReportResponse<R extends ReportRequest> extends DRResponse<R> {
	private static final long serialVersionUID = 1L;

	public ReportResponse(R request) {
		super(request);
	}

	public String getReportRequestID() {
		return request.getReportRequestID();
	}
}
