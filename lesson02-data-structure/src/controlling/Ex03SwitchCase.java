package controlling;

import java.util.Random;

/*/
 * Dua vao thong tin loi de in ra mo ta cua no
 * 500: internal error
 * 400: bad request
 * 404: not found
 * 200: success
 * #: unknow
 */

public class Ex03SwitchCase {
	public static void main(String[] args) {
		// length =6;
		// index = [0,6)
		Random rd = new Random();
		int[] errorCodes = { 500 ,400 , 404 ,200, 999 ,888};
		int pos = rd.nextInt(errorCodes.length);
		int element = errorCodes[pos];
		System.out.println("element :"+ element);
		System.out.println("\n====================\n");
		String errorDesc= " ";
		if(element ==500 ) {
			errorDesc = "internal error";
		}else if(element ==400 ) {
			errorDesc = "internal error";
		}else if(element ==404 ) {
			errorDesc = "internal error";
		}else if(element ==200 ) {
			errorDesc = "internal error";
		}else {
			errorDesc = "Unknown";
}
		System.out.println("Error description: "+ errorDesc);
		System.out.println("\n====================\n");
}
}