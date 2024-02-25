package cn.openadr.model.event;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;

import cn.openadr.model.report.MetricDescription;
import cn.openadr.tsdb.CurveData;

/**
 * 基线
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventBaseline implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public Long baselineID;
	public String baselineName;
	public final MetricDescription metric = new MetricDescription();
	public final List<Long> resourceID = new ArrayList<>();
	public final CurveData intervals = new CurveData();
}
