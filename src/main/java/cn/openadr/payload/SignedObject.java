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
import cn.openadr.payload.poll.Poll;
import cn.openadr.payload.poll.PollResponse;
import cn.openadr.payload.reg.*;
import cn.openadr.payload.rpt.*;

@JsonInclude(Include.NON_NULL)
@lombok.Getter
@lombok.Setter
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
	private PollResponse response;

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
	private Poll poll;
}
