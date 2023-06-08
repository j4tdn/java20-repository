package ex02ManagingVehicle;

public class VehicleOwnerUtils {
	private VehicleOwnerUtils() {
		
	}
	
	public static void exportregistrationTax(VehicleOwner vehicaleOwner) {
		
		VehicleDetail[] vhc = vehicaleOwner.getVehicleDetail();
		
		for (VehicleDetail id : vhc) {
			System.out.print(vehicaleOwner.getOwner().getName());
			System.out.print("\t\t" + id.getVehicle().getTypeOfVehicale());
			System.out.print("\t\t" + id.getQuanity());
			System.out.print("\t\t" + id.getVehicle().getCapacity());
			System.out.print("\t\t" + id.getVehicle().getCost()*id.getQuanity());
			System.out.println("\t\t" + registrationTax(id.getVehicle())*id.getQuanity()); 
		}
	}
	public static double registrationTax(Vehicle vehicle) {
		double registrationTax = 0;
		if (vehicle.getCapacity() < 100) {
			registrationTax = 0.01*vehicle.getCost();
		}else if (vehicle.getCapacity() <= 200) {
			registrationTax = 0.03*vehicle.getCost();
		}else registrationTax = 0.05*vehicle.getCost();
	return registrationTax;
	}
}
