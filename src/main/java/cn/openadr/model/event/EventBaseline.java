package cn.openadr.model.event;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Period;

import cn.openadr.model.DRObject;

public class EventBaseline extends DRObject {
	private static final long serialVersionUID = 1L;

	private DateTime dtstart;
	private Period duration;
	private final Intervals intervals = new Intervals();
	private final List<String> resourceIDs = new ArrayList<>();

	public DateTime getDtstart() {
		return dtstart;
	}

	public void setDtstart(DateTime dtstart) {
		this.dtstart = dtstart;
	}

	public Period getDuration() {
		return duration;
	}

	public void setDuration(Period duration) {
		this.duration = duration;
	}

	public Intervals getIntervals() {
		return this.intervals;
	}

	public List<String> getResourceIDs() {
		return resourceIDs;
	}
}
