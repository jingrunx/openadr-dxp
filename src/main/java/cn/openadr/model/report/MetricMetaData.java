package cn.openadr.model.report;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.MetricType;
import cn.openadr.domain.ReadingType;
import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;

class MetricTypeDeserializer extends EnumeratedDeserializer<MetricType> {
	public MetricTypeDeserializer() {
		super(MetricType.class);
	}
}

class ReadingTypeDeserializer extends EnumeratedDeserializer<ReadingType> {
	public ReadingTypeDeserializer() {
		super(ReadingType.class);
	}
}

/** 测点元数据 */
public class MetricMetaData {
	/** 测点名称 */
	private MetricType name;
	/** 读数类型 */
	private ReadingType readingType;
	/** 单位乘数 */
	private UnitMultiplier multiplier;
	/** 单位符号 */
	private UnitSymbol symbol;

	@JsonSerialize(using = EnumeratedSerializer.class)
	public MetricType getName() {
		return name;
	}

	@JsonDeserialize(using = MetricTypeDeserializer.class)
	public void setName(MetricType name) {
		this.name = name;
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ReadingType getReadingType() {
		return readingType;
	}

	@JsonDeserialize(using = ReadingTypeDeserializer.class)
	public void setReadingType(ReadingType readingType) {
		this.readingType = readingType;
	}

	public UnitMultiplier getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(UnitMultiplier multiplier) {
		this.multiplier = multiplier;
	}

	public UnitSymbol getSymbol() {
		return symbol;
	}

	public void setSymbol(UnitSymbol symbol) {
		this.symbol = symbol;
	}
}
