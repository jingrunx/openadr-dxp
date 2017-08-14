package cn.openadr.model;

import java.io.Serializable;

public class OadrObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;

	public OadrObject() {
	}

	public OadrObject(String id) {
		setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
