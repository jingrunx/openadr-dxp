package cn.openadr.model.report;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ReportType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.OadrObject;
import cn.openadr.tsdb.Point;

class ReportTypeDeserializer extends EnumeratedDeserializer<ReportType> {
	public ReportTypeDeserializer() {
		super(ReportType.class);
	}
}

public class ReportSpecifier extends OadrObject {
	private static final long serialVersionUID = 1L;

	/** 报表类型 */
	private ReportType type;
	/** 开始报告时间 */
	private DateTime startDateTime;
	/** 取消报告时间 */
	private DateTime endDateTime;
	/** 报告周期，每隔多长时间报告一次(单位:分钟) */
	private int interval;
	/** 曲线数据之间的采样间隔(单位:分钟) */
	//如果interval=(period | 0), 按照LiveReport格式报告，否则按照HistoryReport格式报告
	private int period;
	/** 允许延迟的时间(单位:分钟) */
	private int granularity;
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

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getGranularity() {
		return granularity;
	}

	public void setGranularity(int granularity) {
		this.granularity = granularity;
	}

	public List<Point> getPoints() {
		return points;
	}
}
