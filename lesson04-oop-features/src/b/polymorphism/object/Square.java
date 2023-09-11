package b.polymorphism.object;

public class Square extends Shape{
	
	//class con không bắt buộc Override methods từ class cha
	
	//Nên bắt buộc Override lại để có phần thực thi của nó
	//class cha chỉ là nơi chứa hàm chung --> chưa biết thực thi
	
	@Override
	void paint() {
		System.out.println("Square--> paint.....");
	}
	@Override
	void calS() {
		System.out.println("Square --> calS...");
	}
}
