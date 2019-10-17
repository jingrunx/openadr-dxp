package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.payload.DNRequest;

// OadrCancelReportType
@lombok.Getter
@lombok.Setter
public class CancelReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private boolean reportToFollow;
	private final List<String> reportRequestID = new ArrayList<>();
}
