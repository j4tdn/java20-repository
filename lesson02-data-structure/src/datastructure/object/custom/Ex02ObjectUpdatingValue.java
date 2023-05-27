package datastructure.object.custom;

public class Ex02ObjectUpdatingValue {
	public static void main(String[] args) {
		// primitive type  --> STACK
		int a = 5;
		int b = 10;
		
		a = b;
		a = 15;
		
		System.out.println("a--> " + a);
		System.out.println("b--> " + b);
		
		System.out.println("===========================");
		
		// object type
		Item itA = new Item(1, 'A',22f); // H1
		Item itB = new Item(2, 'B',35f); // H2
		
		System.out.println("itA address --> " + System.identityHashCode(itA));
		System.out.println("itB address --> " + System.identityHashCode(itB));
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		// toán tử = --> 100% gán hoạt động ở STACK	
		
		System.out.println("\n-------update value--------\n");
		itA.salesPrice = 33f;
		itB.salesPrice = 66f;
		itA = new Item(3, 'Z', 99f); // H3
		itA = itB; // H2
		itB.salesPrice = 55f;
		
		System.out.println("itA address --> " + System.identityHashCode(itA)); // H2
		System.out.println("itB address --> " + System.identityHashCode(itB)); // H2
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		
	}
}
