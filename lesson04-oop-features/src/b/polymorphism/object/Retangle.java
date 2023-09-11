package b.polymorphism.object;

public class Retangle extends Shape{
	
	@Override
	void paint() {
		System.out.println("Retangle--> paint.....");
	}
	@Override
	void calS() {
		System.out.println("Retangle --> calS...");
	}
	void setBackground() {
		System.out.println("Retangle --> setBackground");
	}
}
