package b.polymorphism.object;

public class Rectangle extends Shape{
	
	@Override
	void paint() {
		System.out.println("Rectangle --> paint ...");
	}
	@Override
	void calS() {
		System.out.println("Rectangle --> calS ...");
	}
	void setBackgound() {
		System.out.println("Rectangle --> Backgound");
	}
}
