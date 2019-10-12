package cn.openadr.tsdb;

import java.util.Iterator;
import java.util.Objects;
import javax.validation.constraints.NotNull;

import org.joda.time.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 由固定时间间隔的数据序列组成
 */
public class RegularCurve extends CurveBase {
	/**
	 * 开始时间
	 */
	@NotNull
	private DateTime dtstart;

	/**
	 * 步长(单位:分钟)
	 */
	@NotNull
	private Period period;

	/**
	 * 数据数组
	 */
	@NotNull
	private double[] array = new double[]{};

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

	public void setDtstart(DateTime dtstart) {
		Objects.requireNonNull(dtstart);
		this.dtstart = dtstart;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		Objects.requireNonNull(array);
		this.array = array;
	}

	@JsonIgnore
	@Override
	public Interval getInterval() {
		Duration duration = period.toStandardDuration()
			.multipliedBy(array.length);
		return new Interval(dtstart, duration);
	}

	@Override
	public Iterator<Data> iterator() {
		return new Iterator<Data>() {
			int idx = -1;

			@Override
			public boolean hasNext() {
				return ++idx < array.length;
			}

			@Override
			public Data next() {
				DateTime occur = getDateTime(dtstart, period, idx);
				Number value = Double.isNaN(array[idx]) ? null : array[idx];
				return new Data(value, occur);
			}
		};
	}

	private static DateTime getDateTime(DateTime start, Period period, int idx) {
		return start.plus(period.toStandardDuration()
			.multipliedBy(idx));
	}
}
