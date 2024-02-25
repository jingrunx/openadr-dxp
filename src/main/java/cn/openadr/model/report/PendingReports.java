package cn.openadr.model.report;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// OadrPendingReportsType
@lombok.Getter
public class PendingReports implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<Long> reportRequestID = new ArrayList<>();
}
