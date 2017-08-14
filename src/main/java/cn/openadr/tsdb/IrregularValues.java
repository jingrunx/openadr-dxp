package cn.openadr.tsdb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** 不规则曲线 */
@JsonTypeName("irregular")
public class IrregularValues extends PointValues {
	private static final long serialVersionUID = 1L;

	public IrregularValues(Point key, IrregularPart value) {
		super(key, value);
	}

	@JsonCreator
	public IrregularValues(@JsonProperty("key") Point key) {
		this(key, new IrregularPart());
	}

	public IrregularValues(Point key, Collection<ValuePart> values) {
		this(key, new IrregularPart(values));
	}

	public IrregularValues(Point key, Map<DateTime, Number> kvals) {
		this(key, new IrregularPart(toCollection(kvals)));
	}

	private static Collection<ValuePart> toCollection(Map<DateTime, Number> kvals) {
		List<ValuePart> values = new ArrayList<>(kvals.size());

		for (Entry<DateTime, Number> entry : kvals.entrySet()) {
			values.add(new ValuePart(entry.getValue(), entry.getKey()));
		}

		return values;
	}
}
