package ex02ManagingVehicle;

public class Vehicle {
	private String id;
	private String typeOfVehicale;
	private int capacity;
	private double cost;
	public Vehicle() {
	}
	public Vehicle(String id, String typeOfVehicale, int capacity, double cost) {
		super();
		this.id = id;
		this.typeOfVehicale = typeOfVehicale;
		this.capacity = capacity;
		this.cost = cost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeOfVehicale() {
		return typeOfVehicale;
	}
	public void setTypeOfVehicale(String typeOfVehicale) {
		this.typeOfVehicale = typeOfVehicale;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", typeOfVehicale=" + typeOfVehicale + ", capacity=" + capacity + ", cost=" + cost
				+ "]";
	}
	
}
