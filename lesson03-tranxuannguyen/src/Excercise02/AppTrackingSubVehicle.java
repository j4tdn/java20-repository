package Excercise02;
import java.util.Scanner;

public class AppTrackingSubVehicle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		System.out.print("Nhập số lượng xe: ");
		N = Integer.parseInt(sc.nextLine());
		Vehicle[] vehicle = new Vehicle[N];
		for (int i = 0; i < vehicle.length; i++) {
			System.out.println("Xe thứ " + (i + 1));
			System.out.print("Tên chủ xe: ");
			String vehicleOwnerName = sc.nextLine();
			System.out.print("Loại xe: ");
			String rangeOfVehicle = sc.nextLine();
			System.out.print("Dung tích: ");
			int capacity = sc.nextInt();
			System.out.print("Trị giá: ");
			double price = sc.nextDouble();
			sc.nextLine();
			vehicle[i] = new Vehicle(vehicleOwnerName, rangeOfVehicle, capacity, price);
		}
		System.out.printf("%-20s%-10s%10s%20s%20s\n", "Tên chủ xe"
				,"Loại xe"
				,"Dung tích"
				,"Trị giá"
				,"Thuế phải nộp");
		System.out.println("=================================================================================================");
		for (Vehicle n : vehicle) {
			System.out.printf("%-20s%-10s%10d%20.2f%20.2f\n", n.getVehicleOwnerName()
					,n.getRangeOfVehicle()
					,n.getCapacity()
					,n.getPrice()
					,VehicleUtils.tax(n));
		}
	}
}
