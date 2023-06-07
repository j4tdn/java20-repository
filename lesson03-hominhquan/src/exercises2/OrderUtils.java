package exercises2;

public class OrderUtils {
	private OrderUtils() {
	}
	
	public static double tax(Order order) {
		double tax = 0;
		VehicleDetail[] ids = order.getVehicleDetail();
		for(VehicleDetail id:ids) {
			int count = id.getQuantity();
			Vehicle vehicle = id.getVehicle();
			double idCost = vehicle.getPrice() * count;
			if(vehicle.getCapacity() < 100) {
				idCost *= 0.01;
			}else if(vehicle.getCapacity() < 200) {
				idCost *= 0.03;
			}else {
				idCost *= 0.05;
			}
			tax = idCost; 
		}
		return tax;
	}
}
