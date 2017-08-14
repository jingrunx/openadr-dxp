package cn.openadr.payload.rpt;

import cn.openadr.payload.OadrResponse;

public class ReportResponse<R extends ReportRequest> extends OadrResponse<R> {
	private static final long serialVersionUID = 1L;

	public ReportResponse(R request) {
		super(request);
	}

	public String getReportRequestID() {
		return request.getReportRequestID();
	}
}
