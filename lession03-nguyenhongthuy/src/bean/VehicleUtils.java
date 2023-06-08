package bean;

import java.util.Scanner;

public class VehicleUtils {
	private VehicleUtils() {

	}

	public static void inputVehicles(Vehicle[] vehicles) {
		Scanner sc = new Scanner(System.in);
		int n = vehicles.length;
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap thong tin doi tuong " + (i + 1));
			System.out.print("Owner name: ");
			String ownerName = sc.nextLine();
			System.out.print("Model: ");
			String model = sc.nextLine();
			System.out.print("Capacity: ");
			int capacity = Integer.parseInt(sc.nextLine());
			System.out.print("Price: ");
			double price = Double.parseDouble(sc.nextLine());

			vehicles[i] = new Vehicle(ownerName, model, capacity, price);
		}
		sc.close();
	}
	
	public static void outputVehicles(Vehicle[] vehicles) {
		System.out.printf("\n%-20s%-10s%-13s%-15s%-15s", "Ten chu xe", "Loai xe", "Dung tich", "Gia tien", "Thue");
		System.out.println("\n======================================================================");
		for (Vehicle vehicle : vehicles) {
			System.out.printf("%-20s%-10s%-13d%-15.2f%-15.2f\n", 
								vehicle.getOwnerName(), 
								vehicle.getModel(), 
								vehicle.getCapacity(), 
								vehicle.getPrice(), 
								vehicle.getTax());
		}
	}
}
