package cn.openadr.payload;

import cn.openadr.domain.EnumeratedType;
import cn.openadr.domain.ServiceType;
import cn.openadr.payload.evt.CreateEventResponse;
import cn.openadr.payload.evt.DistributeEventRequest;
import cn.openadr.payload.evt.QueryEventRequest;
import cn.openadr.payload.evt.QueryEventResponse;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;
import cn.openadr.payload.poll.DrResponse;
import cn.openadr.payload.poll.Poll;
import cn.openadr.payload.poll.PollResponse;
import cn.openadr.payload.reg.*;
import cn.openadr.payload.rpt.*;

public enum MessageType implements EnumeratedType {
	QUERY_REG("queryRegistration", ServiceType.REGISTER, QueryRegistrationRequest.class, CreateRegistrationResponse.class),
	CREATE_REG("createRegistration", ServiceType.REGISTER, CreateRegistrationRequest.class, CreateRegistrationResponse.class),
	CANCEL_REG("cancelRegistration", ServiceType.REGISTER, CancelRegistrationRequest.class, CancelRegistrationResponse.class),
	RE_REG("reregistration", ServiceType.REGISTER, ReregistrationRequest.class, DrResponse.class),

	DIST_EVENT("distEvent", ServiceType.EVENT, DistributeEventRequest.class, CreateEventResponse.class),
	QUERY_EVENT("queryEvent", ServiceType.EVENT, QueryEventRequest.class, QueryEventResponse.class),

	REGISTER_REPORT("registerReport", ServiceType.REPORT, RegisterReportRequest.class, RegisterReportResponse.class),
	CREATE_REPORT("createReport", ServiceType.REPORT, CreateReportRequest.class, CreateReportResponse.class),
	CANCEL_REPORT("cancelReport", ServiceType.REPORT, CancelReportRequest.class, CancelReportResponse.class),
	UPDATE_REPORT("updateReport", ServiceType.REPORT, UpdateReportRequest.class, UpdateReportResponse.class),
	RESOURCE_REPORT("resourceReport", ServiceType.REPORT, ResourceReportRequest.class, DataReportResponse.class),
	MOMENT_REPORT("momentReport", ServiceType.REPORT, MomentDataReportRequest.class, DataReportResponse.class),
	INTERVAL_REPORT("intervalReport", ServiceType.REPORT, IntervalDataReportRequest.class, DataReportResponse.class),

	CREATE_OPT("createOpt", ServiceType.OPT, CreateOptRequest.class, CreateOptResponse.class),
	CANCEL_OPT("cancelOpt", ServiceType.OPT, CancelOptRequest.class, CancelOptResponse.class),

	POLL("poll", ServiceType.POLL, Poll.class, PollResponse.class);

	private final String value;
	public final ServiceType service;
	public final Class<? extends DRRequest> reqClass;
	public final Class<? extends DRResponse> respClass;

	MessageType(String value, ServiceType service,
		Class<? extends DRRequest> reqClass, Class<? extends DRResponse> respClass) {
		this.value = value;
		this.service = service;
		this.reqClass = reqClass;
		this.respClass = respClass;
	}

	@Override
	public String value() {
		return value;
	}
}
