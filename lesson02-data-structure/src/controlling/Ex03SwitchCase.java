package controlling;

import java.util.Random;

import io.Ex02Random;

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
		int[] errorCodes = {500, 400, 404, 200, 999, 888};
		
		Random ran = new Random();
		int pos = ran.nextInt(errorCodes.length);
		int element = errorCodes[pos];
		String errorDesc = "";

		System.out.println("\n========if else=========\n");
	
		if(element == 500)
			errorDesc = "internal error";
		else if(element == 400)
			errorDesc = "bad request";
		else if(element == 404)
			errorDesc = "not found";
		else if(element == 200)
			errorDesc = "success";
		else
			errorDesc = "unknown";
		
		
		System.out.println("element: " + element);
		
		System.out.println("\n========switch case=========\n");
		
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
		System.out.println("error description 2: " + errorDesc);		
		// switch case non-break
		// switch case break
		
		System.out.println("\n========= switch case non break =========\n");
		int month = ran.nextInt(1,13); // [1-12]
		int daysInMonth = -1;
		switch (month) {
		case 1, 3, 5, 7, 8, 10 , 12:
			daysInMonth = 31;
			break;
		case 4, 6, 9, 11:
			daysInMonth = 30;
			// This is pretty new isn't it
			break;
		case 2:
			daysInMonth = 28;
			break;
		}
	}
}
