package cn.openadr.utils;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;

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
		req.setCreatedDateTime(DateTime.now());
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
				.setMinPeriod(Minutes.ONE.toPeriod());
			point.getSamplingRate()
				.setMaxPeriod(Hours.ONE.toPeriod());

			points.add(point);
		}
	}

	public static void fillReportSpecifier(ReportSpecifier r) {
		r.setReportName(ReportName.HISTORY_USAGE.name());
		r.setReportType(ReportType.X_RESOURCE_STATUS);
		r.setStartDateTime(CommonUtils.dtstart());
		r.setEndDateTime(r.getStartDateTime()
			.plusYears(1));
		r.setBackDuration(Days.ONE.toPeriod());
		r.setPeriod(Minutes.ONE.toPeriod());

		r.getPoints()
			.addAll(Arrays.asList(1, 2, 3, 4, 5));
	}
}
