package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {
	public static void main(String[] args) {
		
		//Biến mảng luôn là kiểu đổi tượng (dù khai báo mảng bằng kiểu dữ liệu nguyên thủy thì mảng vẫn được 
		// xem như 1 đối tượng và kế thừa từ lớp Object
		//Ví dụ: Có thể sử dụng các phương thức và thuộc tính của lớp Arrays và lớp Object để thao tác với mảng
		// 	 int length =numbers.lenght;
		// 	 letters.getClass().getName()
		int[] numbers =new int[3]; ///--> [0,0,0]
		char[] letters = {'a','b','c'};
		modify(letters);
		for(char i: letters)
		{
			System.out.println(i);
		}
		System.out.println("number --> "+Arrays.toString(numbers)+"-->"+numbers.getClass().getName());
		System.out.println("letters --> "+Arrays.toString(letters)+"-->"+letters.getClass().getName());
		
		//letters.getClass().getName() --> Lấy tên của lớp chứa mảng
		
		//Kiểu đối tượng
		
		Integer[] ids = new Integer[5]; //-->[null,null,null,null,null]
		String[] words = {"text", "hello","welcome"};
		
		System.out.println("ids -->"+Arrays.toString(ids)+ "-->"+ids.getClass().getName());
		System.out.println("words --> "+Arrays.toString(words)+"-->"+words.getClass().getName());
		
		}
	private static void modify(char[] letter)
	{
		letter[1] ='z';
	}
}
