import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		while (true) {
			try {
				System.out.print("Số lượng chữ số cần đọc: ");
				n = Integer.parseInt(ip.nextLine());
				int[] numbers = enterNumbers(n);
				System.out.println("\n=====================\n");
				for (int i = 0; i < numbers.length; i++) { 
					System.out.print(numbers[i] + ": ");
					String numberAsString = readNumber(numbers[i]);
					System.out.println(numberAsString);
				}
				ip.close();
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private static int[] enterNumbers(int n) {
		Scanner ip = new Scanner(System.in);

		int[] numbers = new int[n];
		int count = 0;
		
		while (true) {
			try {
				System.out.print("Nhập số thứ " + (count + 1) + ": ");
				String input = ip.nextLine();
				if (isValidNumber(input)) 
					numbers[count++] = Integer.parseInt(input);
				if (count == n)
					break;
			} catch (NumberFormatException e) {
				System.out.println("Phải nhập số!!!");
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}
		
		
		ip.close();
		return numbers;
	}

	private static boolean isValidNumber(String input) {
		int number = Integer.parseInt(input);
		if (input.length() < 3 || input.length() > 3 || input.charAt(0) == '0')
			throw new RuntimeException("Số có tối đa 3 chữ số");
		return true;
	}

	private static String readNumber(int number) {
		String[] a = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };

		int hundredsDigit = number / 100;
		int tensAndOnesDigits = number % 100;
		int tensDigit = (tensAndOnesDigits / 10) % 10;
		int onesDigit = tensAndOnesDigits % 10;

		if (tensDigit == 0)
			return a[hundredsDigit] + " trăm" + (onesDigit == 0 ? "" : "linh " + a[onesDigit]);

		else if (tensDigit == 1)
			return a[hundredsDigit] + " trăm" + (onesDigit == 0 ? " mười" : " mười " + a[onesDigit]);

		else {
			if (onesDigit == 0)
				return a[hundredsDigit] + " trăm" + a[tensDigit] + " mươi";
			else if (onesDigit == 1)
				return a[hundredsDigit] + " trăm " + a[tensDigit] + " mươi mốt";
		}

		return a[hundredsDigit] + " trăm " + a[tensDigit] + " mươi " + a[onesDigit];
	}

}
