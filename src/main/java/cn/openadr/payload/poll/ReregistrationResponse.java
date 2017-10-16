package cn.openadr.payload.poll;

public class ReregistrationResponse extends PollResponse {
	private static final long serialVersionUID = 1L;

	private String registrationID;

	public ReregistrationResponse(PollRequest request) {
		super(request);
	}

	public String getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
	}
}
