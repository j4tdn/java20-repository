package view;

public class Ex04ReadNumber {
	public static void main(String[] args) {

		int[] numbers = { 6, 5, 25, 101, 321, 820, 219 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " => " + readNumber(numbers[i]));
		}

	}

	private static String readNumber(int n) {
		if (n < 0 || n > 999) {
			throw new IllegalArgumentException("Invalid!");
		}
		String[] ones = { "", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };
		String[] tens = { "", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi",
				"Chín mươi" };
		String[] hundreds = { "", "Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm",
				"Tám trăm", "Chín trăm" };

		String result = "";
		int[] digits = { 0, 0, 0 };
		int i = 0;
		while (n > 0) {
			digits[i++] = n % 10;
			n = n / 10;
		}
		int numberDigits = i;
		switch (numberDigits) {
		case 1:
			result = ones[digits[0]];
			break;

		case 2:
			if (digits[0] == 0) {
				result = tens[digits[1]];
			} else if (digits[1] == 1) {
				result = "Mười " + (ones[digits[1]]).toLowerCase();
			} else {
				result = tens[digits[0]] + " " + (ones[digits[1]]).toLowerCase();
			}
			break;
		case 3:
			if (digits[0] == 0 && digits[1] == 0) {
				result = hundreds[digits[2]];
				break;
			} else if (digits[1] == 0) {
				result = hundreds[digits[2]] + " linh " + (ones[digits[0]]).toLowerCase();
			} else if (digits[1] == 1) {
				result = hundreds[digits[2]] + " mười " + (ones[digits[0]]).toLowerCase();
			} else if (digits[0] == 0) {
				result = hundreds[digits[2]] + " " + (tens[digits[1]]).toLowerCase();
			} else {
				result = hundreds[digits[2]] + " " + (tens[digits[1]]).toLowerCase() + " "
						+ (ones[digits[0]]).toLowerCase();
			}
		}
		return result;
	}
}
