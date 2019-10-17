package cn.openadr.model.target;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@lombok.Getter
@lombok.Setter
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
}
