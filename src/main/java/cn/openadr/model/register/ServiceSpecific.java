package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ServiceType;
import cn.openadr.domain.ServiceType.ServiceTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class ServiceSpecific implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = ServiceTypeDeserializer.class)
	public ServiceType serviceName;

	@JsonInclude(value = Include.NON_EMPTY)
	public final List<KeyValue> keyValue = new ArrayList<>();
}
