package datastructure.object.custom;

public class Ex02UpdatingValue {
	public static void main(String[] args) {
		//primitive type
		int a = 5;
		int b = 10;
		
		a = b;
		a = 15;
		System.out.println("a--> " + a);
		System.out.println("b--> " + b);
		
		//object type
		
		Item itemA = new Item(1, 'A', 22f);
		Item itemB = new Item(2, 'B', 25f);
		System.out.println("ItemA address: " + System.identityHashCode(itemA));
		System.out.println("ItemB address: " + System.identityHashCode(itemB));
		System.out.println("itemA--> " + itemA);
		System.out.println("itemB--> " + itemB);
		System.out.println("=====update value=====");
		itemA.salesPrice = 32f;
		itemB.salesPrice = 35f;
		itemA = new Item(9, 'C', 99f);

		System.out.println("ItemA address: " + System.identityHashCode(itemA));
		itemA = itemB;
		itemB.salesPrice = 55f;
		
		
		System.out.println("ItemA address: " + System.identityHashCode(itemA));
		System.out.println("ItemB address: " + System.identityHashCode(itemB));
		System.out.println("itemA--> " + itemA);
		System.out.println("itemB--> " + itemB);
	}
}
