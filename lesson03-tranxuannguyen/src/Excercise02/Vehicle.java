package Excercise02;

public class Vehicle {
	private String vehicleOwnerName;
	private String rangeOfVehicle;
	private int capacity;
	private double price;
	 public Vehicle() {
		 
	 }
	public Vehicle(String vehicleOwnerName, String rangeOfVehicle, int capacity, double price) {
		this.vehicleOwnerName = vehicleOwnerName;
		this.rangeOfVehicle = rangeOfVehicle;
		this.capacity = capacity;
		this.price = price;
	}
	public String getVehicleOwnerName() {
		return vehicleOwnerName;
	}
	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}
	public String getRangeOfVehicle() {
		return rangeOfVehicle;
	}
	public void setRangeOfVehicle(String rangeOfVehicle) {
		this.rangeOfVehicle = rangeOfVehicle;
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
	
	@Override
	public String toString() {
		return "Vehicle [vehicleOwnerName=" + vehicleOwnerName + ", rangeOfVehicle=" + rangeOfVehicle + ", capacity="
				+ capacity + ", price=" + price + "]";
	}
}
