package cn.openadr.model.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@lombok.Getter
public class EventSignals implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final EventBaseline baseline = new EventBaseline();
	public final List<EventSignal> signal = new ArrayList<>();
}
