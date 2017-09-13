package cn.openadr.payload.rpt;

import cn.openadr.payload.DRResponse;

public class ReportResponse<T extends ReportRequest> extends DRResponse<T> {
	private static final long serialVersionUID = 1L;

	public ReportResponse(T request) {
		super(request);
	}

	public String getReportRequestID() {
		return request.getReportRequestID();
	}
}
