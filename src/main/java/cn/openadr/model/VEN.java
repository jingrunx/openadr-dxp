package cn.openadr.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.jackson.DRObjectSerializer;

/** Virtual End Node */
public class VEN extends DRObject {
	private static final long serialVersionUID = 1L;

	private String accessId;
	private String secretKey;
	private VTN vtn;

	public VEN() {
		super();
	}

	public VEN(String id) {
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
	public VTN getVtn() {
		return vtn;
	}

	public void setVtn(VTN vtn) {
		this.vtn = vtn;
	}
}
