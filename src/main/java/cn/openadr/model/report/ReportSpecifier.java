package cn.openadr.model.report;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.joda.time.Period;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReportType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.DRObject;
import cn.openadr.tsdb.Point;

class ReportTypeDeserializer extends EnumeratedDeserializer<ReportType> {
	public ReportTypeDeserializer() {
		super(ReportType.class);
	}
}

public class ReportSpecifier extends DRObject {
	private static final long serialVersionUID = 1L;

	/** 报表类型 */
	private ReportType type;
	/** 开始报告时间 */
	private DateTime startDateTime;
	/** 取消报告时间 */
	private DateTime endDateTime;
	/** 报告周期，每隔多长时间报告一次(单位:分钟) */
	@NotNull
	private Period interval;
	/** 曲线数据之间的采样间隔(单位:分钟) */
	//如果interval=(period | 0), 按照LiveReport格式报告，否则按照HistoryReport格式报告
	@NotNull
	private Period period;
	/** 允许延迟的时间(单位:分钟) */
	private Period granularity;
	/** 要报告的测点 */
	private final List<Point> points = new ArrayList<>();

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ReportType getType() {
		return type;
	}

	@JsonDeserialize(using = ReportTypeDeserializer.class)
	public void setType(ReportType type) {
		this.type = type;
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

	public Period getGranularity() {
		return granularity;
	}

	public void setGranularity(Period granularity) {
		this.granularity = granularity;
	}

	public List<Point> getPoints() {
		return points;
	}
}
