package cn.openadr.payload;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public class DRPayload implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final SignedObject signedObject = new SignedObject();
	public String publicKey;
	public SignMethod signMethod;
	public String signature;

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
