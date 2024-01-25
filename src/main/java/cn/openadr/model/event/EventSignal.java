package cn.openadr.model.event;

import java.io.Serial;
import java.io.Serializable;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import cn.openadr.domain.SignalType;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.report.MetricDescription;
import cn.openadr.model.target.Target;
import cn.openadr.tsdb.CurveData;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventSignal implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String signalID;
	/**
	 * @see cn.openadr.domain.SignalName
	 */
	public String signalName;
	/**
	 * 信号类别
	 */
	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = SignalType.Deserializer.class)
	public SignalType signalType;
	/**
	 * 信号的当前值
	 */
	public Float currentValue;

	/**
	 * 相当于ItemBase
	 */
	public final MetricDescription metric = new MetricDescription();
	public final CurveData intervals = new CurveData();
	public final Target target = new Target();
}
