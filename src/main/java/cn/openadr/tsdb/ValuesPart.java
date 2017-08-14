package cn.openadr.tsdb;

import java.util.List;

import org.joda.time.MutableInterval;
import org.joda.time.ReadableInterval;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class ValuesPart {
	/** 时间段 */
	protected final MutableInterval interval = new MutableInterval();

	@JsonIgnore
	public ReadableInterval getInterval() {
		return interval.toInterval();
	}

	/** 数据 */
	public abstract List<ValuePart> getValues();
}
