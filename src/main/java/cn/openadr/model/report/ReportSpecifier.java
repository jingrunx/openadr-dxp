package cn.openadr.model.report;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import cn.openadr.domain.ReportType;
import cn.openadr.jackson.EnumeratedSerializer;

/**
 * 为报告数据准备的格式样式
 */
// ReportSpecifierType
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class ReportSpecifier implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 要报告的rID清单
	 */
	public final List<Integer> points = new ArrayList<>();
	/**
	 * 报告样式编号
	 */
	public String reportSpecifierID;
	/**
	 * 报告名称
	 */
	/* cn.openadr.domain.ReportName */
	public String reportName;
	/**
	 * 报告类型
	 */
	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = ReportType.Deserializer.class)
	public ReportType reportType;
	/**
	 * 开始报告时间
	 */
	public LocalDateTime startDateTime;
	/**
	 * 取消报告时间，超过此时间后不再发送报告，为空表示一直发送直到收到取消报送指令
	 */
	public LocalDateTime endDateTime;
	/**
	 * 报告周期，每隔多长时间报告一次
	 * 如果与granularity相同或者为PT0S，则相当于每次报送实时数据，用LiveReport格式报送
	 * 否则按照HistoryReport格式报送
	 */
	public TemporalAmount backDuration;
	/**
	 * 曲线数据之间的采样间隔(granularity)
	 */
	public TemporalAmount period;
}
