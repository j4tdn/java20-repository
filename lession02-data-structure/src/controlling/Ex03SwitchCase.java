package controlling;

import java.util.Random;

/*
  	Dựa vào thông tin lỗi để in ra mô tả của nó
  	500: internal error
  	400: bad request
  	404: not found
  	200: success
  	#: unknown
 */
//Alt +Shift + R
public class Ex03SwitchCase {
	public static void main(String[] args) {
		// length =6;
		// index = [0,6)
		Random rd = new Random();
		int[] errorCodes = { 500, 400, 404, 200, 999, 888 };
		int pos = rd.nextInt(errorCodes.length);
		int element = errorCodes[pos];

		System.out.println("element: " + element);

		System.out.println("\n****************\n");
		String errorDesc = "";
		if (element == 500) {
			errorDesc = "internal error";
		} else if (element == 400) {
			errorDesc = "bad request";

		} else if (element == 404) {
			errorDesc = " not found";

		} else if (element == 200) {
			errorDesc = "success";

		} else {
			errorDesc = "unknown";
		}
		System.out.println("errorDesc 1: " + errorDesc);

		System.out.println("\n****************\n");
		errorDesc = "";
		// khi 1 case đúng thì các case tiếp theo sẽ k kiểm tra
		// k có break: khi đúng key thứ k thì bắt đầu từ key +1 sẽ không kiểm tra mà
		// thực thi bên trong
		switch (element) {
		case 500:
			errorDesc = "internal error";
			break;
		case 400:
			errorDesc = "bad request";
			break;
		case 404:
			errorDesc = " not found";
			break;
		case 200:
			errorDesc = "success";
			break;
		default:
			errorDesc = "unknown";

		}
		System.out.println("errorDesc 2: " + errorDesc);

		System.out.println("Switch non -break");
		int month = rd.nextInt(1, 12);
		int daysInMonth = -1;
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			daysInMonth = 31;
			break;
		case 4, 6, 9, 11:
			daysInMonth = 30;
			break;
		}
		System.out.println("days in month" + daysInMonth);

	}
	// switch case non-break
	// switch case break

}
