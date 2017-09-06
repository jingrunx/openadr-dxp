package cn.openadr.tsdb;

import java.io.Serializable;

public class CurveValues implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 规则数据，各数据之间间隔相同 */
	private final RegularPart regular = new RegularPart();
	/** 不规则数据，各数据之间间隔不同 */
	private final IrregularPart irregular = new IrregularPart();

	public RegularPart getRegular() {
		return regular;
	}

	public IrregularPart getIrregular() {
		return irregular;
	}
}
