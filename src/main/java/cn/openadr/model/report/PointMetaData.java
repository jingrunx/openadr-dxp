package cn.openadr.model.report;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReadingType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;

class ReadingTypeDeserializer extends EnumeratedDeserializer<ReadingType> {
	public ReadingTypeDeserializer() {
		super(ReadingType.class);
	}
}

/** 采样点元数据 */
public class PointMetaData {
	/** 测点 */
	private int rID;
	/** 计量单位 */
	private String metric;
	/** 资源ID */
	private String resourceID;
	/** 读数类型 */
	private ReadingType readingType;
	/** 采样周期 */
	private final SamplingRate samplingRate = new SamplingRate();

	public int getrID() {
		return rID;
	}

	public void setrID(int rID) {
		this.rID = rID;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getResourceID() {
		return resourceID;
	}

	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ReadingType getReadingType() {
		return readingType;
	}

	@JsonDeserialize(using = ReadingTypeDeserializer.class)
	public void setReadingType(ReadingType readingType) {
		this.readingType = readingType;
	}

	public SamplingRate getSamplingRate() {
		return samplingRate;
	}
}
