package cn.openadr.model.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.MetricDescription;
import cn.openadr.tsdb.CurveData;
import lombok.NoArgsConstructor;

/**
 * 基线
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventBaseline implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String baselineID;
	public String baselineName;
	public final MetricDescription metric = new MetricDescription();
	public final List<String> resourceID = new ArrayList<>();
	public final CurveData intervals = new CurveData();
}
