package cn.openadr.model.target;

import cn.openadr.domain.EndDeviceAssetType;

/** 用电设备 */
public class EndDeviceAsset extends CimObject {
	private static final long serialVersionUID = 1L;

	public EndDeviceAsset() {
		super();
	}

	public EndDeviceAsset(String id) {
		super(id);
	}

	public EndDeviceAsset(EndDeviceAssetType type) {
		super(type.name());
	}
}
