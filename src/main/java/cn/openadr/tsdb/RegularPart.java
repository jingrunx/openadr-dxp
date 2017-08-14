package cn.openadr.tsdb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.ReadableDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RegularPart extends ValuesPart {
	/** 开始时间 */
	private DateTime dtstart = new DateTime(1900, 1, 1, 0, 0, 0);
	/** 步长(单位:分钟) */
	private int period;
	/** 数据数组 */
	private double[] array = new double[] {};

	public RegularPart() {
	}

	public RegularPart(ReadableDateTime dtstart, int period, double[] array) {
		setDtstart(dtstart.toDateTime());
		setPeriod(period);
		setArray(array);
	}

	public DateTime getDtstart() {
		return dtstart;
	}

	/** 设置开始时间, 注意:不能设置结束时间,结束时间由开始时间+步长+数据长度决定 */
	public void setDtstart(DateTime dtstart) {
		Objects.nonNull(dtstart);

		this.dtstart = dtstart;
	}

	public int getPeriod() {
		return period;
	}

	/** 设置步长 */
	public void setPeriod(int period) {
		this.period = period;
	}

	@JsonIgnore
	@Override
	public Interval getInterval() {
		return new Interval(dtstart, Minutes.minutes(period * array.length));
	}

	/** 数据 */
	public double[] getArray() {
		return array;
	}

	/** 设置数据 */
	public void setArray(double[] array) {
		Objects.nonNull(array);

		this.array = array;
	}

	@JsonIgnore
	@Override
	public List<ValuePart> getValues() {
		ArrayList<ValuePart> values = new ArrayList<>(array.length);

		for (int i = 0; i < array.length; ++i) {
			DateTime occur = getDateTime(dtstart, period, i);
			Number value = Double.isNaN(array[i]) ? null : array[i];
			values.add(new ValuePart(value, occur));
		}

		return values;
	}

	protected DateTime getDateTime(DateTime start, int period, int idx) {
		return start.plusMinutes(period * idx);
	}
}
