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
		// length = 6;
		// index = [0, 6)
		Random rd = new Random();

		int[] errorCodes = { 500, 400, 404, 200, 999, 888 };

		int pos = rd.nextInt(errorCodes.length);
		int element = errorCodes[pos];

		System.out.println("element: " + element);

		System.out.println("\n======== if else ======\n");

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
			errorDesc = "unknown";
		}
		System.out.println("error description 1: " + errorDesc);

		System.out.println("\n======== switch case ======\n");

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
		// switch case beak
		
		System.out.println("\n======== switch case non break ======\n");
		int month = rd.nextInt(1, 13); // [1,12]
		int daysInMonth = -1;
		
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
		// JDK, JRE --> yêu cầu = version nhau
		// JDK(compiler 11): trình biên dịch cho Eclipse hỗ trợ đến JAVA 11
		// JRE(runtime 11): trình thực thi chạy ra bytecode, show ra màn hình đến

		// VD: compiler hỗ trợ thư viện code đến JAVA17
		// nhưng khi chạy xuống máy chỉ hỗ trợ đến 15 --> ko hiểu của 17
		// đôi lúc Eclipse hỗ trợ virtual JDK 17 để chạy được
		
	}
}
