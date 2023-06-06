package controlling;

import java.util.Random;

/*
 * Dựa vào thông tin lỗi để in ra mô tả của nó
 * 500: internal error
 * 400: bad request
 * 404: not found
 * 200: success
 * #: unknown
 */
public class Ex03SwitchCase {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] errorCodes = {500,400,404, 200, 999, 888};
		
		int pos = rd.nextInt(errorCodes.length);
		int element = errorCodes[pos];
		
		System.out.println("element: " + element);
		System.out.println("\n==========if else=========\n");
		
		String errorDesc = "";
		if (element == 500) {
			errorDesc = "internal error";
		} else if (element == 400 ) {
			errorDesc = "bad request";
		} else if (element == 404) {
			errorDesc = "not found";
		} else if (element == 200) {
			errorDesc = "success";
		} else {
			errorDesc = "unknown";
		}
		System.out.println("error description: " + errorDesc);
		System.out.println("\n==========switch case=========\n");
		errorDesc ="";
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
				errorDesc = "unknown";
				break;
		}
		System.out.println("error description: " + errorDesc);
		
		System.out.println("\n==========\n");
		int month = rd.nextInt(1,13);
		int dayInMonth =  -1;
		System.out.println("month: " + month);
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			dayInMonth= 31;
			break;
		case 4, 6, 9, 11:
			dayInMonth = 30;
			break;
		case 2:
			dayInMonth = 28;
			break;
		}
		System.out.println("days in month: " +dayInMonth);
	}

}
