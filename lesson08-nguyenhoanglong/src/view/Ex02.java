package view;

public class Ex02 {
	private static String capitalLetters(String str) {
		String words[] = str.split("\\s+");
		String capitalLetters = "";
		for (String w : words) {
			
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalLetters += first.toUpperCase() + afterfirst + " ";
		}
		return capitalLetters.trim();
	}

	public static void main(String[] args) {
		String s1 = "aDam Le   vAN john Son";
		
		System.out.println(capitalLetters(s1.toLowerCase()));
	}

}