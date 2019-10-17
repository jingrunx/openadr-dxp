package cn.openadr.tsdb;

import java.util.Iterator;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * 由固定时间间隔的数据序列组成
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class RegularCurve extends CurveBase {
	/**
	 * 开始时间
	 */
	@NonNull
	private DateTime dtstart;

	/**
	 * 步长(单位:分钟)
	 */
	@NonNull
	private Period period;

	/**
	 * 数据数组
	 */
	@NonNull
	private double[] array = new double[]{};

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
				return new Data(value, occur, null);
			}
		};
	}

	private static DateTime getDateTime(DateTime start, Period period, int idx) {
		return start.plus(period.toStandardDuration()
			.multipliedBy(idx));
	}
}
