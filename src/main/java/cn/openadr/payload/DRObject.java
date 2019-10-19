package cn.openadr.payload;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public abstract class DRObject implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 协议版本号
	 */
	public int version;

	public String getRoot() {
		return getClass().getSimpleName();
	}
}
