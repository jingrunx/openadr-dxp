package cn.openadr.model.target;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public class LoadControl implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public LoadControlType capacity;
	public LoadControlType levelOffset;
	public LoadControlType percentOffset;
	public LoadControlType setPoint;
}
