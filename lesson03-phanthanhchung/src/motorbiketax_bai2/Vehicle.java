package motorbiketax_bai2;

public class Vehicle {
	private String vehicleType;
	private int capacity;
	private double price;
	
	public Vehicle(String vehicleType, int capacity, int price) {
		super();
		this.vehicleType = vehicleType;
		this.capacity = capacity;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getTax() {
		double tax = 0;
		int cap = this.capacity;
		if(cap < 100)
			tax =  this.getPrice() * 1 / (double) 100;
		else if(cap >= 100 && cap < 200)
			tax = this.getPrice() * 3 / (double) 100;
		else if(cap > 200)
			tax = this.getPrice() * 5 / (double) 100; 
		
		return tax;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", capacity=" + capacity + ", price=" + price + "]";
	}
}
