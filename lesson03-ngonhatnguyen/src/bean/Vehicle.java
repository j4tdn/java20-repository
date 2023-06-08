package bean;

public class Vehicle {
	private int id;
	private String ownerName;
	private String carModel;
	private int capacity; // dung tích
	private double salesPrice;
	
	public Vehicle() {
		
	}

	public Vehicle(int id, String ownerName, String carModel, int capacity, double salesPrice) {
		super();
		this.id = id;
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.capacity = capacity;
		this.salesPrice = salesPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public double calculateVAT() {
		if (capacity < 100) {
			return 0.01 * salesPrice;
		} else if (capacity >= 100 && capacity <= 200) {
			return 0.03 * salesPrice;
		} else {
			return 0.05 * salesPrice;
		} 
	}
	
	@Override
	public String toString() {
		return ownerName + "		   " + carModel + "			" + capacity + "   		  " + String.valueOf(salesPrice) + "		" + String.valueOf(calculateVAT());
	}
}
