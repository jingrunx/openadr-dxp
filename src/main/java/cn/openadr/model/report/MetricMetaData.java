package cn.openadr.model.report;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReadingType;
import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.DRObject;

class ReadingTypeDeserializer extends EnumeratedDeserializer<ReadingType> {
	public ReadingTypeDeserializer() {
		super(ReadingType.class);
	}
}

/** 测点信息 */
public class MetricMetaData extends DRObject {
	private static final long serialVersionUID = 1L;

	//private MetricType id;
	/** 读数类型 */
	private ReadingType readingType;
	/** 单位乘数 */
	private UnitMultiplier multiplier;
	/** 单位符号 */
	private UnitSymbol symbol;

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
