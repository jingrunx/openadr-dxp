package cn.openadr.payload;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.openadr.payload.evt.CreatedEventResponse;
import cn.openadr.payload.evt.DistributeEventRequest;
import cn.openadr.payload.evt.QueryEventRequest;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;
import cn.openadr.payload.poll.PollRequest;
import cn.openadr.payload.reg.CancelRegistrationRequest;
import cn.openadr.payload.reg.CancelRegistrationResponse;
import cn.openadr.payload.reg.CreateRegistrationRequest;
import cn.openadr.payload.reg.CreateRegistrationResponse;
import cn.openadr.payload.reg.QueryRegistrationRequest;
import cn.openadr.payload.reg.ReregistrationRequest;
import cn.openadr.payload.rpt.CancelReportRequest;
import cn.openadr.payload.rpt.CancelReportResponse;
import cn.openadr.payload.rpt.CreateReportRequest;
import cn.openadr.payload.rpt.CreateReportResponse;
import cn.openadr.payload.rpt.RegisterReportRequest;
import cn.openadr.payload.rpt.RegisterReportResponse;
import cn.openadr.payload.rpt.UpdateReportRequest;
import cn.openadr.payload.rpt.UpdateReportResponse;

@JsonInclude(Include.NON_NULL)
public class SignedObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	//private OadrDistributeEventType oadrDistributeEvent;
	private DistributeEventRequest distributeEventRequest;
	//private OadrCreatedEventType oadrCreatedEvent;
	private CreatedEventResponse createdEventResponse;
	//private OadrRequestEventType oadrRequestEvent;
	private QueryEventRequest queryEventRequest;
	//private OadrResponseType oadrResponse;
	private DNResponse response;

	//private OadrCancelOptType oadrCancelOpt;
	private CancelOptRequest cancelOptRequest;
	//private OadrCanceledOptType oadrCanceledOpt;
	private CancelOptResponse cancelOptResponse;
	//private OadrCreateOptType oadrCreateOpt;
	private CreateOptRequest createOptRequest;
	//private OadrCreatedOptType oadrCreatedOpt;
	private CreateOptResponse createOptResponse;

	//private OadrCancelReportType oadrCancelReport;
	private CancelReportRequest cancelReportRequest;
	//private OadrCanceledReportType oadrCanceledReport;
	private CancelReportResponse cancelReportResponse;
	//private OadrCreateReportType oadrCreateReport;
	private CreateReportRequest createReportRequest;
	//private OadrCreatedReportType oadrCreatedReport;
	private CreateReportResponse createReportResponse;
	//private OadrRegisterReportType oadrRegisterReport;
	private RegisterReportRequest registerReportRequest;
	//private OadrRegisteredReportType oadrRegisteredReport;
	private RegisterReportResponse registerReportResponse;
	//private OadrUpdateReportType oadrUpdateReport;
	private UpdateReportRequest updateReportRequest;
	//private OadrUpdatedReportType oadrUpdatedReport;
	private UpdateReportResponse updateReportResponse;

	//private OadrCancelPartyRegistrationType oadrCancelPartyRegistration;
	private CancelRegistrationRequest cancelRegistrationRequest;
	//private OadrCanceledPartyRegistrationType oadrCanceledPartyRegistration;
	private CancelRegistrationResponse cancelRegistrationResponse;
	//private OadrCreatePartyRegistrationType oadrCreatePartyRegistration;
	private CreateRegistrationRequest createRegistrationRequest;
	//private OadrCreatedPartyRegistrationType oadrCreatedPartyRegistration;
	private CreateRegistrationResponse createRegistrationResponse;
	//private OadrRequestReregistrationType oadrRequestReregistration;
	private ReregistrationRequest reregistrationRequest;
	//private OadrQueryRegistrationType oadrQueryRegistration;
	private QueryRegistrationRequest queryRegistrationRequest;

	//private OadrPollType oadrPoll;
	private PollRequest pollRequest;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DistributeEventRequest getDistributeEventRequest() {
		return distributeEventRequest;
	}

	public void setDistributeEventRequest(DistributeEventRequest distributeEventRequest) {
		this.distributeEventRequest = distributeEventRequest;
	}

	public CreatedEventResponse getCreatedEventResponse() {
		return createdEventResponse;
	}

	public void setCreatedEventResponse(CreatedEventResponse createdEventResponse) {
		this.createdEventResponse = createdEventResponse;
	}

	public QueryEventRequest getQueryEventRequest() {
		return queryEventRequest;
	}

	public void setQueryEventRequest(QueryEventRequest queryEventRequest) {
		this.queryEventRequest = queryEventRequest;
	}

	public DNResponse getResponse() {
		return response;
	}

	public void setResponse(DNResponse response) {
		this.response = response;
	}

	public CancelOptRequest getCancelOptRequest() {
		return cancelOptRequest;
	}

	public void setCancelOptRequest(CancelOptRequest cancelOptRequest) {
		this.cancelOptRequest = cancelOptRequest;
	}

	public CancelOptResponse getCancelOptResponse() {
		return cancelOptResponse;
	}

	public void setCancelOptResponse(CancelOptResponse cancelOptResponse) {
		this.cancelOptResponse = cancelOptResponse;
	}

	public CreateOptRequest getCreateOptRequest() {
		return createOptRequest;
	}

	public void setCreateOptRequest(CreateOptRequest createOptRequest) {
		this.createOptRequest = createOptRequest;
	}

	public CreateOptResponse getCreateOptResponse() {
		return createOptResponse;
	}

	public void setCreateOptResponse(CreateOptResponse createOptResponse) {
		this.createOptResponse = createOptResponse;
	}

	public CancelReportRequest getCancelReportRequest() {
		return cancelReportRequest;
	}

	public void setCancelReportRequest(CancelReportRequest cancelReportRequest) {
		this.cancelReportRequest = cancelReportRequest;
	}

	public CancelReportResponse getCancelReportResponse() {
		return cancelReportResponse;
	}

	public void setCancelReportResponse(CancelReportResponse cancelReportResponse) {
		this.cancelReportResponse = cancelReportResponse;
	}

	public CreateReportRequest getCreateReportRequest() {
		return createReportRequest;
	}

	public void setCreateReportRequest(CreateReportRequest createReportRequest) {
		this.createReportRequest = createReportRequest;
	}

	public CreateReportResponse getCreateReportResponse() {
		return createReportResponse;
	}

	public void setCreateReportResponse(CreateReportResponse createReportResponse) {
		this.createReportResponse = createReportResponse;
	}

	public RegisterReportRequest getRegisterReportRequest() {
		return registerReportRequest;
	}

	public void setRegisterReportRequest(RegisterReportRequest registerReportRequest) {
		this.registerReportRequest = registerReportRequest;
	}

	public RegisterReportResponse getRegisterReportResponse() {
		return registerReportResponse;
	}

	public void setRegisterReportResponse(RegisterReportResponse registerReportResponse) {
		this.registerReportResponse = registerReportResponse;
	}

	public UpdateReportRequest getUpdateReportRequest() {
		return updateReportRequest;
	}

	public void setUpdateReportRequest(UpdateReportRequest updateReportRequest) {
		this.updateReportRequest = updateReportRequest;
	}

	public UpdateReportResponse getUpdateReportResponse() {
		return updateReportResponse;
	}

	public void setUpdateReportResponse(UpdateReportResponse updateReportResponse) {
		this.updateReportResponse = updateReportResponse;
	}

	public CancelRegistrationRequest getCancelRegistrationRequest() {
		return cancelRegistrationRequest;
	}

	public void setCancelRegistrationRequest(CancelRegistrationRequest cancelRegistrationRequest) {
		this.cancelRegistrationRequest = cancelRegistrationRequest;
	}

	public CancelRegistrationResponse getCancelRegistrationResponse() {
		return cancelRegistrationResponse;
	}

	public void setCancelRegistrationResponse(CancelRegistrationResponse cancelRegistrationResponse) {
		this.cancelRegistrationResponse = cancelRegistrationResponse;
	}

	public CreateRegistrationRequest getCreateRegistrationRequest() {
		return createRegistrationRequest;
	}

	public void setCreateRegistrationRequest(CreateRegistrationRequest createRegistrationRequest) {
		this.createRegistrationRequest = createRegistrationRequest;
	}

	public CreateRegistrationResponse getCreateRegistrationResponse() {
		return createRegistrationResponse;
	}

	public void setCreateRegistrationResponse(CreateRegistrationResponse createRegistrationResponse) {
		this.createRegistrationResponse = createRegistrationResponse;
	}

	public ReregistrationRequest getReregistrationRequest() {
		return reregistrationRequest;
	}

	public void setReregistrationRequest(ReregistrationRequest reregistrationRequest) {
		this.reregistrationRequest = reregistrationRequest;
	}

	public QueryRegistrationRequest getQueryRegistrationRequest() {
		return queryRegistrationRequest;
	}

	public void setQueryRegistrationRequest(QueryRegistrationRequest queryRegistrationRequest) {
		this.queryRegistrationRequest = queryRegistrationRequest;
	}

	public PollRequest getPollRequest() {
		return pollRequest;
	}

	public void setPollRequest(PollRequest pollRequest) {
		this.pollRequest = pollRequest;
	}
}
