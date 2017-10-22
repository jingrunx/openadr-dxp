package cn.openadr.model.report;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// OadrPendingReportsType
public class PendingReports implements Serializable {
	private static final long serialVersionUID = 1L;

	private final List<String> reportRequestID = new ArrayList<>();

	public List<String> getReportRequestID() {
		return reportRequestID;
	}
}
