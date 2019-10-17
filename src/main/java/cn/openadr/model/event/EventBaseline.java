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
	private static final long serialVersionUID = 1L;

	private String baselineID;
	private String baselineName;
	private final MetricDescription metric = new MetricDescription();
	private final List<String> resourceID = new ArrayList<>();
	private final CurveData intervals = new CurveData();
}
