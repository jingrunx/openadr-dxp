package cn.openadr.payload;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class Payload implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 广播 */
	public static final String BROADCAST = new UUID(-1L, -1L).toString();
	/** 单播 */
	public static final String UNICAST = new UUID(0L, 0L).toString();

	/** 版本号 */
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
