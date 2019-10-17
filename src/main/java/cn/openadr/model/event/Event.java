package cn.openadr.model.event;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ResponseRequired;
import cn.openadr.domain.ResponseRequired.ResponseRequiredDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.target.Target;
import lombok.NoArgsConstructor;

/**
 * 事件
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = ResponseRequiredDeserializer.class)
	private ResponseRequired responseRequired;

	private final EventDescriptor descriptor = new EventDescriptor();
	private final EventActivePeriod activePeriod = new EventActivePeriod();
	private final EventSignals signals = new EventSignals();
	private final Target target = new Target();
}
