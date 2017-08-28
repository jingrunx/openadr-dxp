package cn.openadr.model.target;

public class Transport extends CimObject {
	private static final long serialVersionUID = 1L;

	private Node receipt;
	private Node delivery;

	public Transport() {
		super();
	}

	public Transport(String id) {
		super(id);
	}

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
