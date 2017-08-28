package cn.openadr;

import java.util.UUID;

import cn.openadr.domain.ReportType;
import cn.openadr.model.report.ReportSpecifier;
import cn.openadr.payload.DRRequest;
import cn.openadr.payload.rpt.ReportRequest;

public class CommonUtils {
	public static String id() {
		return UUID.randomUUID()
			.toString();
	}

	public static void fillRequest(DRRequest r) {
		r.setId(id());
		r.setVersion(1);
		r.setDnID("dn#1");
	}

	public static void fillRptRequest(ReportRequest r) {
		fillRequest(r);
		r.setReportRequestID(id());
	}

	public static void fillReportSpecifier(ReportSpecifier r) {
		r.setType(ReportType.X_RESOURCE_STATUS);
	}
}
