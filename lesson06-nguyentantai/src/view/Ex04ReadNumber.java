package view;

public class Ex04ReadNumber {
    private static final String[] ones = {
        "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"
    };

    private static final String[] hundreds = {
        "", "mốt", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"
    };

    private static final String[] tens = {
        "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"
    };

    public static String readNumber(int num) {
        if (num <= 0 || num >= 1000) {
            throw new IllegalArgumentException("Phải là số dương và tối đa 3 chữ số!");
        }

        String result = "";

        int hundred = num / 100;
        int ten = (num % 100) / 10;
        int one = num % 10;

        if (hundred > 0) {
            result += ones[hundred] + " trăm";
            if (ten == 0 && one > 0) {
                result += " linh";
            }
        }

        if (ten > 0) {
            if (ten == 1) {
                result += " mười";
            } else {
                result += " " + tens[ten];
                if (one > 0) {
                    result += " " + hundreds[one];
                }
            }
        } else {
            if (one > 0) {
                result += " " + hundreds[one];
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(readNumber(6));
        System.out.println(readNumber(5));
        System.out.println(readNumber(25));
        System.out.println(readNumber(101));
        System.out.println(readNumber(321));
        System.out.println(readNumber(820));
        System.out.println(readNumber(219));
    }
}
