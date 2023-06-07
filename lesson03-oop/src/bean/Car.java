package bean;

import javax.swing.text.IconView;

public class Car {

	// attributes
	// when creating a new object --> Heap memory always have full attributes with default data
	
	//Static: Class scope
	// Tất cả các đối tượng thuộc class Car khi tạo ra đều có thể trỏ đến 1 ô nhớ static
	private static String model;
	
	//Non-static: object scope
	//Khi 1 đối tượng được tạo ra -> Tạo ra 1 ô nhớ bên HEAP lưu thông tin của đối tượng -> Non-static
	private int id;
	private String name;
	private String color;
	private double salesPrice;
	
	//default constructor -> hidden when we create a new constructor
	public Car() {
		
	}
	
	//constructor with full parameters
	public Car(int id, String name, String color, double salesPrice) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	
	//Getter , setter
	// Phương thức cho phép bên ngoài truy cập dữ liệu của các thuộc tính private
	//Vì sao không cho thuộc tính là public ?
	// Quản lý trong class
	// FOP 
	
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
