package demomain;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// Final --> Final at STACK
		// Variables --> Saved at STACK
		// Value of primitive variable --> STACK
		int N = 88;
		final double PI = 3.14d;
		// PI = 4.13d; compile error
		// Final cannot update value at STACK
		
		// Value of object variable --> HEAP
		final Item i1 = new Item(1,'A',20d);
		final Item i2 = new Item(1,'A',20d);
		
		// i1 = i2; compile error
		i1.salesPrice = 88;
		i1.name = 'B';
		i1.id = 2;
	}
}