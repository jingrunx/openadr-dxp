package cn.openadr.tsdb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.joda.time.Interval;
import org.joda.time.ReadableInterval;
import org.joda.time.Seconds;

/** 由一组时间和值组成的时间序列数据 */
public class IrregularValue extends CurveBase {
	private final List<DataValue> values = new ArrayList<>();

	public IrregularValue() {
	}

	public IrregularValue(Collection<DataValue> values) {
		setValues(values);
	}

	@Override
	public List<DataValue> getValues() {
		return values;
	}

	public void setValues(Collection<DataValue> values) {
		this.values.addAll(values);
	}

	@Override
	public ReadableInterval getInterval() {
		Optional<DateTime> start = values.stream()
			.map(DataValue::getTimestamp)
			.filter(Objects::nonNull)
			.min(DateTimeComparator.getInstance());

		Optional<DateTime> end = values.stream()
			.map(DataValue::getTimestamp)
			.filter(Objects::nonNull)
			.max(DateTimeComparator.getInstance());

		if (start.isPresent() && end.isPresent()) {
			return new Interval(start.get(), end.get());
		} else {
			return new Interval(new DateTime(0L), Seconds.ZERO);
		}
	}
}
