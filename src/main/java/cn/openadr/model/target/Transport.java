package cn.openadr.model.target;

import java.io.Serial;
import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public class Transport implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public Node receipt;
	public Node delivery;
}
