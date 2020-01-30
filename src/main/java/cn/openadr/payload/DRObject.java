package cn.openadr.payload;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;

@lombok.Getter
@lombok.Setter
@JsonTypeInfo(property = "root", use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeIdResolver(DRTypeIdResolver.class)
public abstract class DRObject implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 协议版本号
	 */
	public int version;
}
