package cn.openadr.tsdb;

import java.util.*;

import org.joda.time.*;

/**
 * 由一组时间和值组成的时间序列数据
 */
public class IrregularCurve extends CurveBase {
	public final List<Data> values = new LinkedList<>();

	public IrregularCurve() {
	}

	public IrregularCurve(Collection<Data> values) {
		this.values.addAll(values);
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
