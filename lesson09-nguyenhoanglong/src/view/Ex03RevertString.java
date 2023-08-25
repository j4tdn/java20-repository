package view;

public class Ex03RevertString {
	public static void main(String[] args) {
		String input = "Welcome       to JAVA10  class";
		System.out.print(revert(input));
	}

	private static String revert(String input) {
		String result = " ";
		input = input.replaceAll("[\\s]+", " ");
		String[] string = input.split(" ");
		for (int i = 0; i < string.length; i++) {
			StringBuffer reverseWord = new StringBuffer(string[i]);
			result = result + reverseWord.reverse().toString() + " ";
		}
		return result;
	}
}
