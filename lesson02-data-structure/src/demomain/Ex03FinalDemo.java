package demomain;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// final --> final ở STACK --> không thể cập nhật giá trị ở STACK
		
		int N = 88;
		final double PI = 3.14d;
		N = 44;
		// PI = 4.13d; // Compile error
		
		final Item i1 = new Item(1, 'A', 20d);
		final Item i2 = new Item(1, 'A', 20d);
		//i1 = i2; // Compile error
		i1.salesPrice = 88d;
	}
}
