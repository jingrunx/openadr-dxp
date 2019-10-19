package cn.openadr.model.target;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@lombok.Getter
@lombok.Setter
public class Target implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@JsonInclude(value = Include.NON_EMPTY)
	public final List<String> dnID = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<String> resourceID = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<String> groupID = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<String> partyID = new ArrayList<>();

	@JsonInclude(value = Include.NON_EMPTY)
	public final List<EndDeviceAsset> endDeviceAsset = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<MeterAsset> meterAsset = new ArrayList<>();

	@JsonInclude(value = Include.NON_EMPTY)
	public final List<Pnode> pnode = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<AggregatedPnode> aggregatedPnode = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<ServiceDeliveryPoint> serviceDeliveryPoint = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<ServiceLocation> serviceLocation = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<ServiceArea> serviceArea = new ArrayList<>();
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<Transport> transport = new ArrayList<>();
}
