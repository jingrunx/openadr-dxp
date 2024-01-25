package cn.openadr.model.target;

import java.io.Serial;

@lombok.Getter
@lombok.Setter
public class ServiceDeliveryPoint extends Node {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String name;
	public String tariffProfile;
	public String customerAgreement;
}
