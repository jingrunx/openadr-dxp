package cn.openadr.tsdb;

import java.util.Iterator;
import java.util.Objects;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

/**
 * 由固定时间间隔的数据序列组成
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class RegularCurve extends CurveBase {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 开始时间
	 */
	public DateTime dtstart;

	/**
	 * 步长(单位:分钟)
	 */
	public Period period;

	/**
	 * 数据数组
	 */
	private double[] array = new double[]{};

	public static DateTime getDateTime(DateTime start, Period period, int idx) {
		return start.plus(period.toStandardDuration()
			.multipliedBy(idx));
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
		Duration duration = period.toStandardDuration();
		return new Interval(dtstart, duration.multipliedBy(array.length));
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
}
