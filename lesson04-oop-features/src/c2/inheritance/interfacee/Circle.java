package c2.inheritance.interfacee;

public class Circle implements Shape {
	
	@Override
	public void paint() {
		System.out.println("Circle --> paint ...");
	}

	@Override
	public void calS() {
		System.out.println("Circle --> calS ...");
	}
	
}
