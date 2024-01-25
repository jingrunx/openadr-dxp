package cn.openadr.tsdb;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import org.apache.commons.lang3.tuple.Pair;
import com.fasterxml.jackson.annotation.JsonIgnore;

@lombok.Getter
public abstract class CurveBase implements Iterable<Data>, Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 时间段
	 */
	@JsonIgnore
	public abstract Pair<LocalDateTime, LocalDateTime> getInterval();
}
