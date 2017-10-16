package cn.openadr.model.report;

import cn.openadr.tsdb.CurveData;

public class PointCurveData extends CurveData {
	private static final long serialVersionUID = 1L;

	/** 测点编号 */
	private int rID;

	public PointCurveData() {
	}

	public PointCurveData(int rID) {
		this.rID = rID;
	}

	public int getrID() {
		return rID;
	}

	public void setrID(int rID) {
		this.rID = rID;
	}
}
