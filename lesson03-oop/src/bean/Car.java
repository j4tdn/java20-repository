package bean;

public class Car {
	// attributes
	// when create a new object
	// heap memory always have full attributes with default data
	private int id;
	private String name;
	private String model;
	private String color;
	private double salesPrice;

	// default constructor
	// hidden when we create a new constructor
	public Car() {

	}

	// constructor with full parameter
	public Car(int id, String name, String model, String color, double salesPrice) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	
	// getter, setter
	// phương thức cho phép bên ngoài truy cập giá trị của
	// các thuộc tính private
	// Vì sao ko cho thuộc tính là public --> khỏi cần getter, setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", color=" + color + ", salesPrice="
				+ salesPrice + "]";
	}

}
