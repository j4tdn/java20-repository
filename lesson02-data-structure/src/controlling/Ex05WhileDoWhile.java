package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	//Xử dụng for khi biết đc điều kiện dừng
	//Duyệt các phần tử trong mnagr ,dánh sách ,tập hợp
	//for index,for each
	public static void main(String[] args) {
		int n = 8;
		int i = 1;
		
//		while(i<8) {
//			System.out.println(i+ " ");
//			i++;
//		}
		System.out.println("\n------------\n");
		//while(true)
		while(true) {
			System.out.println(i+ " ");
			i++;
			if(i==8)
			{
				break;
			}
		}
		i=1;
		do {
			System.out.println(i+ " ");
			i++;
		}while(i < 8);
		//while:kiểm tra kiều kiện từ lúc mới vào
		//do-while:bỏ qua lần kiểm tra đk đầu tiên
		//Nhập vào 1 số nguyên hợp lệ 
		//Kiểm tra số đó có phải số nguyên tố hay không
		//nhập sai yêu cầu nhập lại
		System.out.println("\n------------\n");
		Scanner ip =new Scanner(System.in);
		
		//C1:validation
		//-->kiểm tra ip.nextline() là hợp lệ trước khi Integer.parseInt(ip.nextLine())
		//C2:
		//-->Cho nhập thoải mái -->sai -->Integer.parseInt(ip.nextLine()) quăng lỗi
		//Dùng code bắt lỗi exception và yêu cầu người dùng nhập lại
		
		String text = ""; 
		
		//validation text is a number
		do
		{
			System.out.println("Enter number: ");
			text = ip.nextLine();
			if(!isNumber(text)) break;
		}while(true);
			
		int number = Integer.parseInt(text);
		
		System.out.println("is prime:  "+ isPrime(number));
		
		ip.close();
		//thoát hàm main -->return (kết thúc trả về void)
		//thoát chương trình ->System.exit(0)	
	}
	private static boolean isNumber(String text) {
		for(int i = 0; i< text.length();i++)
		{
			char letter= text.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	private static boolean isPrime(int number) {
		
		for (int i =2;i <= Math.sqrt(number);i++) {
			if(number % i == 0)
			{
				return false;
			}
		}
		return number <2 ? false : true ;
	}
}
