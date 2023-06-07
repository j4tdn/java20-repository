package bean;

public class Car {
	//attributes
	private int id;
	private String name;
	private String model;
	private String color;
	private double salesPrice;
	// khi tạo đối tượng thù HEAP tạo đầy đủ các thuộc tính với giá trị mặc định
	
	
	// default constructor
	//hidden when we create a new constructor
	
	// constructor with full parameters
	public Car() {
		
	}
	public Car(int id, String name, String model, String color, double salesPrice) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	//getter và setter là những phương thức cho phép bên ngoài truy cập giá trị các thuộc tính private
	// vì sao không cho các thuộc tính là public --> khỏi cần getter, setter.
	
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
