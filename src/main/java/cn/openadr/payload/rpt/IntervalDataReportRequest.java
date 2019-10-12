package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.joda.time.Period;

import cn.openadr.model.report.PointCurveData;

public class IntervalDataReportRequest extends DataReportRequest {
	private static final long serialVersionUID = 1L;

	/**
	 * 开始时间
	 */
	@NotNull
	private DateTime dtstart;

	/**
	 * 步长(单位:分钟)
	 */
	@NotNull
	private Period period;

	private final List<PointCurveData> pointCurveData = new ArrayList<>();

	public DateTime getDtstart() {
		return dtstart;
	}

	public void setDtstart(DateTime dtstart) {
		Objects.requireNonNull(dtstart);
		this.dtstart = dtstart;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		Objects.requireNonNull(period);
		this.period = period;
	}

	public void addPointCurveData(PointCurveData value) {
		this.pointCurveData.add(value);
	}

	public List<PointCurveData> getPointCurveData() {
		return pointCurveData;
	}
}
