package bean;

public class Vehicle {
	private String name;
	private String model;
	private int cc;
	private double price;
	private double taxPayable;

	public Vehicle() {
	}

	public Vehicle(String name, String model, int cc, double price) {
		this.name = name;
		this.model = model;
		this.cc = cc;
		this.price = price;
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

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTaxPayable() {
		return taxPayable;
	}

	public void setTaxPayable(double taxPayable) {
		this.taxPayable = taxPayable;
	}

	@Override
	public String toString() {
		return String.format("%-25s %-15s %10d %20.2f %25.2f\n", name, model, cc, price, taxPayable);
	}

	public static double getTaxPayable(Vehicle v) {
		double taxPayable = 0;
		double price = v.getPrice();
		if (v.getCc() < 100) {
			taxPayable = price * 0.01;
		} else if (v.getCc() >= 100 && v.getCc() <= 200) {
			taxPayable = price * 0.03;
		} else
			taxPayable = price * 0.05;

		return taxPayable;
	}
}
