package controlling;

import java.util.Random;

/**
 * 
 * dựa vào thông tin lỗi để in ra mô tả của nó
 * 
 * 500: internal eroro
 * 404P bad reqjest
 * #unknown
 */
public class Ex03SwitchCase {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] errorCodes = {500, 400, 404, 200,999, 888 };
		int pos = rd.nextInt(errorCodes.length);
		int element = errorCodes[pos];
		
		System.out.println("element:" + element);
		
		System.out.println("\n===========\n");
		String errorDesc = "";
		if(element == 500) {
			errorDesc = " internal error";
		}else if(element == 400) {
			errorDesc = "bar request";
		}else if(element == 404) {
			errorDesc = "Not Fault";
		}else if(element == 200) {
			errorDesc = "succes";
			}
		else {
			errorDesc = "unknown";
			
		}
		System.out.println("Error Disciption: " + errorDesc);
		
		int month = rd.nextInt(1, 13);
		int daysInMonth = -1;
		switch (month) {
		case 1,3,5,7,8,10,12:
			daysInMonth = 31;
		case 4,6,9,11:
			daysInMonth = 30;
		
		case 2 :
			daysInMonth = 28;
		}
		System.out.println("day in month :" + daysInMonth);
	}
	
}
