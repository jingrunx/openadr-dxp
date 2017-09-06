package cn.openadr.payload.rpt;

import cn.openadr.payload.DRResponse;

public class ReportResponse extends DRResponse<ReportRequest> {
	private static final long serialVersionUID = 1L;

	public ReportResponse(ReportRequest request) {
		super(request);
	}

	public String getReportRequestID() {
		return request.getReportRequestID();
	}
}
