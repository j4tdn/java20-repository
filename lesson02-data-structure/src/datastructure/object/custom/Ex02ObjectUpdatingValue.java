package datastructure.object.custom;

public class Ex02ObjectUpdatingValue {
	public static void main(String[] args) {
		//primitive type
		int a = 5;
		int b = 10;
		
		a = b;
		a = 15;
		
		System.out.println("a--> " + a);
		System.out.println("b--> " + b);
		
		//object type
		Item itA = new Item(1, 'A', 22f);
		Item itB = new Item(2, 'B', 35f);
		
		System.out.println("itA address --> " + System.identityHashCode(itA));
		System.out.println("itB address --> " + System.identityHashCode(itB));
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		System.out.println("\n------------Update value--------");
		
		itA.salesPrice = 35f;
		itB.salesPrice = 66f;
		itA = new Item(9, 'Z', 99f);
		
		System.out.println("itA address 34 --> " + System.identityHashCode(itA));
		itA = itB;
		itB.salesPrice =55f;
		
		System.out.println("itA address --> " + System.identityHashCode(itA));
		System.out.println("itB address --> " + System.identityHashCode(itB));
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
	}
}
