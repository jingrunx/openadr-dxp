package cn.openadr.tsdb;

import java.io.Serializable;

import org.joda.time.ReadableInterval;
import com.fasterxml.jackson.annotation.JsonIgnore;

@lombok.Getter
public abstract class CurveBase implements Iterable<Data>, Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 时间段
	 */
	@JsonIgnore
	public abstract ReadableInterval getInterval();
}
