package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {

		// Biến mảng luôn là kiểu đối tượng

		// Nguyên thuỷ
		int[] numbers = new int[3]; // { 0, 0, 0 }
		char[] letters = { 'a', 'b', 'c' };
		
		modify(letters);

		System.out.println("numbers --> " + Arrays.toString(numbers) + " ---> " + numbers.getClass().getName());
		System.out.println("letters --> " + Arrays.toString(letters) + " ---> " + letters.getClass().getName());

		System.out.println();

		// Đối tượng
		Integer[] ids = new Integer[5]; // { null, null, null, null, null }
		String[] words = { "text", "hello", "welcome" };
		
		System.out.println("ids --> " + Arrays.toString(ids) + " ---> " + ids.getClass().getName());
		System.out.println("words --> " + Arrays.toString(words) + " ---> " + words.getClass().getName());

	}
	
	private static void modify(char[] letters) {
		letters[1] = 'z';
	}

}
