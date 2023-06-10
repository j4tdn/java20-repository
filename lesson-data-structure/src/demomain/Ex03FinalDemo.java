package demomain;

import datastructure.custom.Item;

public class Ex03FinalDemo {
     public static void main(String[] args) {
		/*
		 *  - final ở STACk
		 *  - biến --> lưu trữ ở STACK
		 */
    	 int N = 88;
    	final double PI = 3.14d;
    	
    	N = 44;
    	// PI = 4.13f; compile error
    	// final --> ko thể cập nhập ở STACK
    	
    	 final Item i1 = new Item(1, 'a', 20d);
    	final Item i2 = new Item(1, 'a', 20d);
    	
    	// i1 = i2; // lấy giá trị i2 gán cho i1
    	i1.salesPrice = 88d;
    	
	}
}
