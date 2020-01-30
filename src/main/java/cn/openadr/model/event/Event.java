package cn.openadr.model.event;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import cn.openadr.domain.ResponseRequired;
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
	private static final long serialVersionUID = cn.openadr.Version.V1;
	
	public final EventDescriptor descriptor = new EventDescriptor();
	public final EventActivePeriod activePeriod = new EventActivePeriod();
	public final EventSignals signals = new EventSignals();
	public final Target target = new Target();
	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = ResponseRequired.ResponseRequiredDeserializer.class)
	public ResponseRequired responseRequired;
}
