package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Period;

import cn.openadr.model.report.PointCurveData;
import lombok.NonNull;

@lombok.Getter
@lombok.Setter
public class IntervalDataReportRequest extends DataReportRequest {
	private static final long serialVersionUID = 1L;

	/**
	 * 开始时间
	 */
	@NonNull
	private DateTime dtstart;

	/**
	 * 步长(单位:分钟)
	 */
	@NonNull
	private Period period;

	private final List<PointCurveData> pointCurveData = new ArrayList<>();

	public void addPointCurveData(PointCurveData value) {
		this.pointCurveData.add(value);
	}
}
