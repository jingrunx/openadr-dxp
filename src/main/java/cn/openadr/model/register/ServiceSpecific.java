package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	private static final long serialVersionUID = 1L;

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = ServiceTypeDeserializer.class)
	private ServiceType serviceName;

	private final List<KeyValue> keyValue = new ArrayList<>();
}
