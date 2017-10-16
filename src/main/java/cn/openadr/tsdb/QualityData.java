package cn.openadr.tsdb;

import java.io.Serializable;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.openadr.domain.DataQuality;

@JsonInclude(Include.NON_NULL)
public class QualityData implements Serializable {
	private static final long serialVersionUID = 1L;

	private Number value;
	private DateTime timestamp;
	private DataQuality quality;

	public QualityData() {
	}

	public QualityData(Number value) {
		this.value = value;
	}

	public QualityData(Number value, DateTime timestamp) {
		this.value = value;
		this.timestamp = timestamp;
	}

	public QualityData(Number value, DateTime timestamp, DataQuality quality) {
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
