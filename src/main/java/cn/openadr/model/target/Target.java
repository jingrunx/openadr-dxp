package cn.openadr.model.target;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Target implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonInclude(value = Include.NON_EMPTY)
	private final List<String> dnID = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<String> resourceID = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<String> groupID = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<String> partyID = new ArrayList<>();

	@JsonInclude(value = Include.NON_EMPTY)
	private final List<EndDeviceAsset> endDeviceAsset = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<MeterAsset> meterAsset = new ArrayList<>();

	@JsonInclude(value = Include.NON_EMPTY)
	private final List<Pnode> pnode = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<AggregatedPnode> aggregatedPnode = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<ServiceDeliveryPoint> serviceDeliveryPoint = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<ServiceLocation> serviceLocation = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<ServiceArea> serviceArea = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	private final List<Transport> transport = new ArrayList<>();

	@JsonInclude(value = Include.NON_EMPTY)
	public List<String> getDnID() {
		return this.dnID;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<String> getResourceID() {
		return this.resourceID;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<String> getGroupID() {
		return this.groupID;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<String> getPartyID() {
		return this.partyID;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<EndDeviceAsset> getEndDeviceAsset() {
		return this.endDeviceAsset;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<MeterAsset> getMeterAsset() {
		return this.meterAsset;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<Pnode> getPnode() {
		return this.pnode;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<AggregatedPnode> getAggregatedPnode() {
		return this.aggregatedPnode;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<ServiceDeliveryPoint> getServiceDeliveryPoint() {
		return this.serviceDeliveryPoint;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<ServiceLocation> getServiceLocation() {
		return this.serviceLocation;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<ServiceArea> getServiceArea() {
		return this.serviceArea;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	public List<Transport> getTransport() {
		return this.transport;
	}
}
