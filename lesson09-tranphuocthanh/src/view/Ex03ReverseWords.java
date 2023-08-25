package view;

public class Ex03ReverseWords {

	public static void main(String[] args) {
		String text = "Welcome to JAVA10 class";
		
		System.out.println(revert(text));
	}
	
	private static String revert(String text) {
		String result = "";
		String[] words = text.split("\\s+");
		
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >=0; j--) {
				result += words[i].charAt(j);
			}
			result += " ";
		}
		return result;
	}
	
	
}
