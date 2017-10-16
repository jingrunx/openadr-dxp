package cn.openadr.model.report;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.joda.time.DateTime;
import org.joda.time.Period;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReportType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;

class ReportTypeDeserializer extends EnumeratedDeserializer<ReportType> {
	public ReportTypeDeserializer() {
		super(ReportType.class);
	}
}

/** 为报告数据准备的格式规范 */
public class ReportSpecifier implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 报告样式编号 */
	@NotNull
	private String reportSpecifierID;

	/** 报告名称 */
	/* cn.openadr.domain.ReportName */
	@NotNull
	private String reportName;

	/** 报告类型 */
	@NotNull
	private ReportType reportType;

	/** 开始报告时间 */
	@NotNull
	private DateTime startDateTime;

	/** 取消报告时间 */
	@Null
	private DateTime endDateTime;

	/** 报告周期，每隔多长时间报告一次 */
	//等同于reportBackDuration
	//如果interval=(period | PT0S), 按照LiveReport格式报告，否则按照HistoryReport格式报告
	@NotNull
	private Period interval;

	/** 曲线数据之间的采样间隔 */
	//等同于granularity，取值范围必须在minPeriod和maxPeriod之间
	@NotNull
	private Period period;

	@Size(min = 1)
	/** 要报告的测点 */
	private final List<Integer> points = new ArrayList<>();

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

	public Period getInterval() {
		return interval;
	}

	public void setInterval(Period interval) {
		this.interval = interval;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public List<Integer> getPoints() {
		return points;
	}
}
