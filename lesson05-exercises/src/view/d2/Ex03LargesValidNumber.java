package view.d2;

import java.util.Arrays;

public class Ex03LargesValidNumber {
	public static void main(String[] args) {
		
		// split(regex) --> regex pattern --> regular expression
		// bo cu phap cho xu ly, matching chuoi
		
		String text = "a+b+c++++d";
		System.out.println("text split: " + Arrays.toString(text.split("\\++")));
		
		
		text = "a@b-c@-e";
		System.out.println("text split: " + Arrays.toString(text.split("[@-]+")));
		
		text = "12abu02muz596cya";
		System.out.println("expected: " + Arrays.toString(text.split("[a-z]+")));
	}
}
