package view;

public class Ex04ReadNumber {
	public static void main(String[] args) {
		
		int a = 110;
		  System.out.println(a + " đọc là: " + ReadNumber(a));
	}
	
	private static String[] one ={
		
				 "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"
		};
	private static String[] tens = {
			 "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi",
		        "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"
	};
	private static String[] hundreds = {
			 "", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm",
		        "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"
	};
	private static String ReadNumber(int number) {
		if (number == 0) {
            return "không";
        }

        String result = "";

        int hundredsDigit = number / 100;
        int remainder = number % 100;
        int tensDigit = remainder / 10;
        int onesDigit = remainder % 10;

        if (hundredsDigit > 0) {
            result += hundreds[hundredsDigit] + " ";
        }

        if (tensDigit > 0) {
            if (tensDigit == 1) {
                result += "mười";
            } else {
                result += tens[tensDigit] + " ";
            }
        }

        if (tensDigit != 1 && onesDigit > 0) {
            result += one[onesDigit];
        }

        return result.trim();
	}
}
