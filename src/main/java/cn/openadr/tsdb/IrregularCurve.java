package cn.openadr.tsdb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import lombok.NoArgsConstructor;

import org.apache.commons.lang3.tuple.Pair;

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
	public Pair<LocalDateTime, LocalDateTime> getInterval() {
		Optional<LocalDateTime> start = values.stream()
			.map(Data::getTimestamp)
			.filter(Objects::nonNull)
			.min(LocalDateTime::compareTo);

		Optional<LocalDateTime> end = values.stream()
			.map(Data::getTimestamp)
			.filter(Objects::nonNull)
			.max(LocalDateTime::compareTo);

		if(start.isPresent() && end.isPresent()) {
			return Pair.of(start.get(), end.get());
		} else {
			LocalDateTime occur = LocalDateTime.of(LocalDate.EPOCH, LocalTime.MIDNIGHT);
			return Pair.of(occur, occur);
		}
	}

	@Override
	public Iterator<Data> iterator() {
		return values.iterator();
	}
}
