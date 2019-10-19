package cn.openadr.model.event;

import java.util.ArrayList;
import java.util.List;

@lombok.Getter
public class EventSignals {
	public final EventBaseline baseline = new EventBaseline();
	public final List<EventSignal> signal = new ArrayList<>();
}
