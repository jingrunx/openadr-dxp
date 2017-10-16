package cn.openadr.payload;

import cn.openadr.domain.EnumeratedType;
import cn.openadr.domain.ServiceName;
import cn.openadr.payload.evt.QueryEventRequest;
import cn.openadr.payload.evt.QueryEventResponse;
import cn.openadr.payload.evt.ReplyEventRequest;
import cn.openadr.payload.evt.ReplyEventResponse;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;
import cn.openadr.payload.poll.PollRequest;
import cn.openadr.payload.poll.PollResponse;
import cn.openadr.payload.reg.CancelRegistrationRequest;
import cn.openadr.payload.reg.CancelRegistrationResponse;
import cn.openadr.payload.reg.CreateRegistrationRequest;
import cn.openadr.payload.reg.CreateRegistrationResponse;
import cn.openadr.payload.reg.QueryRegistrationRequest;
import cn.openadr.payload.reg.QueryRegistrationResponse;
import cn.openadr.payload.rpt.CancelReportRequest;
import cn.openadr.payload.rpt.CancelReportResponse;
import cn.openadr.payload.rpt.CreateReportRequest;
import cn.openadr.payload.rpt.CreateReportResponse;
import cn.openadr.payload.rpt.DataReportResponse;
import cn.openadr.payload.rpt.HistoryReportRequest;
import cn.openadr.payload.rpt.LiveReportRequest;
import cn.openadr.payload.rpt.RegisterReportRequest;
import cn.openadr.payload.rpt.RegisterReportResponse;

public enum MessageType implements EnumeratedType {
	CREATE_REG(
		"createRegistration",
		ServiceName.EI_REGISTER_PARTY,
		CreateRegistrationRequest.class,
		CreateRegistrationResponse.class), //
	CANCEL_REG(
		"cancelRegistration",
		ServiceName.EI_REGISTER_PARTY,
		CancelRegistrationRequest.class,
		CancelRegistrationResponse.class), //
	QUERY_REG(
		"queryRegistration",
		ServiceName.EI_REGISTER_PARTY,
		QueryRegistrationRequest.class,
		QueryRegistrationResponse.class), //

	QUERY_EVENT("queryEvent", ServiceName.EI_EVENT, QueryEventRequest.class, QueryEventResponse.class), //
	REPLY_EVENT("replyEvent", ServiceName.EI_EVENT, ReplyEventRequest.class, ReplyEventResponse.class), //

	REGISTER_REPORT("registerReport", ServiceName.EI_REPORT, RegisterReportRequest.class, RegisterReportResponse.class), //
	CREATE_REPORT("createReport", ServiceName.EI_REPORT, CreateReportRequest.class, CreateReportResponse.class), //
	CANCEL_REPORT("cancelReport", ServiceName.EI_REPORT, CancelReportRequest.class, CancelReportResponse.class), //
	LIVE_REPORT("liveReport", ServiceName.EI_REPORT, LiveReportRequest.class, DataReportResponse.class), //
	HISTORY_REPORT("historyReport", ServiceName.EI_REPORT, HistoryReportRequest.class, DataReportResponse.class), //

	CREATE_OPT("createOpt", ServiceName.EI_OPT, CreateOptRequest.class, CreateOptResponse.class), //
	CANCEL_OPT("cancelOpt", ServiceName.EI_OPT, CancelOptRequest.class, CancelOptResponse.class), //

	PULL("poll", ServiceName.EI_POLL, PollRequest.class, PollResponse.class);

	private final String value;
	public final ServiceName service;
	public final Class<? extends DRRequest> request;
	public final Class<? extends DRResponse<?>> response;

	private MessageType(String value, ServiceName service, Class<? extends DRRequest> request,
		Class<? extends DRResponse<?>> response) {
		this.value = value;
		this.service = service;
		this.request = request;
		this.response = response;
	}

	@Override
	public String value() {
		return value;
	}
}
