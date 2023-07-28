package view;

public class WriteMethod {
    public static String readNumber(int n) {
        String[] ones = {
            "", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười",
            "Mười một", "Mười hai", "Mười ba", "Mười bốn", "Mười năm", "Mười sáu", "Mười bảy", "Mười tám", "Mười chín"
        };
        String[] tens = {
            "", "", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"
        };

        if (n < 0 || n > 999) {
            return "Số n không hợp lệ";
        }

        if (n == 0) {
            return "Không";
        }

        int hundredPart = n / 100;
        int tenPart = (n % 100) / 10;
        int onePart = n % 10;

        StringBuilder result = new StringBuilder();

        if (hundredPart > 0) {
            result.append(ones[hundredPart]).append(" trăm");
        }

        if (tenPart > 0) {
            if (hundredPart > 0) {
                result.append(" ");
            }
            if (tenPart == 1) {
                result.append(ones[10 + onePart]);
            } else {
                result.append(tens[tenPart]);
                if (onePart > 0) {
                    result.append(" ").append(ones[onePart]);
                }
            }
        } else if (onePart > 0) {
            if (hundredPart > 0) {
                result.append(" ");
            }
            result.append(ones[onePart]);
        }

        if (n % 10 == 1 || n % 10 == 5) {
            if (result.length() > 0) {
                result.append(" || lẻ một");
            } else {
                result.append("Lẻ một");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] numbers = { 6, 5, 25, 101, 321, 820, 219 };
        for (int n : numbers) {
            System.out.println("n = " + n + " => " + readNumber(n));
        }
    }
}

