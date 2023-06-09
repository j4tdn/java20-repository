package tax;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số lượng xe: ");
		n = Integer.parseInt(sc.nextLine());
		System.out.println("===================================");
		Vehicle[] vehicle = new Vehicle[n];
		for (int i = 0; i < vehicle.length; i++) {
			System.out.println("Nhập thông tin xe thứ " + (i + 1));
			System.out.print("Tên chủ xe: ");
			String ownerName = sc.nextLine();
			System.out.print("Loại xe: ");
			String kind = sc.nextLine();
			System.out.print("Dung tích: ");
			int capacity = sc.nextInt();
			System.out.print("Trị giá: ");
			double value = sc.nextDouble();
			sc.nextLine();
			vehicle[i] = new Vehicle(ownerName, kind, capacity, value);
			System.out.println("---------------------------------");
		}
		System.out.println("Tên chủ xe             Loại xe           Dung tích           Trị giá        Thuế phải nộp");
		System.out.println("==============================================================================");
		for (Vehicle v : vehicle) {
			System.out.println(v.getOwnerName() + "        " + v.getKind() + "        " + v.getCapacity() + "             "
					+ v.getValue() + "        " + VehicleUtils.tax(v));
		}
	}
}
