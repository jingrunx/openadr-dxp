package cn.openadr.model.target;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public class Node implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String node;
}
