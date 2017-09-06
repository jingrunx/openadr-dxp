package cn.openadr.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Hours;

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
		metric.setReadingType(ReadingType.DIRECT_READ);
		metric.setMultiplier(UnitMultiplier.k);
		metric.setSymbol(UnitSymbol.W);
	}

	public static MetricMetaData createMetric(String metric, String metricName) {
		MetricMetaData r = new MetricMetaData();

		r.setId(metric);
		r.setName(metricName);
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

	public static PointValue createPointValue(int rID, double val) {
		PointValue value = new PointValue(rID);

		value.setValue(val);
		value.setTimestamp(DateTime.now());

		return value;
	}

	public static PointValues createPointValues(int rID) {
		PointValues value = new PointValues(rID);
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
