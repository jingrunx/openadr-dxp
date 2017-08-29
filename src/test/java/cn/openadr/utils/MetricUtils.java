package cn.openadr.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Hours;

import cn.openadr.domain.MetricType;
import cn.openadr.domain.ReadingType;
import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import cn.openadr.model.report.MetricMetaData;
import cn.openadr.model.report.PointValue;
import cn.openadr.model.report.PointValues;
import cn.openadr.tsdb.IrregularPart;
import cn.openadr.tsdb.Point;
import cn.openadr.tsdb.RegularPart;
import cn.openadr.tsdb.TagKey;
import cn.openadr.tsdb.ValuePart;

public class MetricUtils {
	public static void fillMetric(MetricMetaData metric) {
		metric.setName(MetricType.POWER_ACTIVE.value());
		metric.setReadingType(ReadingType.DIRECT_READ);
		metric.setMultiplier(UnitMultiplier.k);
		metric.setSymbol(UnitSymbol.W);
	}

	public static void fillPoint(Point point, MetricType metric, String resourceID) {
		point.setMetric(metric.value());
		point.getTags()
			.put(TagKey.device, resourceID);
	}

	public static PointValue createPointValue(MetricType metric, String resourceID, double val) {
		PointValue value = new PointValue();

		fillPoint(value, metric, resourceID);

		value.getValue()
			.setValue(val);
		value.getValue()
			.setTimestamp(DateTime.now());

		return value;
	}

	public static PointValues createPointValues(MetricType metric, String resourceID) {
		PointValues value = new PointValues();

		fillPoint(value, metric, resourceID);

		fillRegular(value.getRegular());

		return value;
	}

	public static void fillRegular(RegularPart regular) {
		regular.setDtstart(CommonUtils.dtstart());
		regular.setPeriod(Hours.ONE.toPeriod()
			.toPeriod());
		double[] array = new double[DateTimeConstants.HOURS_PER_DAY];
		for (int i = 0; i < array.length; ++i) {
			array[i] = (int) (Math.sin(i) * 1000 + 1000);
		}
		regular.setArray(array);
	}

	public static void fillIrregular(IrregularPart irregular) {
		DateTime dtstart = CommonUtils.dtstart();

		irregular.getValues()
			.add(new ValuePart(100.0d, dtstart));
		irregular.getValues()
			.add(new ValuePart(200.0d, dtstart.plusMinutes(15)));
		irregular.getValues()
			.add(new ValuePart(400.0d, dtstart.plusHours(1)));
	}
}
