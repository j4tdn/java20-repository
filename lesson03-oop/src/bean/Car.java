package bean;

public class Car {
	//attribute
	//when create a new object
	//HEAP memory always have full attributes with default data
	
	//
	private int id;
	private String name;
	private static String model;
	private String color;
	private double salesPrice;
	
	//default constructor
	//hide when we create a new constructor
	public Car() {
		
	}
	//constructor with full parameters
	public Car(int id, String name, String color, double salesPrice) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	//getter, setter --> phương thức cho phép bên ngoài truy cập giá trị của các thuộc tính
	//Vì sao ko cho thuộc tính là public --> Khỏi cần getter, setter
	public int getId() {
		return id;
	}
	//c1.id = 15;
	//c1.setId(15);
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
	
	//lúc load chương trình --> static attribute, method sẽ đc tạo ra
	//this: chỉ đc ra khi khởi tạo object
	//timing: static > this
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
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", color=" + color + ", salesPrice="
				+ salesPrice + "]";
	}
}
