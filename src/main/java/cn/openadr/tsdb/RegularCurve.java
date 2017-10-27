package cn.openadr.tsdb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadablePeriod;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 由固定时间间隔的数据序列组成 */
public class RegularCurve extends CurveBase {
	/** 开始时间 */
	private DateTime dtstart;
	/** 步长(单位:分钟) */
	@NotNull
	private Period period;
	/** 数据数组 */
	private double[] array = new double[] {};

	public RegularCurve() {
	}

	public RegularCurve(ReadableDateTime dtstart, ReadablePeriod period, double[] array) {
		setDtstart(dtstart.toDateTime());
		setPeriod(period.toPeriod());
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

	public Period getPeriod() {
		return period;
	}

	/** 设置步长 */
	public void setPeriod(Period period) {
		this.period = period;
	}

	@JsonIgnore
	@Override
	public Interval getInterval() {
		Duration duration = period.toStandardDuration()
			.multipliedBy(array.length);
		return new Interval(dtstart, duration);
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
	public List<Data> getValues() {
		ArrayList<Data> values = new ArrayList<>(array.length);

		for (int i = 0; i < array.length; ++i) {
			DateTime occur = getDateTime(dtstart, period, i);
			Number value = Double.isNaN(array[i]) ? null : array[i];
			values.add(new Data(value, occur));
		}

		return values;
	}

	protected DateTime getDateTime(DateTime start, Period period, int idx) {
		return start.plus(period.toStandardDuration()
			.multipliedBy(idx));
	}
}
