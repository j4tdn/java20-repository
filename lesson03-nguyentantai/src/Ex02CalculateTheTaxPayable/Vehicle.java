package Ex02CalculateTheTaxPayable;

public class Vehicle {
	private String id;
	private String type;
	private int capacity;
	private double cost;
	
	public Vehicle() {

	}

	public Vehicle(String id, String type, int capacity, double cost) {
		this.id = id;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "Vehicle [id=" + id + ", type=" + type + ", capacity=" + capacity + ", cost=" + cost + "]";
	}
	
}
