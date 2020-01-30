package cn.openadr.model.target;

@lombok.Getter
@lombok.Setter
public class ServiceDeliveryPoint extends Node {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String name;
	public String tariffProfile;
	public String customerAgreement;
}
