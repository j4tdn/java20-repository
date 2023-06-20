package controlling;

import java.util.Random;

/*
 * Dựa vào thông tin lỗi để in ra mô tả của nó
 * 		500: internal error
 * 		400: bad request
 * 		404: not found
 * 		200: success
 * 		#  : unknown
 */

public class Ex03SwitchCase {
	public static void main(String[] args) {
		/*
		int month = 1 + new Random().nextInt(12);
		System.out.print("Tháng " + month + " có ");
		switch (month) {
		case 1:
			System.out.println("31 ngày");
			break;
		case 2:
			System.out.println("28 ngày");
			break;
		case 3:
			System.out.println("31 ngày");
			break;
		case 4:
			System.out.println("30 ngày");
			break;
		case 5:
			System.out.println("31 ngày");
			break;
		case 6:
			System.out.println("30 ngày");
			break;
		case 7:
			System.out.println("31 ngày");
			break;
		case 8:
			System.out.println("31 ngày");
			break;
		case 9:
			System.out.println("30 ngày");
			break;
		case 10:
			System.out.println("31 ngày");
			break;
		case 11:
			System.out.println("30 ngày");
			break;
		case 12:
			System.out.println("31 ngày");
			break;
		default:
			System.out.println("Tháng không hợp lệ");
		}
		
		System.out.println("Finish ...");
		*/
		
		Random rd = new Random();
		int[] errorCodes = {500, 400, 404, 200, 999, 888};
		int pos = rd.nextInt(errorCodes.length);
		int element = errorCodes[pos];
		System.out.println("element: " + element);
		
		System.out.println("\n------------- if else --------------\n");
		
		String errorDesc = "";
		if (element == 500)
			errorDesc = "internal error";
		else if (element == 400)
			errorDesc = "bad request";
		else if (element == 404)
			errorDesc = "not found";
		else if (element == 200)
			errorDesc = "success";
		else
			errorDesc = "unknown";
		System.out.println("error description 1: " + errorDesc);
		
		System.out.println("\n------------- switch case --------------\n");
		
		errorDesc = "";
		
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
		}
		
		System.out.println("error description 2: " + errorDesc);
		
		// switch case non-break
		// switch case break
		
		System.out.println("\n------------- switch case non break --------------\n");
		
		int month = rd.nextInt(1, 13);
		int daysInMonth = -1;
		System.out.println("month: " + month);
		
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
