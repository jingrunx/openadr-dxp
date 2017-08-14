package cn.openadr.payload.reg;

public class CancelRegistrationResponse extends RegistrationResponse<CancelRegistrationRequest> {
	private static final long serialVersionUID = 1L;

	public CancelRegistrationResponse(CancelRegistrationRequest request) {
		super(request);
	}
}
