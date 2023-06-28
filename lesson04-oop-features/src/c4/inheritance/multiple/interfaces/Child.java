package c4.inheritance.multiple.interfaces;

public class Child extends Ancestor implements Mother, Father{

	@Override
	public void cooking() {
		Father.super.cooking();
		Mother.super.cooking();
	}

}
