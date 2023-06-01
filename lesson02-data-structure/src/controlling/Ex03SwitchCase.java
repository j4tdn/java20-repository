package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		Random rd = new Random();
		int month = 1 + rd.nextInt(12);
		switch (month) {
		case 1: {
			System.out.println("Tháng " + month + " có 31 ngày ");
			break;
		}
		case 2: {
			System.out.println("Tháng " + month + " có 29 ngày "); break;
		}
		case 3: {
			System.out.println("Tháng " + month + " có 31 ngày "); break;
		}
		case 4: { 
			System.out.println("Tháng " + month + " có 3 ngày "); break;
		}
		case 5: {
			System.out.println("Tháng " + month + " có 31 ngày "); break;
		} 
		case 6: {
			System.out.println("Tháng " + month + " có 30 ngày "); break;
		}
		case 7: {
			System.out.println("Tháng " + month + " có 31 ngày "); break;
		}
		case 8: {
			System.out.println("Tháng " + month + " có 31 ngày "); break;
		}
		case 9: {
			System.out.println("Tháng " + month + " có 30 ngày "); break;
		}
		case 10: {
			System.out.println("Tháng " + month + " có 31 ngày "); break;
		}
		case 11: {
			System.out.println("Tháng " + month + " có 30 ngày "); break;
		}
		case 12: {
			System.out.println("Tháng " + month + " có 31 ngày "); break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + month); 
		}

		System.out.println("Finish...");

	}
}
