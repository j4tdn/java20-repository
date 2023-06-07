package exercises1;

public class Item {
	private String id;
	private String model;
	private String color;
	private double price;
	
	public Item() {
	}
	public Item(String id, String model, String color, double price) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
}
