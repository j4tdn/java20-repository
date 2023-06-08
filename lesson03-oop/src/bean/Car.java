package bean;

public class Car {
	// Attributes
	private static String model;
	
	private int id;
	private String name;
	private String color;
	private double salesPrice;

	// Default constructor
	public Car() {
	}

	// Constructor with full parameters
	public Car(int id, String name, String color, double salesPrice) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	
	// getter, setter: phương thức cho phép bên ngoài truy cập giá trị của thuộc tính private
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

	public static String getModel() {
		return Car.model;
	}

	// static: lúc load chương trình, static attribute/method sẽ được tạo ra
	public static void setModel(String model) {
		Car.model = model;
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
		return "Car [id = " + id + ", name = " + name + ", model = " + Car.model + ", color = " + color + ", salesPrice = "
				+ salesPrice + "]";
	}
}
