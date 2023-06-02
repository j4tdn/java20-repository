package homework;

import java.util.Scanner;

public class Ex01MultipleOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText = null;
		int error = 0;
		do {
			System.out.print("\nEnter a number: ");
			numberAsText = sc.nextLine();
			if(!numberAsText.matches("\\d+")) {
				error++;
				System.out.println("Lỗi định dạng số, vui lòng nhập lại");
			} else {
				int number = Integer.parseInt(numberAsText);
				if(isMultipleOf2(number)) {
					System.out.println(number + " là bội của 2");
				} else {
					System.out.println(number + " không phải là bội của 2");
				}
			}
		} while (!numberAsText.matches("\\d+") && error < 5);
		
		sc.close();
		System.out.println("Exit");
	}
	
	private static boolean isMultipleOf2(int n) {
		return n % 2 == 0;
	}
}
