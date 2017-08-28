package cn.openadr;

import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;

import cn.openadr.domain.EndDeviceAssetType;
import cn.openadr.domain.MetricType;
import cn.openadr.domain.SignalType;
import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import cn.openadr.model.event.EventActivePeriod;
import cn.openadr.model.event.EventBaseline;
import cn.openadr.model.event.EventSignal;
import cn.openadr.model.event.Intervals;
import cn.openadr.model.target.EndDeviceAsset;
import cn.openadr.tsdb.IrregularPart;
import cn.openadr.tsdb.RegularPart;
import cn.openadr.tsdb.ValuePart;

public class FillUtils {
	private static DateTime dtstart = LocalDate.now()
		.toDateTimeAtStartOfDay();

	public String uuid() {
		return UUID.randomUUID()
			.toString();
	}

	public static void fillRegular(RegularPart regular) {
		regular.setDtstart(dtstart);
		regular.setPeriod(Minutes.minutes(15)
			.toPeriod());
		double[] array = new double[96];
		for (int i = 0; i < array.length; ++i) {
			array[i] = Math.sqrt(i);
		}
		regular.setArray(array);
	}

	public static void fillIrregular(IrregularPart irregular) {
		irregular.getValues()
			.add(new ValuePart(100.0d, dtstart));
		irregular.getValues()
			.add(new ValuePart(200.0d, dtstart.plusMinutes(15)));
		irregular.getValues()
			.add(new ValuePart(400.0d, dtstart.plusHours(1)));
	}

	public static void fillActivePeriod(EventActivePeriod activePeriod) {
		activePeriod.setDtstart(dtstart);
		activePeriod.setDuration(Hours.TWO.toPeriod());
		activePeriod.setRampup(Minutes.minutes(15)
			.toPeriod());
	}

	public static void fillEventSignal(EventSignal signal) {
		signal.getMetric()
			.setName(MetricType.POWER_ACTIVE.value());
		signal.getMetric()
			.setMultiplier(UnitMultiplier.k);
		signal.getMetric()
			.setSymbol(UnitSymbol.W);
		signal.setType(SignalType.LEVEL);
		signal.setValue(120);
		signal.getTarget()
			.getEndDeviceAsset()
			.add(new EndDeviceAsset(EndDeviceAssetType.Energy_Management_System));
	}

	public static void fillBaseline(EventBaseline baseline) {
		Intervals interval = baseline.getIntervals();

		fillRegular(interval.getRegular());
		fillIrregular(interval.getIrregular());
	}
}
