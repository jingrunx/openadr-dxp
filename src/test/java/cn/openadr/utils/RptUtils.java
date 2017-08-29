package cn.openadr.utils;

import java.util.AbstractMap;
import java.util.Arrays;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;

import cn.openadr.domain.MetricType;
import cn.openadr.domain.ReportType;
import cn.openadr.model.report.PointMetaData;
import cn.openadr.model.report.ReportSpecifier;
import cn.openadr.payload.rpt.DataReportRequest;
import cn.openadr.tsdb.TagKey;

public class RptUtils {
	public static void fillDataReportRequest(DataReportRequest req) {
		CommonUtils.fillRptRequest(req);

		req.setReportSpecifierID(CommonUtils.id());
		req.setCreatedDateTime(DateTime.now());
	}

	public static void fillReportSpecifier(ReportSpecifier r) {
		r.setType(ReportType.X_RESOURCE_STATUS);
		r.setStartDateTime(CommonUtils.dtstart());
		r.setEndDateTime(r.getStartDateTime()
			.plusYears(1));
		r.setInterval(Days.ONE.toPeriod());
		r.setPeriod(Minutes.ONE.toPeriod());
		r.setGranularity(Minutes.minutes(15)
			.toPeriod());

		String resourceID = CommonUtils.id();
		for (MetricType metric : Arrays.asList(MetricType.VOLTAGE, MetricType.POWER_ACTIVE)) {
			PointMetaData point = new PointMetaData();
			point.getMetric()
				.setName(metric.value());
			point.getTags()
				.put(TagKey.device, new AbstractMap.SimpleImmutableEntry<>(resourceID, "r#1"));

			point.getSamplingRate()
				.setMinPeriod(Minutes.ONE.toPeriod());
			point.getSamplingRate()
				.setMaxPeriod(Hours.ONE.toPeriod());

			r.getPoints()
				.add(point);
		}
	}
}
