package cn.openadr.payload.rpt;

import java.io.Serial;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.PointCurveData;

@lombok.Getter
@lombok.Setter
public class IntervalDataReportRequest extends DataReportRequest {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 开始时间
	 */
	public LocalDateTime dtstart;
	/**
	 * 步长(单位:分钟)
	 */
	public TemporalAmount period;

	public final List<PointCurveData> pointCurveData = new ArrayList<>();

	public void addPointCurveData(PointCurveData value) {
		this.pointCurveData.add(value);
	}
}
