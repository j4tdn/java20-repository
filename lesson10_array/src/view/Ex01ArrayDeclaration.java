package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {
		
		//Biến mảng luôn là kiểu đối tượng
		//Khai báo từng phần tử là
		
		//Nguyên thủy
		int[] numbers = new int[3]; //{0,0,0} --> lenght = 3 
		char[] letters = {'a','b','c'};
		
		System.out.println("number -->" + Arrays.toString(numbers) + "--->" + numbers.getClass().getName());
		
		
		//Đối tượng
		
		Integer [] ids = new Integer[5];
		String [] words = {"text","hello","welcome"};
		
		System.out.println("Words--> "+ Arrays.toString(words));
	}
	
}
