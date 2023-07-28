package view;



import java.util.Scanner;

public class SOLUTIONOFTOPEquation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a;
		while(true){
			try {
				System.out.println("Nhập số a : ");
				a = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("a ---> " + e.getMessage());
				System.out.println(" Mời nhập lại  a");
			}
		}
		int b;
		while(true){
			try {
				System.out.println("Nhập số  b : ");
				b = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("b ---> " + e.getMessage());
				System.out.println("Mời nhập lại b");
			}
		}
		if(b==0&a!=0) {
			System.out.println("Phương trình vô nghiệm");
		}
		else if(b==0&a==0) {
			System.out.println("Phương trình vô số nghiệm");
		}
		float c=a;
		float d=b;
		float x=-c/d;
		System.out.println("x = " + x);
	}
}