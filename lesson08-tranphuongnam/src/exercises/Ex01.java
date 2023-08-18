package exercises;

public class Ex01 {
	public static void main(String[] args) {
		String s = "hello, welcome to Java world";
		printSingleCharacter(s);
		printSingleWord(s);
		String temp = reverseStringOnCharacter(s);
		String word = reverseStringOnWord(s);
		System.out.println("Reverse character of S --> " + temp);
		System.out.println("Reverse string    of S --> " + word);
		
	}
	
	private static void printSingleCharacter(String s) {
		s = s.trim();
		for(char c : s.toCharArray()) {
			System.out.println(c);
		}
	}

	private static void printSingleWord(String s) {
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		String[] tokens = s.split(" ");
		for(String string : tokens) {
			System.out.println(string);
		}
	}
	
	private static String reverseStringOnCharacter(String s) {
		String result = "";
		for(char c : s.toCharArray()) {
			result = c + result;
		}
		return result;
	}
	
	private static String reverseStringOnWord(String s) {
		String result = "";
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		String[] tokens = s.split(" ");
		for(String string : tokens) {
			result = string + " " + result ;
		}
		return result;
	}
}
