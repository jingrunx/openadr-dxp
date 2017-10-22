package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Extension implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private List<KeyValue> info = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<KeyValue> getInfo() {
		return info;
	}

	public void setInfo(List<KeyValue> info) {
		this.info = info;
	}
}
