package cn.openadr.model.target;

import java.io.Serial;

/**
 * 表计类型
 */
public class MeterAsset extends Asset {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public MeterAsset() {
		super();
	}

	public MeterAsset(String mrid) {
		super(mrid);
	}
}
