package c5.strategypattern;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println("Sum -->" + calc(a, b, (x, y) -> x + y));
		System.out.println("Sub --> "+ calc(a,b,new Stratery() {
			
			@Override
			public int process(int x, int y) {
				return x - y;
			}
		}));
		Stratery sta = ((x, y) -> x / y) ;

		System.out.println("Div --> " + calc(a,b,sta));
	}
	private static int calc(int a, int b, Stratery statery) {
		return statery.process(a, b);
	}
}
/*
	class --> là k/n trừu tượng dùng để chỉ tập hợp các đối tượng có chung 
		+tt
		+pt
	VD: Car1, Car2, Car3 --> đều là Car
	
	
coding
abstract method trong interface, abstract class
--> tạo ra các abstract method chung cho KDL cha, sau đó con sẽ override lại 
--> VD: calS, tinhS, tinhDienTich, tinhDT

//thường class thuộc tính khai báo private --> đảm bảo tính chất đóng gói -->    
*/