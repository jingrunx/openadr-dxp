package cn.openadr.payload;

import java.io.Serializable;

public abstract class DRObject implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 协议版本号 */
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getRoot() {
		return getClass().getSimpleName();
	}
}
