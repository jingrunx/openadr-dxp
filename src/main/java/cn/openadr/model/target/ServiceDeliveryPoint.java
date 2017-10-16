package cn.openadr.model.target;

public class ServiceDeliveryPoint extends Node {
	private static final long serialVersionUID = 1L;

	private String name;
	private String tariffProfile;
	private String customerAgreement;

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
