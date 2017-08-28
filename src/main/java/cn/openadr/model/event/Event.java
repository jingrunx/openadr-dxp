package cn.openadr.model.event;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.DRObject;

/** 事件 */
public class Event extends DRObject {
	private static final long serialVersionUID = 1L;

	private final EventDescriptor descriptor = new EventDescriptor();
	private final EventActivePeriod activePeriod = new EventActivePeriod();
	private final List<EventSignal> signals = new ArrayList<>();
	private final List<EventBaseline> baselines = new ArrayList<>();

	public EventDescriptor getDescriptor() {
		return this.descriptor;
	}

	public EventActivePeriod getActivePeriod() {
		return this.activePeriod;
	}

	public List<EventSignal> getSignals() {
		return this.signals;
	}

	public List<EventBaseline> getBaselines() {
		return this.baselines;
	}
}
