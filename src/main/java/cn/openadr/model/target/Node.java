package cn.openadr.model.target;

import java.io.Serializable;

public class Node implements Serializable {
	private static final long serialVersionUID = 1L;

	private String node;

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}
}
