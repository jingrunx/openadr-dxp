package cn.openadr.tsdb;

import java.io.Serializable;

public class CurveData implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 规则数据，各数据之间间隔相同 */
	private final RegularValue regular = new RegularValue();
	/** 不规则数据，各数据之间间隔不同 */
	private final IrregularValue irregular = new IrregularValue();

	public RegularValue getRegular() {
		return regular;
	}

	public IrregularValue getIrregular() {
		return irregular;
	}
}
