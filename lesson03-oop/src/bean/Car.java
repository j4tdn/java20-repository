package bean;

public class Car {
	
	// attributes
	// when create a new object
	// heap memory always have full attributes with default data
	
	//static: class scope
	//tất cả các đối tượng thuộc class Car
	//khi tạo ra đều có thể truy cập đến chung 1 ô nhớ static
	
	//khi gọi biến, hàm static nên lấy --> Class.
	//có thể lấy đối tượng. --> không khuyến khích
	
	
	//non-static: object scope
	//khi 1 đối tượng được tạo ra
	//thì sẽ có 1 ô nhớ lưu trữ những tt là non-static
	
	//khi gọi biến, hàm non-static nên lấy --> lấy biến kiểu đối tượng gọi nó
	
	private int id;
	private String name;
	private static String model;
	private String color;
	private double salesPrice;

	
	// default constructor
	//hidden when we create a new constructor
	
	
	
	public Car() {
		super();
	}
	
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
		return model;
	}

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

	//constructor with full parameters
	public Car(int id, String name, String color, double salesPrice) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", color=" + color + ", salesPrice="
				+ salesPrice + "]";
	}



}
