package cn.openadr.utils;

import java.time.Duration;
import java.time.LocalDateTime;

import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import cn.openadr.model.report.MetricDescription;
import cn.openadr.model.report.PointCurveData;
import cn.openadr.model.report.PointData;
import cn.openadr.tsdb.Data;
import cn.openadr.tsdb.IrregularCurve;
import cn.openadr.tsdb.RegularCurve;

public class MetricUtils {
	public static void fillMetric(MetricDescription metric) {
		metric.setMultiplier(UnitMultiplier.k);
		metric.setSymbol(UnitSymbol.W);
	}

	public static MetricDescription createMetric(String metric, String metricName) {
		MetricDescription descr = new MetricDescription();

		descr.setMetricName(metric);
		fillMetric(descr);

		return descr;
	}

	public static PointData createPointValue(int rID, double val) {
		PointData value = new PointData(rID);

		value.setValue(val);
		value.setTimestamp(LocalDateTime.now());

		return value;
	}

	public static PointCurveData createPointValues(int rID) {
		PointCurveData value = new PointCurveData(rID);
		fillRegular(value.getRegular());
		return value;
	}

	public static void fillRegular(RegularCurve regular) {
		regular.setDtstart(CommonUtils.dtstart());
		regular.setPeriod(Duration.ofHours(1));
		double[] array = new double[24];
		for(int i = 0; i < array.length; ++i) {
			array[i] = (int) (Math.sin(i) * 1000 + 1000);
		}
		regular.setArray(array);
	}

	public static void fillIrregular(IrregularCurve irregular) {
		LocalDateTime dtstart = CommonUtils.dtstart();

		irregular.addValue(new Data(100.0d, dtstart, null));
		irregular.addValue(new Data(200.0d, dtstart.plusMinutes(15), null));
		irregular.addValue(new Data(400.0d, dtstart.plusHours(1), null));
	}
}
