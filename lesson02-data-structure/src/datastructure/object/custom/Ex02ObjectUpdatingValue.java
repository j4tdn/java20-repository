package datastructure.object.custom;

public class Ex02ObjectUpdatingValue {
	public static void main(String[] args) {
		// primitive type
		int a = 5;
		int b = 10;

		a = b;
		a = 15;

		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("\n--------------------------\n");
		// object type
		Item itA = new Item(1, 'A', 25f); //H1 --> thực hiện hashing value (dãy số)
		Item itB = new Item(2, 'B', 35f); //H2
		
		System.out.println("itA address --> " + System.identityHashCode(itA));
		System.out.println("itB address --> " + System.identityHashCode(itB));
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		System.out.println("\n--------------------------\n");
		
		// toán tử '=' --> 100% là toán tử gán và hoạt động ở STACK
		
		itA.salesPrice = 33f;
		itB.salesPrice = 50f;
		itA = new Item(9,'Z',99f); //H3
		itA = itB; //H2 = thực hiện ở STACK, STACK chứa địa chỉ của biến Object
		itB.salesPrice = 55f; // cập nhật H2
		
		System.out.println("itA address --> " + System.identityHashCode(itA)); //H2
		System.out.println("itB address --> " + System.identityHashCode(itB)); //H2
		System.out.println("itA --> " + itA); //H2
		System.out.println("itB --> " + itB); //H2
	}
}
