package bai1;

public class Ex01DemoMain {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}

	public static boolean isPowerOf(int number, int anotherNumber) {
		// Nếu là 1 thì số kia phải là 1 vì 1 mũ bao nhiêu cũng = 1
		if (number == 1 || anotherNumber == 1)
			return number == 1 || anotherNumber == 1;

		int result = 1;

		// lấy số nhỏ hơn tự nhân với chính nó đến khi nào >= số lớn
		// Nếu = -> là lũy thừa, còn khác thì không phải
		if (number > anotherNumber) {
			while (result < number) {
				result *= anotherNumber;
			}
			return result == number;
		} else {
			while (result < anotherNumber) {
				result *= number;
			}
			return result == anotherNumber;
		}
	}
}
