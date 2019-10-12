package cn.openadr.tsdb;

import org.joda.time.MutableInterval;
import org.joda.time.ReadableInterval;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class CurveBase implements Iterable<Data> {
	/**
	 * 时间段
	 */
	private final MutableInterval interval = new MutableInterval();

	@JsonIgnore
	public ReadableInterval getInterval() {
		return interval;
	}
}
