package cn.openadr.payload.pull;

import cn.openadr.payload.DRResponse;

/** 要求DN主动报送报告 */
public class RereportReponse extends DRResponse<PollRequest> {
	private static final long serialVersionUID = 1L;

	private String reportSpecifierID;

	public RereportReponse(PollRequest request) {
		super(request);
	}

	public String getReportSpecifierID() {
		return reportSpecifierID;
	}

	public void setReportSpecifierID(String reportSpecifierID) {
		this.reportSpecifierID = reportSpecifierID;
	}
}
