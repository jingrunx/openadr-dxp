package cn.openadr.model.report;

import cn.openadr.tsdb.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class PointData extends Data {
	private static final long serialVersionUID = 1L;

	/**
	 * 测点编号
	 */
	private int rID;
}
