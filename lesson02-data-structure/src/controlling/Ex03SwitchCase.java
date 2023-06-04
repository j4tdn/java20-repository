package controlling;

import java.util.Random;

/*
 * Dựa vào thông tin lỗi để in ra mô tả của nó
 * 500: internal error
 * 400: bad request
 * 404: not found
 * 200: success
 * #  : unknown
 */
public class Ex03SwitchCase {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] errorCodes = { 500, 400, 404, 200, 999, 888 };

		int pos = rd.nextInt(errorCodes.length);
		int element = errorCodes[pos];
		System.out.println("element: " + element);

		System.out.println("\n**********************\n");
		String textCode = null;
		if (element == 500) {
			textCode = "internal error";
		} else if (element == 400) {
			textCode = "bad request";
		} else if (element == 404) {
			textCode = "not found";
		} else if (element == 200) {
			textCode = "success";
		} else {
			textCode = "unknown";
		}
		System.out.println("error description: " + textCode);

		textCode = "";
		switch (element) {
			case 500:
				textCode = "internal error";
				break;
			case 400:
				textCode = "bad request";
				break;
			case 404:
				textCode = "not found";
				break;
			case 200:
				textCode = "sucess";
				break;
			default:
				textCode = "unknown";
		}
		System.out.println("error description 2: " + textCode);
		
		// switch case non-break
		// switch case break
		
		System.out.println("\n====== switch case non break ======");
		int month = rd.nextInt(12) + 1; // 1-12
		int daysInMonth = -1;
		System.out.println("month: " + month);
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysInMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysInMonth = 30;
			break;
		case 2:
			daysInMonth = 28;
			break;
		}
		System.out.println("days in month: " + daysInMonth);
	}
}
