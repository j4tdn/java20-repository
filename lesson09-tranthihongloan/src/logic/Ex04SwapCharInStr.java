package logic;

/**
	Bài 4: Tìm tất cả các hoán vị của chuỗi String
	
		Example: input: xyz
		output: xyz, xzy, yxz, yzx, zxy, zyx
 */
public class Ex04SwapCharInStr {
	public static void main(String[] args) {
		String str = "xyz";
		String reverseStr = swapCharInStr(str);
		String[] arrayStr = reverseStr.split(",");
		for (String string : arrayStr) {
			System.out.println(string);
			System.out.println(printReverseString(string));
		}

	}
	public static String swapCharInStr(String str) {
		String swapStrArr = str;
		int i = 0;
		while(i < str.length()-1) {
			char headStr = str.charAt(0);
			String footStr = str.substring(1);
			str = footStr + headStr;
			i++;
			swapStrArr = swapStrArr + "," + str;
		}
		return swapStrArr;
	}
	
	public static String printReverseString(String str) {
		String reverseStr = "";
		for (int i = str.length()-1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		return reverseStr;
	}
}
