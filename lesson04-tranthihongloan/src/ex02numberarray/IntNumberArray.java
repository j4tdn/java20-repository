package ex02numberarray;

import java.util.Arrays;

public class IntNumberArray {
	private int length;
	private Integer[] value = null;
	
	public IntNumberArray() {

	}

	public IntNumberArray(int length, Integer[] value) {
		super();
		this.length = length;
		this.value = value;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Integer[] getValue() {
		return value;
	}

	public void setValue(Integer[] value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IntNumberArray [length=" + length + ", value=" + Arrays.toString(value) + "]";
	}
}
