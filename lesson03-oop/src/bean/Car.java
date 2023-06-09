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

	//constructure with full parameters
	public Car(int id, String name, String model, String color, double salesPrice) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", color=" + color + ", salesPrice="
				+ salesPrice + "]";
	}



}
