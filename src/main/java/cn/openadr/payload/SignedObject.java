package cn.openadr.payload;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.openadr.payload.evt.CreateEventResponse;
import cn.openadr.payload.evt.DistributeEventRequest;
import cn.openadr.payload.evt.QueryEventRequest;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;
import cn.openadr.payload.poll.Poll;
import cn.openadr.payload.poll.PollResponse;
import cn.openadr.payload.reg.*;
import cn.openadr.payload.rpt.*;

@JsonInclude(Include.NON_NULL)
@lombok.Getter
@lombok.Setter
public class SignedObject implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String id;

	//public OadrDistributeEventType oadrDistributeEvent;
	public DistributeEventRequest distributeEventRequest;
	//public OadrCreatedEventType oadrCreatedEvent;
	public CreateEventResponse createdEventResponse;
	//public OadrRequestEventType oadrRequestEvent;
	public QueryEventRequest queryEventRequest;
	//public OadrResponseType oadrResponse;
	public PollResponse response;

	//public OadrCancelOptType oadrCancelOpt;
	public CancelOptRequest cancelOptRequest;
	//public OadrCanceledOptType oadrCanceledOpt;
	public CancelOptResponse cancelOptResponse;
	//public OadrCreateOptType oadrCreateOpt;
	public CreateOptRequest createOptRequest;
	//public OadrCreatedOptType oadrCreatedOpt;
	public CreateOptResponse createOptResponse;

	//public OadrCancelReportType oadrCancelReport;
	public CancelReportRequest cancelReportRequest;
	//public OadrCanceledReportType oadrCanceledReport;
	public CancelReportResponse cancelReportResponse;
	//public OadrCreateReportType oadrCreateReport;
	public CreateReportRequest createReportRequest;
	//public OadrCreatedReportType oadrCreatedReport;
	public CreateReportResponse createReportResponse;
	//public OadrRegisterReportType oadrRegisterReport;
	public RegisterReportRequest registerReportRequest;
	//public OadrRegisteredReportType oadrRegisteredReport;
	public RegisterReportResponse registerReportResponse;
	//public OadrUpdateReportType oadrUpdateReport;
	public UpdateReportRequest updateReportRequest;
	//public OadrUpdatedReportType oadrUpdatedReport;
	public UpdateReportResponse updateReportResponse;

	//public OadrCancelPartyRegistrationType oadrCancelPartyRegistration;
	public CancelRegistrationRequest cancelRegistrationRequest;
	//public OadrCanceledPartyRegistrationType oadrCanceledPartyRegistration;
	public CancelRegistrationResponse cancelRegistrationResponse;
	//public OadrCreatePartyRegistrationType oadrCreatePartyRegistration;
	public CreateRegistrationRequest createRegistrationRequest;
	//public OadrCreatedPartyRegistrationType oadrCreatedPartyRegistration;
	public CreateRegistrationResponse createRegistrationResponse;
	//public OadrRequestReregistrationType oadrRequestReregistration;
	public ReregistrationRequest reregistrationRequest;
	//public OadrQueryRegistrationType oadrQueryRegistration;
	public QueryRegistrationRequest queryRegistrationRequest;

	//public OadrPollType oadrPoll;
	public Poll poll;
}
