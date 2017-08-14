package cn.openadr.model.event;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.SignalType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.OadrObject;
import cn.openadr.model.target.Target;

class SignalTypeDeserializer extends EnumeratedDeserializer<SignalType> {
	public SignalTypeDeserializer() {
		super(SignalType.class);
	}
}

public class EventSignal extends OadrObject {
	private static final long serialVersionUID = 1L;

	private SignalType type;
	private double value;
	private Target target;

	@JsonSerialize(using = EnumeratedSerializer.class)
	public SignalType getType() {
		return type;
	}

	@JsonDeserialize(using = SignalTypeDeserializer.class)
	public void setType(SignalType type) {
		this.type = type;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Target getTarget() {
		if (null == this.target)
			this.target = new Target();
		return this.target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}
}
