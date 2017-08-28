package cn.openadr.model.event;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.SignalType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.DRObject;
import cn.openadr.model.report.MetricMetaData;
import cn.openadr.model.target.Target;

class SignalTypeDeserializer extends EnumeratedDeserializer<SignalType> {
	public SignalTypeDeserializer() {
		super(SignalType.class);
	}
}

public class EventSignal extends DRObject {
	private static final long serialVersionUID = 1L;

	private SignalType type;
	private double value;
	/** 相当于ItemBase */
	private final MetricMetaData metric = new MetricMetaData();
	private final Intervals intervals = new Intervals();
	private final Target target = new Target();

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

	public MetricMetaData getMetric() {
		return metric;
	}

	public Intervals getIntervals() {
		return intervals;
	}

	public Target getTarget() {
		return this.target;
	}
}
