package b.polymorphism.object;

public class Square extends Shape{
	
	// Class con không bắt buộc override method từ class cha
	
	// nên bắt buộc override lại để có phần thực thi của nó
	// class cha chỉ là nơi chứa hàm chung --> chưa biết phần thực thi thế nào
	@Override
	void paint() {
		System.out.println("Square --> paint ...");
	}
	
	@Override
	void calS() {
		System.out.println("Square --> calS ...");
	}
	
}
