package cn.openadr.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.jackson.DRObjectSerializer;

/** Down Node */
public class DN extends DRObject {
	private static final long serialVersionUID = 1L;

	private String accessId;
	private String secretKey;
	private UN un;

	public DN() {
		super();
	}

	public DN(String id) {
		super(id);
	}

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	@JsonSerialize(using = DRObjectSerializer.Id.class)
	public UN getUn() {
		return un;
	}

	public void setUn(UN un) {
		this.un = un;
	}
}
