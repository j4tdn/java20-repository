package exercises2;

public class VehicleDetail {
	private Vehicle vehicle;
	private int quantity;
	
	public VehicleDetail() {
	}

	public VehicleDetail(Vehicle vehicle, int quantity) {
		this.vehicle = vehicle;
		this.quantity = quantity;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "VehicleDetail [vehicle=" + vehicle + ", quantity=" + quantity + "]";
	}
	
	
	
}
