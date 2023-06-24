package b.polymorphism.object;

public class Square extends Shape{
	@Override
	void paint() {
		System.out.println("square---> paint....");
	}
	@Override
	void cals() {
		System.out.println("Square ---> Cals....");
	}
}
