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

/** 不规则曲线 */
public class IrregularPart extends ValuesPart {
	private final List<ValuePart> values = new ArrayList<>();

	public IrregularPart() {
	}

	public IrregularPart(Collection<ValuePart> values) {
		setValues(values);
	}

	@Override
	public List<ValuePart> getValues() {
		return values;
	}

	public void setValues(Collection<ValuePart> values) {
		this.values.addAll(values);
	}

	@Override
	public ReadableInterval getInterval() {
		Optional<DateTime> start = values.stream()
			.map(ValuePart::getTimestamp)
			.filter(Objects::nonNull)
			.min(DateTimeComparator.getInstance());

		Optional<DateTime> end = values.stream()
			.map(ValuePart::getTimestamp)
			.filter(Objects::nonNull)
			.max(DateTimeComparator.getInstance());

		if (start.isPresent() && end.isPresent()) {
			return new Interval(start.get(), end.get());
		} else {
			return new Interval(new DateTime(0L), Seconds.ZERO);
		}
	}
}
