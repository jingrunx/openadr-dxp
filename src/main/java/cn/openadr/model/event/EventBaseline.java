package cn.openadr.model.event;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.jackson.DRObjectSerializer;
import cn.openadr.model.DRObject;
import cn.openadr.model.VEN;
import cn.openadr.model.target.Group;
import cn.openadr.model.target.Party;
import cn.openadr.model.target.Resource;

public class EventBaseline extends DRObject {
	private static final long serialVersionUID = 1L;

	private final Interval interval = new Interval();

	private final List<Group> groups = new ArrayList<>();
	private final List<Resource> resources = new ArrayList<>();
	private final List<VEN> vens = new ArrayList<>();
	private final List<Party> parties = new ArrayList<>();

	public Interval getInterval() {
		return this.interval;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<Group> getGroups() {
		return this.groups;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<Resource> getResources() {
		return this.resources;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<VEN> getVens() {
		return this.vens;
	}

	@JsonInclude(value = Include.NON_EMPTY)
	@JsonSerialize(contentUsing = DRObjectSerializer.Id.class)
	public List<Party> getParties() {
		return this.parties;
	}
}
