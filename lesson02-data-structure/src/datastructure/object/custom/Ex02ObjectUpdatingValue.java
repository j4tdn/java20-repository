package datastructure.object.custom;


public class Ex02ObjectUpdatingValue {
	public static void main(String[] args) {
		// Primitive type
		int a = 5;
		int b = 10;
		a = b;
		a = 15;
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);		
		
		//Object type
		Item itA = new Item(1,'A',25f); // H1
		Item itB = new Item(2,'B',35f); // H2
		Item itC = new Item(3,'C',45f);
		
		System.out.println("itA address --> " + System.identityHashCode(itA));
		System.out.println("itA address --> " + System.identityHashCode(itB));
		System.out.println("itA  --> " + itA);
		System.out.println("itB  --> " + itB);
		
		System.out.println("--------- Updating values --------------");
		
		itA = new Item(3,'Z',65f);
		System.out.println("itA address --> " + System.identityHashCode(itA));
		itA = itB;
		itB.salesPrice = 44f;
		System.out.println("itA address --> " + System.identityHashCode(itA));
		System.out.println("itA address --> " + System.identityHashCode(itB));
		System.out.println("itA  --> " + itA);
		System.out.println("itB  --> " + itB);
	}
}
