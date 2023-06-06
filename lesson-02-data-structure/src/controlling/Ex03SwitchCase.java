package controlling;

import java.util.Random;

public class Ex03SwitchCase {

	public static void main(String[] args) {
		Random rd = new Random();

		int[] errorCodes = { 500, 400, 404, 200, 999, 888 };
		int pos = rd.nextInt(errorCodes.length);
		int element = errorCodes[pos];

		System.out.println("element: " + element);

		System.out.println("====================");
		String errorDesc = "";

		if (element == 500) {
			errorDesc = "internal error";
		} else if (element == 400) {
			errorDesc = "bad request";
		} else if (element == 404) {
			errorDesc = "not found";
		} else if (element == 200) {
			errorDesc = "success";
		} else {
			errorDesc = "uknown";
		}
		System.out.println("error description: " + errorDesc);

		System.out.println("==============");

		switch (element) {
		case 500:
			errorDesc = "internal error";
			break;
		case 400:
			errorDesc = "bad request";
			break;
		case 404:
			errorDesc = "not found";
			break;
		case 200:
			errorDesc = "success";
			break;

		default:
			errorDesc = "uknown";
			break;
		}

		System.out.println("\n ============== switch case non break ============\n");
		int month = rd.nextInt(1, 13);
		int daysInMonth = -1;

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			daysInMonth = 31;
			break;
		case 4, 6, 9, 11:
			daysInMonth = 30;
			break;
		case 2:
			daysInMonth = 28;

		}
		System.out.println("days in month: " + daysInMonth);
	}

}
