package string.immutable;

public class Ex04Practice01 {
	public static void main(String[] args) {
		String s = "   welcome   to   string  lesson   ";
		String s1 = "12.08.2023";

		System.out.println("tính chiều dài chuỗi s " + s.length());

		System.out.println("nối s1 vào s: " + (s + " " + s1));
		System.out.println("nối s1 vào s: " + s.concat(" ").concat(s1));
		System.out.println("nối s1 vào s: " + String.join(" ", s, s1));

		System.out.println("kí tự tại index 3: " + s.charAt(3));

		System.out.println("duyệt từng kí tự: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
		for (char letter : s.toCharArray()) {
			System.out.print(letter + " ");
		}

		System.out.println("\nduyệt từng từ: ");
		// cắt khoảng trắng thừa 2 đầu
		s = s.trim().replaceAll("\\s+", " ");
		System.out.println("s preceed: " + s);
		
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == ' ') {
				System.out.println(s.substring(start, i));
				start = i + 1;
			} else if (i == s.length() - 1) {
				System.out.println(s.substring(start, s.length()));
			}
		}
		
		String[] tokens = s.trim().split("\\s+");
		System.out.println("tokens --> " + String.join(" ", tokens));

		System.out.println("\ntìm vị trí xuất hiện đầu tiên: " + s.indexOf("e"));
		System.out.println("\ntìm vị trí xuất hiện cuối cùng: " + s.lastIndexOf("e"));
		
		
	}
}
