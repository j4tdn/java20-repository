package Excercise02;

public class VehicleUtils {
	public static double tax(Vehicle vehicle) {
		double tax = 0;
		if (vehicle.getCapacity() < 100)
			tax += vehicle.getPrice() * 0.01;
		else if (vehicle.getCapacity() >= 100 && vehicle.getCapacity() <= 200)
			tax += vehicle.getPrice() * 0.03;
		else
			tax += vehicle.getPrice() * 0.05;
		return tax;  
	}
}
