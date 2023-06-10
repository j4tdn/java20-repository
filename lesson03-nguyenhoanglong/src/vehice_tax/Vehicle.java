package vehice_tax;

public class Vehicle {
	private String id;
	private String model;
	private String color;
	private int capacity;
	private double cost;
	
	public Vehicle() {
	}

	public Vehicle(String id, String model, String color, int capacity, double cost) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
		return "Vehicle [id=" + id + ", model=" + model + ", color=" + color + ", capacity=" + capacity + ", cost="
				+ cost + "]";
	}
	
	
	
	
}
