package cn.openadr.payload;

import java.io.Serializable;

public class DRPayload implements Serializable {
	private static final long serialVersionUID = 1L;

	private final SignedObject signedObject = new SignedObject();
	private String publicKey;
	private SignMethod signMethod;
	private String signature;

	public SignedObject getSignedObject() {
		return signedObject;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public SignMethod getSignMethod() {
		return signMethod;
	}

	public void setSignMethod(SignMethod signMethod) {
		this.signMethod = signMethod;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
}
