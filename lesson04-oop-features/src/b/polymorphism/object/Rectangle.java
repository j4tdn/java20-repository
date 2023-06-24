package b.polymorphism.object;

public class Rectangle extends Shape{
	@Override
	void paint() {
		System.out.println("Rectangle---> paint....");
	}
	@Override
	void cals() {
		System.out.println("Rectangle ---> Cals....");
	}
	void setBackground() {
		System.out.println("Rectangle--> setBackground...");
	}
}
