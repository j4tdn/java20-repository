package c.inheritance.interfacee;

public class Triangle implements Shape {

	@Override
	public void paint() {
		System.out.println("Triangle --> paint ....");
	}

	@Override
	public void calS() {
		System.out.println("Triangle --> cal S ....");
	}

}
