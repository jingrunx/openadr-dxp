package cn.openadr.tsdb;

import org.joda.time.ReadableInterval;
import com.fasterxml.jackson.annotation.JsonIgnore;

@lombok.Getter
public abstract class CurveBase implements Iterable<Data> {
	/**
	 * 时间段
	 */
	@JsonIgnore
	public abstract ReadableInterval getInterval();
}
