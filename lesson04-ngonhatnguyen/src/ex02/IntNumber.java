package ex02;

public class IntNumber {
	private int value;
	
	public IntNumber() {
	}

	public IntNumber(int number) {
		super();
		this.value = number;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int number) {
		this.value = number;
	}

	@Override
	public String toString() {
		return "" + value;
	}
	
}
