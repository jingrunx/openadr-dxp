package cn.openadr.model.target;

import java.io.Serializable;

public class Transport implements Serializable {
	private static final long serialVersionUID = 1L;

	private Node receipt;
	private Node delivery;

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
