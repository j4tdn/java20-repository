package datastructure.object.custom;

public class Ex02ObjectUpdatingValue {
	public static void main(String[] args) {
		// primitive type
		int a = 5;
		int b = 10;
		
		a = b;
		a = 15;
		
		System.out.println("a --> " + a); // 15
		System.out.println("b --> " + b); // 10

		//object type
		Item itA = new Item(1, 'A', 22f); // H1 --> thực tế hashing value (dãy số)
		Item itB = new Item(2, 'B', 25f); // H2
		
		System.out.println("itA address --> " + System.identityHashCode(itA));
		System.out.println("itB address --> " + System.identityHashCode(itB));
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		System.out.println("\n--------Update Values--------\n");
		
		itA.salesPrice = 33f;
		itB.salesPrice = 66f;
		itA = new Item(9, 'Z', 99f);
		
		System.out.println("itA address 34 --> " + System.identityHashCode(itA));
		
		itA = itB;
		itB.salesPrice = 55f;
		 
		System.out.println("itA address --> " + System.identityHashCode(itA)); // H2
		System.out.println("itB address --> " + System.identityHashCode(itB)); // H2
		System.out.println("itA --> " + itA); // H2 (2, 'B', 55f)
		System.out.println("itB --> " + itB); // H2 (2, 'B', 55f)
		
		// Dia chi ma itA, itB tro den co thay doi khong
		// Neu co hoac khong thay doi --> o nhom gia tri ma itA, itB dang tro den co id, name, salesPrice bang bao nhieu
	}
}
