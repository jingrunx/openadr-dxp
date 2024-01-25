package cn.openadr.model.register;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import cn.openadr.domain.ServiceType;
import cn.openadr.jackson.EnumeratedSerializer;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class ServiceSpecific implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
	private final List<KeyValue> keyValue = new ArrayList<>();

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = ServiceType.Deserializer.class)
	private ServiceType serviceName;
}
