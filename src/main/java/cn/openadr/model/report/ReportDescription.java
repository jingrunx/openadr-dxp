package cn.openadr.model.report;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReadingType;
import cn.openadr.domain.ReadingType.ReadingTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.target.Target;
import lombok.NoArgsConstructor;

/**
 * 报表的测点描述
 */
//OadrReportDescriptionType
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
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
}
