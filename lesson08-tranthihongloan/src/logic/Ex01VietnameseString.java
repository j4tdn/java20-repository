package logic;

public class Ex01VietnameseString {
	public static void main(String[] args) {
		String str = "356 Nguyễn Hữu Thọ";

		if (checkStringVn(str)) {
			System.out.println("Chuỗi hợp lệ!");
		} else {
			System.out.println("Chuỗi không hợp lệ!");
		}

		System.out.println("\n1. In ra mỗi kí tự trên một dòng: ");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println("\n2. In ra mỗi từ trên mỗi dòng: ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				System.out.println();
			} else {
				System.out.print(str.charAt(i));
			}
		}

		System.out.println("\n\n3. In ra chuỗi đảo ngược theo kí tự: ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println("\n\n4. In ra chuỗi đảo ngược theo từ: ");
		String newStr = "", emptyStr = "";
		for (int i = str.length() - 1; i > -2; i--) {
			if (i == -1 || str.charAt(i) == ' ') {
				if (i == -1) {
					newStr = newStr + emptyStr;
				} else {
					newStr = newStr + emptyStr + " ";
				}
				emptyStr = "";
			} else {
				emptyStr = str.charAt(i) + emptyStr;
			}
		}
		System.out.println(newStr);
	}

	public static boolean checkStringVn(String str) {
		String upperStr = str.toUpperCase();
		String strVietnamese = "0123456789AÁÀẠẢÃĂẮẰẶẲẴÂẤẦẬẨẪBCDĐEÉÈẸẺẼÊẾỀỆỂỄGHIÍÌỊỈĨKLMNOÓÒỌỎÕÔỐỒỘỔỖƠỚỜỢỞỠPQRSTUÚÙỤỦŨƯỨỪỰỬỮVXYÝỲỴỶỸ ";
		for (int i = 0; i < upperStr.length(); i++) {
			char c = upperStr.charAt(i);
			if (strVietnamese.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}
}
