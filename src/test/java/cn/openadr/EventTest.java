package cn.openadr;

import java.io.IOException;
import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.junit.Test;

import cn.openadr.domain.MetricType;
import cn.openadr.domain.SignalType;
import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import cn.openadr.model.event.Event;
import cn.openadr.model.event.EventActivePeriod;
import cn.openadr.model.event.EventBaseline;
import cn.openadr.model.event.EventSignal;
import cn.openadr.model.event.Interval;
import cn.openadr.model.target.EndDeviceAsset;
import cn.openadr.tsdb.IrregularPart;
import cn.openadr.tsdb.RegularPart;
import cn.openadr.tsdb.ValuePart;

public class EventTest extends AbstractJsonTest<Event> {
	private String endDeviceID = UUID.randomUUID()
		.toString();
	private DateTime dtstart = LocalDate.now()
		.toDateTimeAtStartOfDay();

	public void fillActivePeriod(EventActivePeriod activePeriod) {
		activePeriod.setDtstart(dtstart);
		activePeriod.setDuration(DateTimeConstants.MINUTES_PER_HOUR * 2);
		activePeriod.setRampup(15);
	}

	public void fillEventSignal(EventSignal signal) {
		signal.setType(SignalType.LEVEL);
		signal.setValue(1);
		signal.getTarget()
			.getEndDeviceAsset()
			.add(new EndDeviceAsset(endDeviceID));
	}

	public void fillBaseline(EventBaseline baseline) {
		Interval interval = baseline.getInterval();

		interval.getMetric()
			.setName(MetricType.POWER_ACTIVE.value());
		interval.getMetric()
			.setMultiplier(UnitMultiplier.k);
		interval.getMetric()
			.setSymbol(UnitSymbol.W);

		fillRegular(interval.getRegular());
		fillIrregular(interval.getIrregular());
	}

	public void fillRegular(RegularPart regular) {
		regular.setDtstart(dtstart);
		regular.setPeriod(15);
		regular.setArray(new double[] { 1, 2, 3, 4, 5, 6, 7, 8 });
	}

	public void fillIrregular(IrregularPart irregular) {
		irregular.getValues()
			.add(new ValuePart(0.0d, dtstart));
		irregular.getValues()
			.add(new ValuePart(1.0d, dtstart.plusMinutes(15)));
		irregular.getValues()
			.add(new ValuePart(2.0d, dtstart.plusHours(1)));
	}

	@Test
	public void testEvent() throws IOException {
		Event event = new Event();
		fillActivePeriod(event.getActivePeriod());

		for (int i = 0; i < 2; ++i) {
			EventSignal signal = new EventSignal();
			event.getSignals()
				.add(signal);
			fillEventSignal(signal);
		}

		for (int i = 0; i < 2; ++i) {
			EventBaseline baseline = new EventBaseline();
			event.getBaselines()
				.add(baseline);
			fillBaseline(baseline);
		}

		object = event;
	}
}
