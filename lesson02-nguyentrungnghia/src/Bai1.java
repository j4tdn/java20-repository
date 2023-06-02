import java.util.Scanner;

public class Bai1 {
	private static boolean multipleOf2(int x) {
		if (x % 2 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText;
		int count = 0;
		do {
			System.out.print("Nhập số nguyên dương: ");
			numberAsText = sc.nextLine();
			if (numberAsText.matches("\\d+")) {
				int number = Integer.parseInt(numberAsText);
				if (number <= 0)
					count++;
				else {
					System.out.println("Số vừa nhập là bội của 2: " + multipleOf2(number));
					break;
				}
			} else
				count++;
		} while (count < 6);
		
		if (count == 6)
			System.out.println("Bạn đã nhập sai quá 5 lần!");
	}
}
