package exercises;
 
public class Ex04Demo {
    // Mảng chứa các chữ số viết tương ứng từ 0 đến 9
    private static final String[] ones = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};

    // Mảng chứa các chữ số hàng chục viết tương ứng từ 10 đến 90 (cách 10)
    private static final String[] tens = {"", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"};

    // Mảng chứa các chữ số hàng trăm
    private static final String[] hundreds = {"", "Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm", "Tám trăm", "Chín trăm"};

    // Mảng chứa các tên của các bậc số (hàng nghìn, hàng triệu, ...)
    private static final String[] largeScales = {"", " nghìn", " triệu", " tỷ"};

    // Phương thức chính
    public static String readNumber(long n) {
        if (n < 0) {
            return "Số không hợp lệ";
        }

        if (n == 0) {
            return "Không";
        }

        String result = "";
        int scale = 0; // Biến để theo dõi bậc số (hàng nghìn, hàng triệu, ...)

        while (n > 0) {
            // Lấy ba chữ số cuối cùng
            int threeDigits =(int) (n % 1000);
            if (threeDigits != 0) {
                // Xử lý ba chữ số cuối cùng và nối vào chuỗi kết quả
                result = convertThreeDigitsToWords(threeDigits) + largeScales[scale] + " " + result;
            }

            // Tiếp tục với ba chữ số tiếp theo (nếu có)
            n /= 1000;
            if(scale < 4) {
            	scale++;
            	if(scale == 4) {
            		scale = 1;
            	}
            }
        }

        return result.trim();
    }

    // Hàm chuyển ba chữ số thành chữ viết
    private static String convertThreeDigitsToWords(int n) {
        String result = "";
        System.out.println("THREE DIGITS: " + n);
        // Xử lý số hàng trăm 
        int hundredsDigit = n / 100;
        result += (hundredsDigit > 0) ? hundreds[hundredsDigit] + " " : "";

        // Xử lý số hàng chục và hàng đơn vị
        int remaining = n % 100;
        if (remaining != 0) {
            if (remaining < 10 && n > 10) {
                result += "lẻ " + ones[remaining];
            } else if (remaining < 20 && n > 10) {
                result += "mười " + ones[remaining % 10];
            } else {
                int onesDigit = remaining % 10;
                int tensDigit = remaining / 10;
                result += tens[tensDigit] + " " + ones[onesDigit];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 5;
        int n3 = 25;
        int n4 = 101;
        int n5 = 321;
        int n6 = 820;
        int n7 = 219;
        int n8 = 123456;
        int n9 = 1056045233;
        long n10 = 1100101101123124723l; //10.100.101.101.123.124.723
        System.out.println(n10);
        System.out.println(n1 + " => " + readNumber(n1));
        System.out.println(n2 + " => " + readNumber(n2));
        System.out.println(n3 + " => " + readNumber(n3));
        System.out.println(n4 + " => " + readNumber(n4));
        System.out.println(n5 + " => " + readNumber(n5));
        System.out.println(n6 + " => " + readNumber(n6));
        System.out.println(n7 + " => " + readNumber(n7));
        System.out.println(n8 + " => " + readNumber(n8));
        System.out.println(n9 + " => " + readNumber(n9));
        System.out.println(n10 + " => " + readNumber(n10));
    }
}