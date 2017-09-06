package cn.openadr.payload;

import cn.openadr.domain.EnumeratedType;
import cn.openadr.domain.ServiceName;
import cn.openadr.payload.evt.QueryEventRequest;
import cn.openadr.payload.evt.QueryEventResponse;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.OptResponse;
import cn.openadr.payload.pull.PollRequest;
import cn.openadr.payload.pull.PollResponse;
import cn.openadr.payload.reg.CancelRegistrationRequest;
import cn.openadr.payload.reg.CreateRegistrationRequest;
import cn.openadr.payload.reg.CreateRegistrationResponse;
import cn.openadr.payload.reg.QueryRegistrationRequest;
import cn.openadr.payload.reg.RegistrationResponse;
import cn.openadr.payload.rpt.CancelReportRequest;
import cn.openadr.payload.rpt.CreateReportRequest;
import cn.openadr.payload.rpt.CreateReportResponse;
import cn.openadr.payload.rpt.DataReportResponse;
import cn.openadr.payload.rpt.HistoryReportRequest;
import cn.openadr.payload.rpt.LiveReportRequest;
import cn.openadr.payload.rpt.MetadataReportRequest;
import cn.openadr.payload.rpt.ReportResponse;

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
		RegistrationResponse.class), //
	QUERY_REG(
		"queryRegistration",
		ServiceName.EI_REGISTER_PARTY,
		QueryRegistrationRequest.class,
		RegistrationResponse.class), //

	QUERY_EVENT("queryEvent", ServiceName.EI_EVENT, QueryEventRequest.class, QueryEventResponse.class), //

	REGISTER_REPORT("registerReport", ServiceName.EI_REPORT, MetadataReportRequest.class, ReportResponse.class), //
	CREATE_REPORT("createReport", ServiceName.EI_REPORT, CreateReportRequest.class, CreateReportResponse.class), //
	CANCEL_REPORT("cancelReport", ServiceName.EI_REPORT, CancelReportRequest.class, ReportResponse.class), //
	METADATA_REPORT("metadataReport", ServiceName.EI_REPORT, MetadataReportRequest.class, DataReportResponse.class), //
	LIVE_REPORT("liveReport", ServiceName.EI_REPORT, LiveReportRequest.class, DataReportResponse.class), //
	HISTORY_REPORT("historyReport", ServiceName.EI_REPORT, HistoryReportRequest.class, DataReportResponse.class), //

	CREATE_OPT("createOpt", ServiceName.EI_OPT, CreateOptRequest.class, OptResponse.class), //
	CANCEL_OPT("cancelOpt", ServiceName.EI_OPT, CancelOptRequest.class, OptResponse.class), //

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
