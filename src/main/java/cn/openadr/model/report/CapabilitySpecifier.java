package cn.openadr.model.report;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.OadrObject;
import cn.openadr.model.event.Interval;
import cn.openadr.tsdb.PointLimit;
import cn.openadr.tsdb.PointValue;

/** 策略及响应能力 */
public class CapabilitySpecifier extends OadrObject {
	private static final long serialVersionUID = 1L;

	/** 响应能力 */
	private final Interval interval = new Interval();
	/** 设定点，表示策略控制的测点 */
	//timestamp只取时间部分，如果timestamp为空，表示全程有效
	private final List<PointValue> setPoints = new ArrayList<>();
	/** 检查点，表示策略保证检查的测点在规定取值范围之内 */
	private final List<PointLimit> chkPoints = new ArrayList<>();

	public Interval getInterval() {
		return interval;
	}

	public List<PointValue> getSetPoints() {
		return setPoints;
	}

	public List<PointLimit> getChkPoints() {
		return chkPoints;
	}
}
