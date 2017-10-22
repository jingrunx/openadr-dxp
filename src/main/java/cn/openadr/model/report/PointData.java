package cn.openadr.model.report;

import cn.openadr.tsdb.DataValue;

public class PointData extends DataValue {
	private static final long serialVersionUID = 1L;

	/** 测点编号 */
	private int rID;

	public PointData() {
		super();
	}

	public PointData(int rID) {
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
