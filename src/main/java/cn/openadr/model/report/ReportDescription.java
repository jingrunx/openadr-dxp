package cn.openadr.model.report;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReadingType;
import cn.openadr.domain.ReadingType.ReadingTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.target.Target;

/** 报表的测点描述 */
public class ReportDescription {
	/** 测点编号 */
	private int rID;

	/** 计量单位 */
	private String metric;

	/** 读数类型 */
	private ReadingType readingType;

	/** 采样周期 */
	private final SamplingRate samplingRate = new SamplingRate();

	/** 只用endDeviceAsset */
	private final Target reportSubject = new Target();

	/** 只用到resourceID或meterAsset */
	private final Target reportDataSource = new Target();

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
