package cn.openadr.tsdb;

import java.io.Serializable;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.openadr.domain.DataQuality;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Data implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@NonNull
	public Number value;

	@JsonInclude(Include.NON_NULL)
	public DateTime timestamp;

	@JsonInclude(Include.NON_NULL)
	public DataQuality quality;
}
