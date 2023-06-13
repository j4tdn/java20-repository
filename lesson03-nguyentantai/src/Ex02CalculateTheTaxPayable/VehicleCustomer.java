package Ex02CalculateTheTaxPayable;

import java.util.Arrays;

public class VehicleCustomer {
	private Customer customer;
	private VehicleDetail [] vehicleDetail;
	
	public VehicleCustomer() {

	}

	public VehicleCustomer(Customer customer, VehicleDetail[] vehicleDetail) {
		super();
		this.customer = customer;
		this.vehicleDetail = vehicleDetail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public VehicleDetail[] getVehicleDetail() {
		return vehicleDetail;
	}

	public void setVehicleDetail(VehicleDetail[] vehicleDetail) {
		this.vehicleDetail = vehicleDetail;
	}

	@Override
	public String toString() {
		return "VehicleCustomer [customer=" + customer + ", vehicleDetail=" + Arrays.toString(vehicleDetail) + "]";
	}
	
	public static void outputVehicle(VehicleCustomer vehicaleCustomer) {
		
		VehicleDetail[] vdc = vehicaleCustomer.getVehicleDetail();
		
		for (VehicleDetail id : vdc) {
			Double t = taxPayable(id.getVehicle())*id.getQuanity();
			System.out.print(vehicaleCustomer.getCustomer().getName());
			System.out.print("\t" + id.getVehicle().getType());
			System.out.print("\t" + id.getQuanity());
			System.out.print("\t" + id.getVehicle().getCapacity());
			System.out.print("\t" + id.getVehicle().getCost()*id.getQuanity());
			System.out.println("\t" + t); 
		}
	}
	
	public static double taxPayable(Vehicle vehicle) {
		double taxPayable = 0;
		if (vehicle.getCapacity() < 100) {
			taxPayable = vehicle.getCost()*0.01;
		}else if (vehicle.getCapacity() <= 200) {
			taxPayable = vehicle.getCost()*0.03;
		}else taxPayable = vehicle.getCost()*0.05;
		return taxPayable;
	}
}
