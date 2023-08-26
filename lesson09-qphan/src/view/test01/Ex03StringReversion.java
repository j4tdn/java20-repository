package view.test01;

public class Ex03StringReversion {
	
	// Loại bỏ khoảng trắng thừa và đảo chuỗi
	
	public static void main(String[] args) {
	
		String text = "  Welcome    to   JAVA10 class  ";
		
		System.out.println("result --> " + reverse(text));
		
	}
	
	private static String reverse(String text) {
		// Loại bỏ khoảng trắng thừa
		text = text.strip().replaceAll("\\s+", " ");
		
		// Đảo từng từ trong chuỗi
		String[] words = text.split("\\s");
		
		String[] result = new String[words.length];
		int k = 0;

		for(String word: words) {
			result[k++] = new StringBuilder(word).reverse().toString();
		}
		
		return String.join("-", result);
	}
}
