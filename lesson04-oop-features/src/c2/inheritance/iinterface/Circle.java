package c2.inheritance.iinterface;

public class Circle implements Shape{
	@Override
	public void paint() {
		System.out.println("shape --> paint....");	
	}
	
	@Override
	public void cals() {
		System.out.println("shape --> cals....");	
	}
};

