package controlling;

import java.util.Random;

public class SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int month = new Random().nextInt(1, 13);
		System.out.print("Tháng " + month + " có ");
		switch (month) {
		case 1, 3, 5, 7, 10, 12:
			System.out.println("31 ngày");
			break;
		case 4, 6, 9, 11:
			System.out.println("30 ngày");
			break;
		case 2:
			System.out.println("28 ngày");
		}
		System.out.println("Finish");
	}
}
