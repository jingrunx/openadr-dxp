package cn.openadr.tsdb;

import org.joda.time.ReadableDateTime;
import org.joda.time.ReadablePeriod;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 规则曲线 */
public class RegularValues extends PointValues {
	private static final long serialVersionUID = 1L;

	public RegularValues(Point key, RegularPart value) {
		super(key, value);
	}

	@JsonCreator
	public RegularValues(@JsonProperty("key") Point key) {
		this(key, new RegularPart());
	}

	public RegularValues(Point key, ReadableDateTime dtstart, ReadablePeriod period, double[] array) {
		this(key, new RegularPart(dtstart, period, array));
	}
}
