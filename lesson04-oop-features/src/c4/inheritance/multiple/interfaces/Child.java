package c4.inheritance.multiple.interfaces;

public class Child extends Ancestor implements Father, Mother {

	@Override
	public void cooking() {
		Father.super.cooking();
		Mother.super.cooking();
	}

}
