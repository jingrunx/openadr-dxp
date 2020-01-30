package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.payload.DNRequest;

// OadrCancelReportType
@lombok.Getter
@lombok.Setter
public class CancelReportRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<String> reportRequestID = new ArrayList<>();
	public boolean reportToFollow;
}
