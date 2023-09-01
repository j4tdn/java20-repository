package view.test1;

public class Ex03StringReversion {

	public static void main(String[] args) {
		String text = "Welcome to JAVA10 class";
		
		System.out.println("result --> " + reverse(text));
	}
	
	private static String reverse(String text) {
		// loại bỏ các khoảng trắng thừa
		text = text.strip().replaceAll("\\s+", " ");
		
		// đảo từng từ trong chuỗi
		
		StringBuilder result = new StringBuilder();
		for (String word: text.split("\\s+")) {
			result.append(new StringBuilder(word).reverse()).append(" ");	
		}
		return result.toString().strip();
	}
	
	private static String reverseV2(String text) {
		// loại bỏ các khoảng trắng thừa
		text = text.strip().replaceAll("\\s+", " ");
		
		// đảo từng từ trong chuỗi
		String[] words = text.split(" ");
		String[] result = new String[words.length];
		int k = 0;
		
		for (String word: text.split("\\s+")) {
			result[k++] = new StringBuilder(word).reverse().toString();
		}
		return String.join(" ", result);
	}
}
