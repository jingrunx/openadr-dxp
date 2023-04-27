package cn.openadr.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import cn.openadr.domain.MetricType2;
import cn.openadr.domain.ReportName;
import cn.openadr.domain.ReportType;
import cn.openadr.model.report.ReportDescription;
import cn.openadr.model.report.ReportSpecifier;
import cn.openadr.payload.rpt.DataReportRequest;

public class RptUtils {
	public static void fillDataReportRequest(DataReportRequest req) {
		CommonUtils.fillRequest(req);

		req.setReportRequestID(CommonUtils.id());
		req.setCreatedDateTime(LocalDateTime.now());
	}

	public static void fillReportDescription(List<ReportDescription> points) {
		for(String metric : Arrays.asList(MetricType2.U, MetricType2.P)) {
			ReportDescription point = new ReportDescription();
			point.setRID(1);
			// point.setMetric(metric);
			point.getReportDataSource()
				.getResourceID()
				.add("resourceID#1");

			point.getSamplingRate()
				.setMinPeriod(Duration.ofMinutes(1));
			point.getSamplingRate()
				.setMaxPeriod(Duration.ofHours(1));

			points.add(point);
		}
	}

	public static void fillReportSpecifier(ReportSpecifier r) {
		r.setReportName(ReportName.HISTORY_USAGE.name());
		r.setReportType(ReportType.X_RESOURCE_STATUS);
		r.setStartDateTime(CommonUtils.dtstart());
		r.setEndDateTime(r.getStartDateTime()
			.plusYears(1));
		r.setBackDuration(Duration.ofDays(1));
		r.setPeriod(Duration.ofMinutes(1));

		r.getPoints()
			.addAll(Arrays.asList(1, 2, 3, 4, 5));
	}
}
