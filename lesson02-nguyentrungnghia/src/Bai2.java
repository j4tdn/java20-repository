import java.util.Scanner;

public class Bai2 {
	private static boolean powOf2(int a) {
		if (a == 1)
			return false;
		while (a > 1) {
			if (a % 2 != 0)
				return false;
			a /= 2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String numberAsText;
		do {
			System.out.print("Nhập số nguyên dương: ");
			numberAsText = sc.nextLine();
			if (numberAsText.matches("\\d+")) {
				int number = Integer.parseInt(numberAsText);
				if (number <= 0)
					count++;
				else {
					System.out.println("Số vừa nhập là luỹ thừa của 2: " + powOf2(number));
					break;
				}
			} else
				count++;
		} while (count < 6);
		
		if (count == 6)
			System.out.println("Bạn đã nhập sai quá 5 lần!");
	}
}
