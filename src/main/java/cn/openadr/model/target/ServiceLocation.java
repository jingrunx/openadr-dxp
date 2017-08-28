package cn.openadr.model.target;

import java.util.List;

public class ServiceLocation extends CimObject {
	private static final long serialVersionUID = 1L;

	private List<ServiceDeliveryPoint> serviceDeliveryPoints;

	public ServiceLocation() {
		super();
	}

	public ServiceLocation(String id) {
		super(id);
	}

	public List<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		return serviceDeliveryPoints;
	}

	public void setServiceDeliveryPoints(List<ServiceDeliveryPoint> serviceDeliveryPoints) {
		this.serviceDeliveryPoints = serviceDeliveryPoints;
	}
}
