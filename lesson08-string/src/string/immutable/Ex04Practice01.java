package string.immutable;

public class Ex04Practice01 {
	public static void main(String[] args) {
		String s = "  welcome   to string  lesson";
		String s1 = "12.08.2023";
		
		System.out.println("Tinh chieu dai cua chuoi s -->  " + s.length());
	
		System.out.println("\nNối chuỗi s1 vào chuỗi s --> " + s.concat(" ").concat(s1));
		System.out.println("Nối chuỗi s1 vào chuỗi s --> " + s + " " + s1);
		System.out.println("Nối chuỗi s1 vào chuỗi s --> " + String.join(" ", s, s1));
		
		System.out.println("\nLấy một ký tự tại vị trí index(3) trong chuỗi s --> " + s.charAt(3));
		
		System.out.println("\nDuyệt từng kí tự trong chuỗi");
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for(char letter : s.toCharArray()) {
			System.out.print(letter);
		}
		
		System.out.println("\n\nDuyệt từng từ trong chuỗi, các từ cách nhau bừng 1 hoặc nhiều khoảng trắng");
		//Cắt khoảng trắng thừa 2 đầu
		s = s.trim().replaceAll("\\s+", " ");
		System.out.println("s preceed --> " + s);
		
		String word = "";
		int start = 0;
		for(int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if(letter == ' ') {
				word = s.substring(start, i);
				System.out.print(word + " ");
				start = i + 1;
			}else if(i == s.length() - 1){
				word = s.substring(start, s.length());
				System.out.print(word);
			}
		}
		
		//String split
		String[] tokens= s.trim().split("\\s++");
		System.out.println("tokens --> " + String.join("-", tokens));
		
		System.out.println("\n Tìm vị trí(chỉ số) xuất hiện đầu tiên, của kí tự 'e' trong chuỗi s --> " + s.indexOf('e'));
		System.out.println("\n Tìm vị trí(chỉ số) xuất hiện cuối cùng, của kí tự 'e' trong chuỗi s --> " + s.lastIndexOf('e'));
		
		String bookName = "SGK-123-abc";
		System.out.println("Kiểm tra chuỗi có bắt đầu bằng .. ? --> " + bookName.startsWith("STK"));
		System.out.println("Kiểm tra chuỗi có bắt đầu bằng .. ? --> " + bookName.startsWith("SGK"));
		System.out.println("Kiểm tra chuỗi có kết thúc bằng .. ? --> " + bookName.startsWith("123"));
		System.out.println("Kiểm tra sự tồn tại --> " + bookName.contains("123"));
	}
	
}
