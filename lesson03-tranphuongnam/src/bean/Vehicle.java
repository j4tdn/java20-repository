package bean;

public class Vehicle {
	private String ownerName; // Tên chủ xe
	private String category; // Loại xe
	private int capacity; // Dung tích
	private double salesPrice; // Giá bán
	private double mandatoryTax; // Thuế phải nộp
	
	public Vehicle() {
		
	}
	public Vehicle(String ownerName, String category, int capacity, double salesPrice) {
		this.ownerName = ownerName;
		this.category = category;
		this.capacity = capacity;
		this.salesPrice = salesPrice;
		if(capacity < 100) {
			this.mandatoryTax = 1/100.0 * this.salesPrice;
		} else if(capacity < 200) {
			this.mandatoryTax = 3/100.0 * this.salesPrice;
		} else {
			this.mandatoryTax = 5/100.0 * this.salesPrice;
		}
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public double getMandatoryTax() {
		return mandatoryTax;
	}
	public void setMandatoryTax(double mandatoryTax) {
		this.mandatoryTax = mandatoryTax;
	}
	@Override
	public String toString() {
		return ownerName + "     " + category + "     " + capacity + "     "
				+ salesPrice + "     " + mandatoryTax;
	}
	
	
}
