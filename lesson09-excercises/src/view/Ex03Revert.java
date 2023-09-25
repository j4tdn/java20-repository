package view;

public class Ex03Revert {
	public static void main(String[] args) {
		String text = " Welcome to JAVA10 class ";
		
		System.out.println("result: " + reverst(text));
	}
	private static String reverst(String text) {
		//loai bo khoang trang
		text = text.strip().replaceAll("\\s+", " ");
		
		//dao tung tu trong chuoi
		StringBuilder result = new StringBuilder();
		for(String word: text.split("\\s")) {
			result.append(new StringBuilder(word).reverse().append(" "));	
		}
		return result.toString();
	}
}
