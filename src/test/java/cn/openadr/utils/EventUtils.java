package cn.openadr.utils;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import cn.openadr.domain.EventStatus;
import cn.openadr.domain.ResponseRequired;
import cn.openadr.domain.SignalType;
import cn.openadr.model.event.*;
import cn.openadr.tsdb.CurveData;

public class EventUtils {

	public static void fillEvent(Event event) {
		event.setResponseRequired(ResponseRequired.ALWAYS);

		fillDescriptor(event.getDescriptor());

		fillActivePeriod(event.getActivePeriod());

		fillSignals(event.getSignals());

		CommonUtils.fillEndDeviceAsset(event.getTarget());
	}

	public static void fillDescriptor(EventDescriptor descriptor) {
		descriptor.setEventID(CommonUtils.id());
		descriptor.setStatus(EventStatus.FAR);
		descriptor.setCreatedDateTime(DateTime.now());
	}

	public static void fillActivePeriod(EventActivePeriod activePeriod) {
		activePeriod.setDtstart(CommonUtils.dtstart()
			.withHourOfDay(14));
		activePeriod.setDuration(Hours.TWO.toPeriod());
		activePeriod.setNotification(Days.ONE.toPeriod());
		activePeriod.setTolerance(Minutes.minutes(3)
			.toPeriod());
		activePeriod.setRampup(Minutes.minutes(15)
			.toPeriod());
		activePeriod.setRecovery(Minutes.minutes(30)
			.toPeriod());
	}

	public static void fillSignals(EventSignals signals) {
		fillBaseline(signals.getBaseline());

		EventSignal signal = new EventSignal();
		fillEventSignal(signal);
		signals.getSignal()
			.add(signal);
	}

	public static void fillBaseline(EventBaseline baseline) {
		CurveData interval = baseline.getIntervals();
		MetricUtils.fillRegular(interval.getRegular());
		MetricUtils.fillIrregular(interval.getIrregular());
	}

	public static void fillEventSignal(EventSignal signal) {
		MetricUtils.fillMetric(signal.getMetric());
		signal.setSignalType(SignalType.LEVEL);
		signal.setCurrentValue(3.0f);
		CommonUtils.fillEndDeviceAsset(signal.getTarget());
	}

}
