package cn.openadr.tsdb;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.openadr.domain.DataQuality;

public class Data implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	private Number value;
	private DateTime timestamp;
	private DataQuality quality;

	public Data() {
	}

	public Data(Number value) {
		this.value = value;
	}

	public Data(Number value, DateTime timestamp) {
		this.value = value;
		this.timestamp = timestamp;
	}

	public Data(Number value, DateTime timestamp, DataQuality quality) {
		this.value = value;
		this.timestamp = timestamp;
		this.quality = quality;
	}

	public Number getValue() {
		return value;
	}

	public void setValue(Number value) {
		this.value = value;
	}

	@JsonInclude(Include.NON_NULL)
	public DateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(DateTime timestamp) {
		this.timestamp = timestamp;
	}

	@JsonInclude(Include.NON_NULL)
	public DataQuality getQuality() {
		return quality;
	}

	public void setQuality(DataQuality quality) {
		this.quality = quality;
	}
}
