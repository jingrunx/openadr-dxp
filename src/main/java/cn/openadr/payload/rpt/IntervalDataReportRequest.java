package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.joda.time.Period;

import cn.openadr.model.report.PointCurveData;

public class IntervalDataReportRequest extends DataReportRequest {
	private static final long serialVersionUID = 1L;

	/** 开始时间 */
	private DateTime dtstart;

	/** 步长(单位:分钟) */
	@NotNull
	private Period period;

	private final List<PointCurveData> pointCurveData = new ArrayList<>();

	public DateTime getDtstart() {
		return dtstart;
	}

	public void setDtstart(DateTime dtstart) {
		this.dtstart = dtstart;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public List<PointCurveData> getPointCurveData() {
		return pointCurveData;
	}
}
