package view;

import utils.StringUtils;
/*
 * 	Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
	Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
	Example: input: Welcome to JAVA10 class
	output: emocleW ot 01AVAJ ssalc
	Method signature: revert(String s) >> String
 */
public class Ex03RevertString {
	public static void main(String[] args) {
		String s = "   Welcome   to JAVA10   class";
		System.out.println("s --> " + s);
		
		System.out.println("Loại bỏ khoảng trắng thừa");
		String s1 = StringUtils.removeExtraSpaces(s);
		System.out.println("removeExtraSpaces(s) --> " + s1);
		
		System.out.println("Đảo ngược chuỗi");
		System.out.println("revert(s1) --> " + StringUtils.revert(s1));
	}
}
