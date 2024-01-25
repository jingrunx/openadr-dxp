package cn.openadr.tsdb;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import cn.openadr.domain.DataQuality;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class Data implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public Number value;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public LocalDateTime timestamp;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonDeserialize(using = DataQuality.Deserializer.class)
	public DataQuality quality;
}
