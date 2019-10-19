package cn.openadr.model.target;

import java.io.Serializable;

public class Node implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String node;

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}
}
