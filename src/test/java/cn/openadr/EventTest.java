package cn.openadr;

import java.io.IOException;

import org.junit.Test;

import cn.openadr.model.event.Event;
import cn.openadr.model.event.EventSignal;

public class EventTest extends AbstractJsonTest<Event> {

	@Test
	public void testEvent() throws IOException {
		Event event = new Event();

		FillUtils.fillActivePeriod(event.getActivePeriod());

		for (int i = 0; i < 2; ++i) {
			FillUtils.fillBaseline(event.getSignals()
				.getBaseline());
			EventSignal signal = new EventSignal();
			FillUtils.fillEventSignal(signal);
			event.getSignals()
				.getSignal()
				.add(signal);
		}

		object = event;
	}
}
