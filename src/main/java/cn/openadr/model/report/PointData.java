package cn.openadr.model.report;

import cn.openadr.tsdb.Data;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class PointData extends Data {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 测点编号
	 */
	public int rID;
}
