package cn.openadr.model.event;

import java.util.ArrayList;
import java.util.List;

public class EventSignals {
	private final EventBaseline baseline = new EventBaseline();
	private final List<EventSignal> signal = new ArrayList<>();

	public EventBaseline getBaseline() {
		return baseline;
	}

	public List<EventSignal> getSignal() {
		return signal;
	}
}
