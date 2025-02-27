package cn.openadr.tsdb;

import java.util.*;

import org.joda.time.*;
import lombok.NoArgsConstructor;

/**
 * 由一组时间和值组成的时间序列数据
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class IrregularCurve extends CurveBase {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<Data> values = new LinkedList<>();

	public IrregularCurve(Collection<Data> values) {
		this.values.addAll(values);
	}

	public void addValue(Data value) {
		this.values.add(value);
	}

	@Override
	public ReadableInterval getInterval() {
		Optional<DateTime> start = values.stream()
			.map(Data::getTimestamp)
			.filter(Objects::nonNull)
			.min(DateTimeComparator.getInstance());

		Optional<DateTime> end = values.stream()
			.map(Data::getTimestamp)
			.filter(Objects::nonNull)
			.max(DateTimeComparator.getInstance());

		if(start.isPresent() && end.isPresent()) {
			return new Interval(start.get(), end.get());
		} else {
			return new Interval(Instant.ofEpochMilli(0), Seconds.ZERO);
		}
	}

	@Override
	public Iterator<Data> iterator() {
		return values.iterator();
	}
}
