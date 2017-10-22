package cn.openadr.model.event;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ResponseRequired;
import cn.openadr.domain.ResponseRequired.ResponseRequiredDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.target.Target;

/** 事件 */
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	private ResponseRequired responseRequired;
	private final EventDescriptor descriptor = new EventDescriptor();
	private final EventActivePeriod activePeriod = new EventActivePeriod();
	private final EventSignals signals = new EventSignals();
	private final Target target = new Target();

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ResponseRequired getResponseRequired() {
		return responseRequired;
	}

	@JsonDeserialize(using = ResponseRequiredDeserializer.class)
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
