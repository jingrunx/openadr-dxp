package cn.openadr.model.event;

import java.io.Serializable;

import cn.openadr.tsdb.IrregularPart;
import cn.openadr.tsdb.RegularPart;

public class Intervals implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 规则数据，Interval的一种简单表达方式 */
	private final RegularPart regular = new RegularPart();
	/** 不规则数据，Interval的标准表达方式 */
	private final IrregularPart irregular = new IrregularPart();

	public RegularPart getRegular() {
		return regular;
	}

	public IrregularPart getIrregular() {
		return irregular;
	}
}
