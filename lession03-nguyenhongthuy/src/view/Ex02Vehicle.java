package view;

import java.util.Scanner;

import bean.Vehicle;
import bean.VehicleUtils;

public class Ex02Vehicle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong xe: ");
		int n = Integer.parseInt(sc.nextLine());
		
		Vehicle[] vehicles = new Vehicle[n];
		VehicleUtils.inputVehicles(vehicles);
		VehicleUtils.outputVehicles(vehicles);
		sc.close();
	}
}
