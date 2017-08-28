package cn.openadr.model.target;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.jackson.DRObjectSerializer;
import cn.openadr.model.DRObject;
import cn.openadr.model.DN;

public class Target extends DRObject {
	private static final long serialVersionUID = 1L;

	private final List<Pnode> pnode = new ArrayList<>();
	private final List<AggregatedPnode> aggregatedPnode = new ArrayList<>();
	private final List<EndDeviceAsset> endDeviceAsset = new ArrayList<>();
	private final List<MeterAsset> meterAsset = new ArrayList<>();
	private final List<ServiceLocation> serviceLocation = new ArrayList<>();
	private final List<ServiceDeliveryPoint> serviceDeliveryPoint = new ArrayList<>();
	private final List<ServiceArea> serviceArea = new ArrayList<>();
	private final List<Transport> transport = new ArrayList<>();

	private final List<Group> groups = new ArrayList<>();
	private final List<Resource> resources = new ArrayList<>();
	private final List<DN> dns = new ArrayList<>();
	private final List<Party> parties = new ArrayList<>();

	public Target() {
		super();
	}

	public Target(String id) {
		super(id);
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<Pnode> getPnode() {
		return this.pnode;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<AggregatedPnode> getAggregatedPnode() {
		return this.aggregatedPnode;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<EndDeviceAsset> getEndDeviceAsset() {
		return this.endDeviceAsset;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<MeterAsset> getMeterAsset() {
		return this.meterAsset;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<ServiceLocation> getServiceLocation() {
		return this.serviceLocation;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<ServiceDeliveryPoint> getServiceDeliveryPoint() {
		return this.serviceDeliveryPoint;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<ServiceArea> getServiceArea() {
		return this.serviceArea;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<Transport> getTransport() {
		return this.transport;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<Group> getGroups() {
		return this.groups;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<Resource> getResources() {
		return this.resources;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<DN> getVens() {
		return this.dns;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<Party> getParties() {
		return this.parties;
	}
}
