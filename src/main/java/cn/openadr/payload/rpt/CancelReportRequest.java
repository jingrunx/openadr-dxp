package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import cn.openadr.payload.DRRequest;

// OadrCancelReportType
public class CancelReportRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	@NotNull
	private boolean reportToFollow;
	@NotNull
	private final List<String> reportRequestID = new ArrayList<>();

	public boolean isReportToFollow() {
		return reportToFollow;
	}

	public void setReportToFollow(boolean reportToFollow) {
		this.reportToFollow = reportToFollow;
	}

	public List<String> getReportRequestID() {
		return reportRequestID;
	}
}
