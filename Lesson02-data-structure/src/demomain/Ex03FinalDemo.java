package demomain;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// final --> final ở STACK
		// biến --> lưu trử ở STACK
		// final --> ko thể cập nhật giá trị ở STACK
		
		int n = 88;
		final double PI = 3.14d;
		
		n = 44;
		//PI = 4.13; compile error
	
	
		// giá trị của KDL ĐT --> HEAP	
		final Item item1 = new Item(1, 'B', 20);
		final Item item2 = new Item(2, 'A', 21);
		// item1 = item2; compile error
		item1.salesPrice = 77d;
	}
}
