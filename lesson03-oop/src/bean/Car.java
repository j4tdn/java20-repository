package bean;

public class Car {
	//attributes
	//when create a new object 
	//heap memory always have full attributes with default data
	
	//static : class scope
	// tất cả các đối tượng thuộc class Car
	//khi tạo ra đều có thể truy cập đến chung 1 ô nhớ ở static
	//khi gọi biến, hàm static nên lấy --> class.
	//có thể lấy biến .
	private static String model;
	
	//non-static: object scope
	//khi 1 đối tượng được tạo ra
	//thì sẽ có 1 ô nhớ lưu trữ những tt là non-static
	//khi gọi biến, hàm static nên lấy --> lấy biến Kiểu đối tượng gọi nó.
	
	
	private int id;
	private String name;
	private String color;
	private double salesPrice;
	
	//default constructor
	//hidden when we create new constructor
	
	//constructor with full parameters
	public Car() {
	}

	public Car(int id, String name, String color, double salesPrice) {
		this.id = id;
		this.name = name;
		
		this.color = color;
		this.salesPrice = salesPrice;
	}
	//getter, setter
	//phương thức cho phép bên ngoài truy cập vào giá trị của thuộc tính Private
	//vì sao không cho thuộc tính là public --> khỏi cần getter, setter
	// + chỉ được quản lý trong class hiện tại
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

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", color=" + color + ", salesPrice="
				+ salesPrice + "]";
	}
	
	
}
