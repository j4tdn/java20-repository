package bai3;

public class Ex03DemoMain {
	public static void main(String[] args) {
		String s1 = "12abu02muzk586cyx";
		String s2 = "Uyk892nn1234uxo2";
		System.out.println("Max in string --> " + getMaxValidNumber(s1));
		System.out.println("Max in string --> " + getMaxValidNumber(s2));
	}

	public static int getMaxValidNumber(String s) {
		String numberInString = ""; // Khởi tạo 1 chuỗi số rỗng để đi tìm số nguyên trong chuỗi gốc
		int numCurrent = -100;
		int max = -100;
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
//			Nếu là số cộng vào chuỗi số cho đến khi khác số
			if (Character.isDigit(c)) {
				numberInString += c;
// 			Nếu khác số và chuỗi số đang chứa số
			} else {
				// Nếu mà chuỗi số đang rỗng thì không thể chuyển sang số nguyên
				if (numberInString != "") {
					// Nếu có chuyển sang số nguyên và so sánh với số nguyên ở chuỗi số tìm ra trước đó
					numCurrent = Integer.parseInt(numberInString);
					if (numCurrent > max) {
						max = numCurrent;
					}
					// Reset lại chuỗi số
					numberInString = "";
				}
			}
		}
		return numCurrent;
	}
}
