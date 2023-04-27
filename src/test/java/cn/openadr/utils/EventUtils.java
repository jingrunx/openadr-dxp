package cn.openadr.utils;

import java.time.Duration;
import java.time.LocalDateTime;

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
		descriptor.setCreatedDateTime(LocalDateTime.now());
	}

	public static void fillActivePeriod(EventActivePeriod activePeriod) {
		activePeriod.setDtstart(CommonUtils.dtstart()
			.withHour(14));
		activePeriod.setDuration(Duration.ofHours(2));
		activePeriod.setNotification(Duration.ofDays(1));
		activePeriod.setTolerance(Duration.ofMinutes(3));
		activePeriod.setRampup(Duration.ofMinutes(15));
		activePeriod.setRecovery(Duration.ofMinutes(30));
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
