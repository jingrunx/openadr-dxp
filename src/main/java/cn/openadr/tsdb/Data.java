package cn.openadr.tsdb;

import java.io.Serializable;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.openadr.domain.Quality;
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
	private static final long serialVersionUID = 1L;

	@NonNull
	private Number value;

	@JsonInclude(Include.NON_NULL)
	private DateTime timestamp;

	@JsonInclude(Include.NON_NULL)
	private Quality quality;
}
