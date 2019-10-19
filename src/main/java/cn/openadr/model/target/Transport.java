package cn.openadr.model.target;

import java.io.Serializable;

public class Transport implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public Node receipt;
	public Node delivery;

	public Node getReceipt() {
		return receipt;
	}

	public void setReceipt(Node receipt) {
		this.receipt = receipt;
	}

	public Node getDelivery() {
		return delivery;
	}

	public void setDelivery(Node delivery) {
		this.delivery = delivery;
	}
}
