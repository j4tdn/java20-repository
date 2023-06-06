package demomain;

public class IntegerFake {
	public int value;
	
	public IntegerFake() {}
	
	public IntegerFake(int a) {
		this.value = a;
	}
	
	@Override
	public String toString() {
		return this.value + "";
	}
}
