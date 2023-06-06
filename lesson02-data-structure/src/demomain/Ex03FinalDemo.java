package demomain;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// final --> final at STACK
		// final --> k thể cập nhật giá trị ở STACK
		
		// biến --> lưu trữ ở STACK
		
		// giá trị của KDL NT --> STACK
		int N = 88;
		final double PI = 3.14d;
		
		N = 44;
		// PI = 4.13d; compile error
		
		// giá trị của KDL DT --> HEAP
		final Item i1 = new Item(1, 'A', 20d);
		final Item i2 = new Item(1, 'A', 20d);
		
		// i1 = i2; compile error
		i1.salesPrice = 88d;
	}
}
