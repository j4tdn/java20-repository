package datastructure.object;

public class Ex02ObjectUpdateValue {
	public static void main(String[] args) {
		// primitive type --> STACK
		int a = 5;
		int b =10;
		
		a = b;
		a = 15;
		
		System.out.println("a --> " + a);  //15
		System.out.println("b --> " + b);  //10
		
		System.out.println("\n-----------------------\n");
		
		// object type
		Item itA = new Item (1, 'A', 22f); //H1 --> thực tế Hashing Value(dãy số)
		Item itB = new Item (2, 'B', 35f); //H2
		
		System.out.println("itA address --> " + System.identityHashCode(itA));
		System.out.println("itB address --> " + System.identityHashCode(itB));
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		// Toán tử = --> 100% toán tử gán hoạt động ở STACK
		
		itA.salesPrice = 33f;
		itB.salesPrice = 66f;
		itA = new Item(9, 'Z', 99f); //H3
		
		System.out.println("itA address 34 --> " + System.identityHashCode(itA));
		
		itA = itB; //H2
		itB.salesPrice = 55f;
		
		System.out.println("\n-----------Update Values------------\n");
		
		System.out.println("itA address --> " + System.identityHashCode(itA)); //H2
		System.out.println("itB address --> " + System.identityHashCode(itB)); //H2
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);

	}
}
