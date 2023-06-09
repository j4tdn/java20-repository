package demomain;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {

	public static void main(String[] args) {
		int N = 88;
		final double PI = 3.14;
		
		N = 44;
		
		Item i1 = new Item(1, 'A', 20f);
		Item i2 = new Item(2, 'B', 20f);
		
		i1 = i2;
		
		i1.salesPrice = 88;
		

	}

}
