package cn.openadr;

import java.io.IOException;

import org.junit.Test;

import cn.openadr.model.event.Event;
import cn.openadr.model.event.EventSignal;
import cn.openadr.payload.evt.RequestEventRequest;
import cn.openadr.payload.evt.RequestEventResponse;

public class EventTest extends AbstractJsonTest<Object> {

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
	@Test
	public void testRequestEventRequest() {
		RequestEventRequest eventResquest =new RequestEventRequest();
		eventResquest.setDnID(FillUtils.uuid());
		eventResquest.setId(FillUtils.uuid());
		eventResquest.setReplyLimit(1);
		eventResquest.setVersion(0);
		object = eventResquest;
	}
	
	@Test
	public void testRequestEventResponse() {
		RequestEventRequest eventResquest =new RequestEventRequest();
		eventResquest.setDnID(FillUtils.uuid());
		eventResquest.setId(FillUtils.uuid());
		eventResquest.setReplyLimit(1);
		eventResquest.setVersion(0);
		RequestEventResponse eventResponse =new RequestEventResponse(eventResquest);
		eventResponse.setId(FillUtils.uuid());
		eventResponse.setCode(200);
		eventResponse.setReason("no reason");
		object = eventResponse;
	}
}
