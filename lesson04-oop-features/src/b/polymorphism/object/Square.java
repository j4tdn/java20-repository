package b.polymorphism.object;

public class Square extends Shape{
	//class con không bắt buộc overide methods từ class cha
	
	//nên bắt buộc overide lại để có phần thực thi của nó
	//class cha chỉ là nơi chứa hàm 'chung' --> chưa biết phần thực thi
	
	@Override
	void paint() {
		System.out.println("Square --> paint ...");
	}
	@Override
	void calS() {
		System.out.println("Square --> calS ...");
	}
}
