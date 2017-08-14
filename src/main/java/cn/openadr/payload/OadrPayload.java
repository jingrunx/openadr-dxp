package cn.openadr.payload;

import java.io.Serializable;
import java.util.UUID;

import cn.openadr.domain.UniqueIdentifier;

public class OadrPayload implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 广播 */
	public static final String BROADCAST = new UUID(-1L, -1L).toString();
	/** 单播 */
	public static final String UNICAST = new UUID(0L, 0L).toString();

	/** 编号 */
	private String id = UniqueIdentifier.classBased(getClass())
		.toString();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
