package b.polymorphism.object;

public class Square extends Shape {
	// class con ko bắt buộc override methods từ class cha
	// nên bắt buộc override lại để có phần thực thi của nó
	// class cha chỉ là nơi chứa hàm chung --> chưa biết thực thi
	
	@Override
	void paint() {
		System.out.println("Square --> paint ...");
	}
	
	@Override
	void calS() {
		System.out.println("Square --> cals ...");
	}
}
