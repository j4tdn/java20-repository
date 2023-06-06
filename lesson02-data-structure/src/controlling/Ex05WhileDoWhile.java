package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	public static void main(String[] args) {
		//Duyệt và in các số nguyên dương < n
		
		int n = 8;
		int i = 1;
		
		//while(expression)
		//trong khi biểu thức đang true --> thực thi {}
		//biểu thức false --> thoát khỏi {}
		while(i < 8) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n\n=============\n");
		i = 1;
		while(true) {
			System.out.print(i + " ");
			i++;
			//điều kiện dừng
			if(i == 8)
				break;
		}
		System.out.println("\n=============\n");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i < 8);
		
		//while: kiểm tra điền kiện ngay lần đầu
		//--> Hầu hết sử dụng while()
		//do while: bỏ qua lần kiểm tra điều kiện lần đầu 
		
		System.out.println("\n=============\n");
		//Nhập vào 1 số nguyên hợp lệ, nếu nhập sai yêu cầu nhập lại
		//Kiểm tra số đó có phải là số nguyên tố hay không
		
		//-->performance --> BufferReader
		
		Scanner sc = new Scanner(System.in);
		//nguyên nhân: do người dùng nhập sai
		//yêu cầu: nhập vào tất cả các ký tự là số
		//cách xử lý
		//cách 1: validation --> kiểm tra sc.nextLine() là hợp lệ trước khi Integer.parseInt(sc.nextLine());
		//cách 2: cho nhập thoải mái --> sai -->Integer.parseInt(sc.nextLine()); --> exception
		
		String text = "";
		do{
			System.out.println("Enter number: ");
			text = sc.nextLine();
		}while(!isNumber(text)) ;
		//validation text is a number
		int number = Integer.parseInt(text);
		
		System.out.println("--> Is prime: " + isPrime(number));
		
	}
	
	private static boolean isPrime(int number) {
		if(number < 2)
			return false;
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0)
				return false;
		}
		return true;
		//return number < 2 ? false : true;
	}
	
	private static boolean isNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(!Character.isDigit(letter))
				return false;
		}
		return true;
	}
	
	//break: thoát khỏi vòng lặp hiện tại
	//continue: bỏ qua các đoạn code bên dưới và thực hiện vòng lặp tiếp theo
	
}
