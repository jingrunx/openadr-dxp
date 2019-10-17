package cn.openadr.model.report;

import cn.openadr.tsdb.CurveData;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class PointCurveData extends CurveData {
	private static final long serialVersionUID = 1L;

	/**
	 * 测点编号
	 */
	private int rID;
}
