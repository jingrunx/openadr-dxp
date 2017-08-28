package cn.openadr.model.event;

import cn.openadr.domain.ResponseRequired;
import cn.openadr.model.DRObject;
import cn.openadr.model.target.Target;

/** 事件 */
public class Event extends DRObject {
	private static final long serialVersionUID = 1L;

	private ResponseRequired responseRequired;
	private final EventDescriptor descriptor = new EventDescriptor();
	private final EventActivePeriod activePeriod = new EventActivePeriod();
	private final EventSignals signals = new EventSignals();
	private final Target target = new Target();

	public ResponseRequired getResponseRequired() {
		return responseRequired;
	}

	public void setResponseRequired(ResponseRequired responseRequired) {
		this.responseRequired = responseRequired;
	}

	public EventDescriptor getDescriptor() {
		return this.descriptor;
	}

	public EventActivePeriod getActivePeriod() {
		return this.activePeriod;
	}

	public EventSignals getSignals() {
		return signals;
	}

	public Target getTarget() {
		return target;
	}
}
