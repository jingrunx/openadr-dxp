package cn.openadr.utils;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;

import cn.openadr.domain.ElectricMetric;
import cn.openadr.domain.EndDeviceAssetType;
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
		for (String metric : Arrays.asList(ElectricMetric.VOLTAGE, ElectricMetric.POWER_ACTIVE)) {
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
		r.setType(ReportType.X_RESOURCE_STATUS);
		r.setStartDateTime(CommonUtils.dtstart());
		r.setEndDateTime(r.getStartDateTime()
			.plusYears(1));
		r.setInterval(Days.ONE.toPeriod());
		r.setPeriod(Minutes.ONE.toPeriod());

		fillPointMetaData(r.getPoints());
	}

	public static void fillResourceModel(ResourceModel r) {
		r.setAsset(new EndDeviceAsset(EndDeviceAssetType.Water_Heater));
		r.getAsset()
			.setName("电热水器");
		r.getMetrics()
			.add(MetricUtils.createMetric(ElectricMetric.VOLTAGE, "电压"));
		r.getMetrics()
			.add(MetricUtils.createMetric(ElectricMetric.POWER_ACTIVE, "功率"));
	}
}
