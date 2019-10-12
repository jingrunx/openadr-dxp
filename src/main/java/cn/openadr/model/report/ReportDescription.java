package cn.openadr.model.report;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReadingType;
import cn.openadr.domain.ReadingType.ReadingTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.target.Target;

/**
 * 报表的测点描述
 */
//OadrReportDescriptionType
public class ReportDescription {
	/**
	 * 测点编号
	 */
	private int rID;

	/**
	 * 读数类型
	 */
	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = ReadingTypeDeserializer.class)
	private ReadingType readingType;

	/**
	 * 计量单位
	 */
	private final MetricDescription metric = new MetricDescription();

	/**
	 * 采样周期
	 */
	private final SamplingRate samplingRate = new SamplingRate();

	/**
	 * 只用endDeviceAsset
	 */
	private final Target reportSubject = new Target();

	/**
	 * 只用到resourceID或meterAsset
	 */
	private final Target reportDataSource = new Target();

	public int getrID() {
		return rID;
	}

	public void setrID(int rID) {
		this.rID = rID;
	}

	public MetricDescription getMetric() {
		return metric;
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

	public Target getReportSubject() {
		return reportSubject;
	}

	public Target getReportDataSource() {
		return reportDataSource;
	}
}
