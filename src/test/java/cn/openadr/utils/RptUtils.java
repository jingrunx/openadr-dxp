package cn.openadr.utils;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;

import cn.openadr.domain.EndDeviceAssetType;
import cn.openadr.domain.MetricType;
import cn.openadr.domain.ReportName;
import cn.openadr.domain.ReportType;
import cn.openadr.model.report.PointMetaData;
import cn.openadr.model.report.ReportSpecifier;
import cn.openadr.model.report.ResourceModel;
import cn.openadr.model.target.EndDeviceAsset;
import cn.openadr.payload.rpt.DataReportRequest;

public class RptUtils {
	public static void fillDataReportRequest(DataReportRequest req) {
		CommonUtils.fillRptRequest(req);

		req.setReportSpecifierID(CommonUtils.id());
		req.setCreatedDateTime(DateTime.now());
	}

	public static void fillPointMetaData(List<PointMetaData> points) {
		for (String metric : Arrays.asList(MetricType.VOLTAGE, MetricType.POWER_ACTIVE)) {
			PointMetaData point = new PointMetaData();
			point.setrID(1);
			point.setMetric(metric);
			point.setResourceID("resourceID#1");

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
		r.setInterval(Days.ONE.toPeriod());
		r.setPeriod(Minutes.ONE.toPeriod());

		r.getPoints()
			.addAll(Arrays.asList(1, 2, 3, 4, 5));
	}

	public static void fillResourceModel(ResourceModel r) {
		EndDeviceAsset asset = new EndDeviceAsset();
		asset.setMrid(EndDeviceAssetType.Water_Heater.name());
		r.setAsset(asset);
		r.getMetrics()
			.add(MetricUtils.createMetric(MetricType.VOLTAGE, "电压"));
		r.getMetrics()
			.add(MetricUtils.createMetric(MetricType.POWER_ACTIVE, "功率"));
	}
}
