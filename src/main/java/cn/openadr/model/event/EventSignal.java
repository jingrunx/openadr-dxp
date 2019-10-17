package cn.openadr.model.event;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.SignalType;
import cn.openadr.domain.SignalType.SignalTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.report.MetricDescription;
import cn.openadr.model.target.Target;
import cn.openadr.tsdb.CurveData;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventSignal implements Serializable {
	private static final long serialVersionUID = 1L;

	@NonNull
	private String signalID;

	/**
	 * cn.openadr.domain.SignalName
	 */
	@NonNull
	private String signalName;

	/**
	 * 信号类别
	 */
	@NonNull
	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = SignalTypeDeserializer.class)
	private SignalType signalType;

	/**
	 * 信号的当前值
	 */
	private Float currentValue;

	/**
	 * 相当于ItemBase
	 */
	private final MetricDescription metric = new MetricDescription();

	private final CurveData intervals = new CurveData();

	private final Target target = new Target();
}
