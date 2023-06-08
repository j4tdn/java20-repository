package view;

import bean.Vehicle;

public class Ex02VehicleTax {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000d);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000d);
		Vehicle v3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000d);
		Vehicle[] v = {v1, v2, v3};

		System.out.printf("%-25s %-15s %10s %20s %25s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải trả");
		System.out.printf("===================================================================================================\n");
		
		for (Vehicle ve: v) {
			ve.setTaxPayable(Vehicle.getTaxPayable(ve));
			System.out.println(ve);
		}
	}
}	
