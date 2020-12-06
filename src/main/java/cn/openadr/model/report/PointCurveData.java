package cn.openadr.model.report;

import cn.openadr.tsdb.CurveData;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class PointCurveData extends CurveData {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 测点编号
	 */
	public int rID;
}
