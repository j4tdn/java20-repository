package vehice_tax;

public class OrderUtils {
	public static double tax(Order order) {
		double tax = 0;
		VehicleDetail [] vhs = order.getVehiceDetails();
		for (VehicleDetail id:vhs) {
			Vehicle vehicle = id.getVehicle();
			int quantity = id.getQuantity();
			double isCost = vehicle.getCost() * quantity;
			
			if (vehicle.getCapacity() < 100) {
				isCost *= 0.1;
			}else if (vehicle.getCapacity() < 200 ) {
				isCost *= 0.3;
			}else {
				isCost *= 0.5;
			}
				tax += isCost;
		}
		return tax;
	}
}
// vehicle.getCapacity() >= 100 && vehicle.getCapacity() < 200 