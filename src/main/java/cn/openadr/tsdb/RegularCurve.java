package cn.openadr.tsdb;

import java.io.Serial;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Objects;
import lombok.NoArgsConstructor;

import org.apache.commons.lang3.tuple.Pair;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 由固定时间间隔的数据序列组成
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class RegularCurve extends CurveBase {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 开始时间
	 */
	public LocalDateTime dtstart;

	/**
	 * 步长(单位:分钟)
	 */
	public Duration period;

	/**
	 * 数据数组
	 */
	@lombok.Getter
	private double[] array = new double[]{};

	public static LocalDateTime getDateTime(LocalDateTime start, Duration period, int idx) {
		return start.plus(period.multipliedBy(idx));
	}

	public void setArray(double[] array) {
		this.array = Objects.requireNonNull(array);
	}

	@JsonIgnore
	@Override
	public Pair<LocalDateTime, LocalDateTime> getInterval() {
		return Pair.of(dtstart, dtstart.plus(period.multipliedBy(array.length)));
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
				LocalDateTime occur = getDateTime(dtstart, period, idx);
				Number value = Double.isNaN(array[idx]) ? null : array[idx];
				return new Data(value, occur, null);
			}
		};
	}
}
