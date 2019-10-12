package cn.openadr.model.report;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.joda.time.DateTime;
import org.joda.time.Period;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReportType;
import cn.openadr.domain.ReportType.ReportTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;

/**
 * 为报告数据准备的格式样式
 */
// ReportSpecifierType
public class ReportSpecifier implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 报告样式编号
	 */
	@NotNull
	private String reportSpecifierID;

	/**
	 * 报告名称
	 */
	/* cn.openadr.domain.ReportName */
	@NotNull
	private String reportName;

	/**
	 * 报告类型
	 */
	@NotNull
	private ReportType reportType;

	/**
	 * 开始报告时间
	 */
	@NotNull
	private DateTime startDateTime;

	/**
	 * 取消报告时间，超过此时间后不再发送报告，为空表示一直发送直到收到取消报送指令
	 */
	private DateTime endDateTime;

	/**
	 * 报告周期，每隔多长时间报告一次
	 * 如果与granularity相同或者为PT0S，则相当于每次报送实时数据，用LiveReport格式报送
	 * 否则按照HistoryReport格式报送
	 */
	@NotNull
	private Period backDuration;

	/**
	 * 曲线数据之间的采样间隔
	 */
	@NotNull
	private Period period;

	/**
	 * 要报告的rID清单
	 */
	@Size(min = 1)
	private final List<Integer> rID = new ArrayList<>();

	public String getReportSpecifierID() {
		return reportSpecifierID;
	}

	public void setReportSpecifierID(String reportSpecifierID) {
		this.reportSpecifierID = reportSpecifierID;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ReportType getReportType() {
		return reportType;
	}

	@JsonDeserialize(using = ReportTypeDeserializer.class)
	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}

	public DateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(DateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public DateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(DateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Period getBackDuration() {
		return backDuration;
	}

	public void setBackDuration(Period backDuration) {
		this.backDuration = backDuration;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public List<Integer> getrID() {
		return rID;
	}
}
