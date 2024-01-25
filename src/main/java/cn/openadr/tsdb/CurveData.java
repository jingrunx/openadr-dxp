package cn.openadr.tsdb;

import java.io.Serial;
import java.io.Serializable;

@lombok.Getter
public class CurveData implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 规则数据，各数据之间间隔相同
	 */
	public final RegularCurve regular = new RegularCurve();

	/**
	 * 不规则数据，各数据之间间隔不同
	 */
	public final IrregularCurve irregular = new IrregularCurve();
}
