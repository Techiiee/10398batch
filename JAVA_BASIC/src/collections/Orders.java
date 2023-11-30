package collections;

public class Orders {
	private int orderId;
	private String oName;
	private int noofOrders;

	public Orders() {

	}

	public Orders(int orderId, String oName, int noofOrders) {
		super();
		this.orderId = orderId;
		this.oName = oName;
		this.noofOrders = noofOrders;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public int getNoofOrders() {
		return noofOrders;
	}

	public void setNoofOrders(int noofOrders) {
		this.noofOrders = noofOrders;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", oName=" + oName + ", noofOrders=" + noofOrders + "]";
	}

}
