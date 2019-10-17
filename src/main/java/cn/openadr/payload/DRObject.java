package cn.openadr.payload;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public abstract class DRObject implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 协议版本号
	 */
	private int version;

	public String getRoot() {
		return getClass().getSimpleName();
	}
}
