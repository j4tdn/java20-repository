package b.polymorphism.object;

public class Square extends Shape {
	
	// Class con không bắt buộc override methods từ class cha
	// Nhưng nên override lại để có phần thực thi của nó
	// Class cha chỉ là nơi chứa hàm "chung" --> chưa biết phần thực thi

	@Override
	void paint() {
		System.out.println("Square --> paint ...");
	}
	
	@Override
	void calS() {
		System.out.println("Square --> calS ...");
	}
	
}
