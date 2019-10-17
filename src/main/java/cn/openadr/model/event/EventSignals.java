package cn.openadr.model.event;

import java.util.ArrayList;
import java.util.List;

@lombok.Getter
public class EventSignals {
	private final EventBaseline baseline = new EventBaseline();
	private final List<EventSignal> signal = new ArrayList<>();
}
