package vehicle_registration;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	private double value;
	private double cylinder;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getCylinder() {
		return cylinder;
	}

	public void setCylinder(double cylinder) {
		this.cylinder = cylinder;
	}

	public Vehicle(String ownerName, String vehicleType, double value, double cylinder) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.value = value;
		this.cylinder = cylinder;
	}

	public Vehicle() {
	}

	public double calculateRegistrationTax() {
		double registrationTax;
		if (cylinder < 100) {
			registrationTax = value * 0.01;

		} else if (cylinder <= 200) {
			registrationTax = value * 0.03;
		} else {
			registrationTax = value * 0.05;
		}
		return registrationTax;
	}
}
