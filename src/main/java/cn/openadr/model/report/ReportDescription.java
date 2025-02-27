package cn.openadr.model.report;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import cn.openadr.domain.ReadingType;
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
public class ReportDescription implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 测点名称（规范扩展）
	 */
	public String name;
	/**
	 * 计量单位
	 */
	public final MetricDescription metric = new MetricDescription();
	/**
	 * 采样周期
	 */
	public final SamplingRate samplingRate = new SamplingRate();
	/**
	 * 只用endDeviceAsset
	 */
	public final Target reportSubject = new Target();
	/**
	 * 只用到resourceID或meterAsset
	 */
	public final Target reportDataSource = new Target();
	/**
	 * 测点编号
	 */
	public int rID;
	/**
	 * 读数类型
	 */
	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = ReadingType.Deserializer.class)
	public ReadingType readingType;
}
