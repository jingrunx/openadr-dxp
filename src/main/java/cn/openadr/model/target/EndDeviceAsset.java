package cn.openadr.model.target;

import java.io.Serial;

import cn.openadr.domain.EndDeviceAssetType;

/**
 * 用电设备类型
 */
public class EndDeviceAsset extends Asset {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/* mrid = cn.openadr.domain.EndDeviceAssetType */

	public EndDeviceAsset() {
		super();
	}

	public EndDeviceAsset(String mrid) {
		super(mrid);
	}

	public EndDeviceAsset(EndDeviceAssetType assetType) {
		super(assetType.value());
	}
}
