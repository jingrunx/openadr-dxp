package cn.openadr.model.event;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

public class EventSignals {
	private final EventBaseline baseline = new EventBaseline();
	@Size(min = 1)
	private final List<EventSignal> signal = new ArrayList<>();

	public EventBaseline getBaseline() {
		return baseline;
	}

	public List<EventSignal> getSignal() {
		return signal;
	}
}
