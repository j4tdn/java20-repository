package bean;

public class Vehicle {
	private String ownerName;
	private String model;
	private int capacity;
	private double price;
	private double tax;
	
	public Vehicle() {
		
	}

	public Vehicle(String ownerName, String model, int capacity, double price) {
		this.ownerName = ownerName;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
		if (price < 100)
			this.tax = 0.1 * price;
		else if (price < 200)
			this.tax = 0.3 * price;
		else
			this.tax = 0.5 * price;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
		return tax;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", model=" + model + ", capacity=" + capacity + ", price=" + price
				+ ", tax=" + tax + "]";
	}

	
}
