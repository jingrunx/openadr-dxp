package cn.openadr.model.report;

import java.io.Serial;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import cn.openadr.tsdb.Data;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class PointData extends Data {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 测点编号
	 */
	public int rID;
}
