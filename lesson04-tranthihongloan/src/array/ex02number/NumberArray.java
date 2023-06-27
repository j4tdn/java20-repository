package array.ex02number;

import java.util.Arrays;

public class NumberArray {
	private int length;
	private int[] value = null;
	
	public NumberArray() {

	}
	
	public NumberArray(int length, int[] value) {
		this.length = length;
		this.value = value;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int[] getValue() {
		return value;
	}

	public void setValue(int[] value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "NumberArray [length=" + length + ", value=" + Arrays.toString(value) + "]";
	}

}
