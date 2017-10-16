package cn.openadr.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Hours;

import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import cn.openadr.model.report.MetricMetaData;
import cn.openadr.model.report.PointCurveData;
import cn.openadr.model.report.PointData;
import cn.openadr.tsdb.IrregularCurve;
import cn.openadr.tsdb.Point;
import cn.openadr.tsdb.QualityData;
import cn.openadr.tsdb.RegularCurve;
import cn.openadr.tsdb.TagKey;

public class MetricUtils {
	public static void fillMetric(MetricMetaData metric) {
		metric.setMultiplier(UnitMultiplier.k);
		metric.setSymbol(UnitSymbol.W);
	}

	public static MetricMetaData createMetric(String metric, String metricName) {
		MetricMetaData r = new MetricMetaData();

		r.setMetric(metric);
		fillMetric(r);

		return r;
	}

	public static void fillPoint(Point point, String metric, String resourceID) {
		point.setMetric(metric);
		point.getTags()
			.put(TagKey.device, resourceID);
		point.getTags()
			.put(TagKey.customer, CommonUtils.id());
		point.getTags()
			.put(TagKey.catalog, CommonUtils.id());
		point.getTags()
			.put(TagKey.facility, CommonUtils.id());
	}

	public static PointData createPointValue(int rID, double val) {
		PointData value = new PointData(rID);

		value.setValue(val);
		value.setTimestamp(DateTime.now());

		return value;
	}

	public static PointCurveData createPointValues(int rID) {
		PointCurveData value = new PointCurveData(rID);
		fillRegular(value.getRegular());
		return value;
	}

	public static void fillRegular(RegularCurve regular) {
		regular.setDtstart(CommonUtils.dtstart());
		regular.setPeriod(Hours.ONE.toPeriod()
			.toPeriod());
		double[] array = new double[DateTimeConstants.HOURS_PER_DAY];
		for (int i = 0; i < array.length; ++i) {
			array[i] = (int) (Math.sin(i) * 1000 + 1000);
		}
		regular.setArray(array);
	}

	public static void fillIrregular(IrregularCurve irregular) {
		DateTime dtstart = CommonUtils.dtstart();

		irregular.getValues()
			.add(new QualityData(100.0d, dtstart));
		irregular.getValues()
			.add(new QualityData(200.0d, dtstart.plusMinutes(15)));
		irregular.getValues()
			.add(new QualityData(400.0d, dtstart.plusHours(1)));
	}
}
