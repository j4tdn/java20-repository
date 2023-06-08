package ex02ManagingVehicle;

public class VehicleDetail {
	private Vehicle vehicle;
	private int quanity;
	public VehicleDetail() {
		
	}
	public VehicleDetail(Vehicle vehicle, int quanity) {
		super();
		this.vehicle = vehicle;
		this.quanity = quanity;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	@Override
	public String toString() {
		return "VehicleDetail [vehicle=" + vehicle + ", quanity=" + quanity + "]";
	}
	
}
