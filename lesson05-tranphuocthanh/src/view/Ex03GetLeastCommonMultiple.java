package view;

public class Ex03GetLeastCommonMultiple {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4 };
		System.out.println(lcm(a));
	}

	private static int lcm(int[] elements) {
		int length = elements.length;
		if (length == 0) {
			System.out.println("tối thiểu 1 phần tử");
			return Integer.MIN_VALUE;
		}
		if (length == 1) {
			return elements[0];
		}

		int result = lcm(elements[0], elements[1]);

		for (int i = 2; i < length; i++) {
			result = lcm(result, elements[i]);
		}

		return result;
	}

	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
