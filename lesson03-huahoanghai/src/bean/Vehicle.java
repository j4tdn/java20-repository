package bean;

public class Vehicle {
	private String name;
	private String model;
	private int content;
	private double cost;

	
	public Vehicle() {

	}
	public Vehicle(String name, String model, int content, double cost) {
	
		this.name = name;
		this.model = model;
		this.content = content;
		this.cost = cost;
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
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", content=" + content + ", cost=" + cost + "]";
	}
	public static double  taxAmount(Vehicle vehicle) {
		double taxToPay = 0;
		double idCost = vehicle.getCost();
		if(vehicle.getContent() < 100) {
			taxToPay = idCost * 0.01; 
		}
		else if(vehicle.getContent() <200)
		{
			taxToPay = idCost * 0.03; 
		}
		else {
			taxToPay = idCost * 0.04; 
		}
		return taxToPay;
	}
}
