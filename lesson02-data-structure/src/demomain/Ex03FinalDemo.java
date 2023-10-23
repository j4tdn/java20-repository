package demomain;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// final --> final at stack
		// final --> k thể cập nhật value ở stack

		// biến --> lưu ở stack

		// giá trị KDL NT --> stack
		int n = 88;
		final double pi = 3.14d;
		
		n = 44;
		// pi = 4.13; compile error
		
		// giá trị KDL DT --> HEAP
		
		final Item i1 = new Item(1, 'A', 20d);
		final Item i2 = new Item(1, 'A', 20d);

		// i1 = i2; compile error
		i1.salesPrice = 88d;
		
	}
}
