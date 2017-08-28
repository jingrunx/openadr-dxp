package cn.openadr.model.report;

import java.util.Map;

import cn.openadr.tsdb.IrregularPart;
import cn.openadr.tsdb.Point;
import cn.openadr.tsdb.RegularPart;
import cn.openadr.tsdb.TagKey;

public class PointValues extends Point {
	private static final long serialVersionUID = 1L;

	/** 规则数据，各数据之间间隔相同 */
	private final RegularPart regular = new RegularPart();
	/** 不规则数据，各数据之间间隔不同 */
	private final IrregularPart irregular = new IrregularPart();

	public PointValues() {
		super();
	}

	public PointValues(String metric, Map<TagKey, String> tags) {
		super(metric, tags);
	}

	public RegularPart getRegular() {
		return regular;
	}

	public IrregularPart getIrregular() {
		return irregular;
	}
}
