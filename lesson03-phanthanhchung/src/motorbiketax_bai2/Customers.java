package motorbiketax_bai2;
import motorbiketax_bai2.Vehicle;

public class Customers {
	private String fullName;
	private Vehicle vehicle;
	
	public Customers(String fullName, Vehicle vehicle) {
		super();
		this.fullName = fullName;
		this.vehicle = vehicle;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
