package cn.openadr.payload.rpt;

public class CancelReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	private boolean reportToFollow;

	public boolean isReportToFollow() {
		return reportToFollow;
	}

	public void setReportToFollow(boolean reportToFollow) {
		this.reportToFollow = reportToFollow;
	}
}
