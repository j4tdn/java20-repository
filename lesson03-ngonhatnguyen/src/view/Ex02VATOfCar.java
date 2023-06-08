package view;

import java.util.Scanner;

import bean.Vehicle;

public class Ex02VATOfCar {
	public static void main(String[] args) {
		int n;
		Vehicle[] vehicles;
		Scanner sc = new Scanner(System.in);
		// 1
		System.out.print("Số xe muốn tạo: ");
		n = Integer.parseInt(sc.nextLine());
		vehicles = new Vehicle[n];
		for (int i = 0; i < n; i++) {
			vehicles[i] = new Vehicle();
			System.out.println("Xe thứ " + (i + 1));
			System.out.print("Nhập id: ");
			vehicles[i].setId(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhập tên chủ xe: ");
			vehicles[i].setOwnerName(sc.nextLine());
			System.out.print("Nhập Loại xe: ");
			vehicles[i].setCarModel(sc.nextLine());
			System.out.print("Nhập dung tích: ");
			vehicles[i].setCapacity(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhập trị giá: ");
			vehicles[i].setSalesPrice(Double.parseDouble(sc.nextLine()));
		}
		
		// 2.
		System.out.println("Tên chủ xe                Loại xe             Dung tích           Trị giá           Thuế phải nộp");
		System.out.println("=======================================================================================================");
		for (Vehicle vh : vehicles) {
			System.out.println(vh.toString());
		}
	}
}
