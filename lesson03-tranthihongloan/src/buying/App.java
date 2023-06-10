package buying;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập bao nhiêu xe? ");
		int N = sc.nextInt();
		Vehical[] vhs = new Vehical[N];
		
		Function.enterInfoCar(vhs, N);
		Function.printTable(vhs, N);
		
		sc.close();
		
		System.exit(0);
	}
}
