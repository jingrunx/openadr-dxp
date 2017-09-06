package cn.openadr.model.report;

import cn.openadr.tsdb.CurveValues;

public class PointValues extends CurveValues {
	private static final long serialVersionUID = 1L;

	/** 测点编号 */
	private int rID;

	public PointValues() {
	}

	public PointValues(int rID) {
		this.rID = rID;
	}

	public int getrID() {
		return rID;
	}

	public void setrID(int rID) {
		this.rID = rID;
	}
}
