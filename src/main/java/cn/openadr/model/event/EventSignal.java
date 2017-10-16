package cn.openadr.model.event;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.SignalType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.report.MetricMetaData;
import cn.openadr.model.target.Target;
import cn.openadr.tsdb.CurveData;

class SignalTypeDeserializer extends EnumeratedDeserializer<SignalType> {
	public SignalTypeDeserializer() {
		super(SignalType.class);
	}
}

public class EventSignal implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	private String signalID;
	/** cn.openadr.domain.SignalName */
	@NotNull
	private String signalName;
	/** 信号类别 */
	@NotNull
	private SignalType signalType;
	/** 信号的当前值 */
	private Float currentValue;
	/** 相当于ItemBase */
	@Null
	private final MetricMetaData metric = new MetricMetaData();
	@Size(min = 1)
	private final CurveData intervals = new CurveData();
	private final Target target = new Target();

	public String getSignalID() {
		return signalID;
	}

	public void setSignalID(String signalID) {
		this.signalID = signalID;
	}

	public String getSignalName() {
		return signalName;
	}

	public void setSignalName(String signalName) {
		this.signalName = signalName;
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public SignalType getSignalType() {
		return signalType;
	}

	@JsonDeserialize(using = SignalTypeDeserializer.class)
	public void setSignalType(SignalType signalType) {
		this.signalType = signalType;
	}

	public Float getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Float currentValue) {
		this.currentValue = currentValue;
	}

	public MetricMetaData getMetric() {
		return metric;
	}

	public CurveData getIntervals() {
		return intervals;
	}

	public Target getTarget() {
		return target;
	}
}
