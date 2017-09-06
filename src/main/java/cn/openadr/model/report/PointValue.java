package cn.openadr.model.report;

import cn.openadr.tsdb.ValuePart;

public class PointValue extends ValuePart {
	private static final long serialVersionUID = 1L;

	/** 测点编号 */
	private int rID;

	public PointValue() {
		super();
	}

	public PointValue(int rID) {
		super();
		this.rID = rID;
	}

	public int getrID() {
		return rID;
	}

	public void setrID(int rID) {
		this.rID = rID;
	}

}
