package view.d2;

import java.util.Arrays;

public class Ex03LargestValidNumber {
	public static void main(String[] args) {
		// 12abu02muzk586cyx
		
		// split(regex) --> regex pattern --> regular expression
		// bộ cụ pháp cho xử lý, matching chuỗi
		
		String text = "a-b-c";
		System.out.println("text splitted 1 --> " + Arrays.toString(text.split("-"))); 
		
		text = "a--b--c";
		System.out.println("text splitted 2 --> " + Arrays.toString(text.split("-{2}")));
		
		text = "a-b--c";
		System.out.println("text splitted 3 --> " + Arrays.toString(text.split("-{1,2}")));
		
		text = "a-b--c------d";
		// System.out.println("text splitted 4 --> " + Arrays.toString(text.split("-{1,}")));
		System.out.println("text splitted 4 --> " + Arrays.toString(text.split("-+")));
		
		text = "a+b++c++++++d";
		// System.out.println("text splitted 4 --> " + Arrays.toString(text.split("-{1,}")));
		System.out.println("text splitted 5 --> " + Arrays.toString(text.split("\\++")));
		
		System.out.println("==================");
		
		// [pattern] --> vd [abc]
		// split --> a
		//       --> b
		//           c
		//           ab ac ba bc ca cb
		//           abc acb bac bca cab cba
		
		text = "a@b-c@-e";
		System.out.println("text splitted 6 --> " + Arrays.toString(text.split("[@-]")));
		
		text = "a@@b--c@-e---@f@@--@@h";
		System.out.println("text splitted 7 --> " + Arrays.toString(text.split("[@-]+")));
		
		System.out.println("==================");
		
		text = "a12abu02muzk586cyx";
		System.out.println("expected number --> " + Arrays.toString(text.split("[a-z]+")));
		
		System.out.println("expected text --> " + Arrays.toString(text.split("[0-9]+")));
		
	}
}
