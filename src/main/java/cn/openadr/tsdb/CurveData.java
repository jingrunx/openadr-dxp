package cn.openadr.tsdb;

import java.io.Serializable;

public class CurveData implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 规则数据，各数据之间间隔相同
	 */
	private final RegularCurve regular = new RegularCurve();

	/**
	 * 不规则数据，各数据之间间隔不同
	 */
	private final IrregularCurve irregular = new IrregularCurve();

	public RegularCurve getRegular() {
		return regular;
	}

	public IrregularCurve getIrregular() {
		return irregular;
	}
}
