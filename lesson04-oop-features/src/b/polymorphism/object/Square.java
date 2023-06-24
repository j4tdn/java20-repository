package b.polymorphism.object;

public class Square extends Shape{
	//khong bat buoc overide 
	
	//nen bat buoc overide lai de co phan thuc thi cua no
	//class cha chi la noi chua ham, phuong thuc chung --> chua biet thuc thi
	@Override
	void paint() {
		System.out.println("square---> paint....");
	}
	@Override
	void cals() {
		System.out.println("Square ---> Cals....");
	}
}
