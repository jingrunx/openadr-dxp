package cn.openadr.model.target;

import java.io.Serial;
import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public class LoadControlType implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public double current;
	public Double normal;
	public Double min;
	public Double max;
}
