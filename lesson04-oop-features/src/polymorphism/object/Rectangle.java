package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void paint() {
		System.out.println("Rectangle --> paint ...");
	}
	
	@Override
	void calS() {
		System.out.println("Rectangle --> calS ...");
	}
	
	void setBackground() {
		System.out.println("Rectangle --> setBackground ...");
	}
}
