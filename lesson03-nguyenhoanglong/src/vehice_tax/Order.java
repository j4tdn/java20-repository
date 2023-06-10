package vehice_tax;

import java.util.Arrays;

public class Order {
	private Customer customer;
	private VehicleDetail[] vehiceDetails;
	
	public Order() {
	}

	public Order(Customer customer, VehicleDetail[] vehiceDetails) {
		this.customer = customer;
		this.vehiceDetails = vehiceDetails;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public VehicleDetail[] getVehiceDetails() {
		return vehiceDetails;
	}

	public void setVehiceDetails(VehicleDetail[] vehiceDetails) {
		this.vehiceDetails = vehiceDetails;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", vehiceDetails=" + Arrays.toString(vehiceDetails) + "]";
	}
	
	
}
