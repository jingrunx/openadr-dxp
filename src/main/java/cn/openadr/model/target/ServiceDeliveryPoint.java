package cn.openadr.model.target;

public class ServiceDeliveryPoint extends Node {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String name;
	public String tariffProfile;
	public String customerAgreement;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTariffProfile() {
		return tariffProfile;
	}

	public void setTariffProfile(String tariffProfile) {
		this.tariffProfile = tariffProfile;
	}

	public String getCustomerAgreement() {
		return customerAgreement;
	}

	public void setCustomerAgreement(String customerAgreement) {
		this.customerAgreement = customerAgreement;
	}
}
