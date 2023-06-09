package tax;

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private int capacity;
    private double value;

    public Vehicle(String ownerName, String vehicleType, int capacity, double value) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.value = value;
        
    }

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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
		
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", vehicleType=" + vehicleType + ", capacity=" + capacity
				+ ", value=" + value + "]";
	}
}
