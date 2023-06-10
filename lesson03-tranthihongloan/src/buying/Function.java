package buying;

import java.util.Scanner;

public class Function {
	private Function() {
	}

	public static void enterInfoCar(Vehical[] vhs, int N) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < N; i++) {
			System.out.println("Thông tin xe thứ " + (i + 1) + ":");
			System.out.print("- Mã xe: ");
			sc.nextLine();
			String id = sc.nextLine();
			System.out.print("- Tên chủ xe: ");
			String owner = sc.nextLine();
			System.out.print("- Loại xe: ");
			String model = sc.nextLine();
			System.out.print("- Dung tích: ");
			int capacity = sc.nextInt();
			System.out.print("- Trị giá: ");
			double cost = sc.nextDouble();
			vhs[i] = new Vehical(id, owner, model, capacity, cost);
		}
		sc.close();
	}

	public static double calculateTax(Vehical vh) {
		double result = 0;
		if (vh.getCapacity() < 100) {
			result = vh.getCost() * 0.01;
		} else if (vh.getCapacity() < 200) {
			result = vh.getCost() * 0.03;
		} else {
			result = vh.getCost() * 0.05;
		}
		return result;
	}

	public static void printTable(Vehical[] vhs, int N) {	        
		System.out.println(String.format("%-20s %-15s %-15s %-15s %-15s", 
				"Tên chủ xe", 
				"Loại xe", 
				"Dung tích", 
				"Trị giá", 
				"Thuế phải nộp")
		);	
		System.out.println("==============================="
				+ "========================================"
				+ "========================================");	
		for(int i = 0; i < N; i++) {
			System.out.println(String.format("%-20s %-15s %-15s %-15s %-15s", 
					vhs[i].getOwner(), 
					vhs[i].getModel(), 
					vhs[i].getCapacity(), 
					String.format("%.2f", vhs[i].getCost()), 
					String.format("%.2f", calculateTax(vhs[i])
			)));
		}
	}
}
