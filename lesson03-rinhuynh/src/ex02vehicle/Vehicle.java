package ex02vehicle;

public class Vehicle {
	private String ownername;
	private String model;
	private int capacity;
	private double price;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String ownername, String model, int capacity, double price) {
		this.ownername = ownername;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
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

	public Double calTax() {
		if (capacity < 100) {
			return price * 0.01;
		} else if (capacity < 200) {
			return price * 0.03;
		}
		return price * 0.05;

	}

	@Override
	public String toString() {
		return "Vehicle [ownername=" + ownername + ", model=" + model + ", capacity=" + capacity + ", price=" + price
				+ "]";
	}

}
