package c2.inheritance.iinterface;

public class Triangle implements Shape{

	@Override
	public void paint() {
		System.out.println("Triangle -- >  paint ...." );
	}	

	@Override
	public void cals() {
		System.out.println("Triangle -- >  Cals ...." );
	}
	
}
