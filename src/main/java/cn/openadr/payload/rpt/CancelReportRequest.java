package cn.openadr.payload.rpt;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.payload.DNRequest;

// OadrCancelReportType
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
public class CancelReportRequest extends DNRequest {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<Long> reportRequestID = new ArrayList<>();
	public boolean reportToFollow;

	public CancelReportRequest(Long reportRequestID) {
		this(reportRequestID, false);
	}

	public CancelReportRequest(Long reportRequestID, boolean reportToFollow) {
		this.reportRequestID.add(reportRequestID);
		this.reportToFollow = reportToFollow;
	}
}
