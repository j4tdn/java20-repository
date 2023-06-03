package datastructure.object.custom;

public class Ex03ObjectPassingFunction {
	// phạm vi sử dụng --> block scope {}
	public static void main(String[] args) {
		// H1(111, 'X', 77f)
		// H2(6, 'S', 33f)
		
		Item itX = new Item(7, 'T', 77f); // H1
		itX.name = 'X';
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX); // H1(7, 'X', 77f)
		
		System.out.println("\n------Update Values------\n");
		modify(itX);
		System.out.println("itX address --> " + System.identityHashCode(itX)); // ko thay đổi
		System.out.println("itX --> " + itX); // id có thay đổi
		                                      // name, salesPrice ko thay đổi
		
	}
	// = --> gán ở STACK
	// JAVA --> passing by value at STACK =
	
	// modify(null); --> Item it = null;
	// modify(new Item(2, 'T', 22f)); --> Item it = new Item(2, 'T', 22f)
	// modify(itX); --> Item it = itX // H1
	private static void modify(Item it) {
		it.id = 111; // it(H1), itX(H1)
		it = new Item(3, 'B', 33f); // it(H2)
		it.id = 6;
		it.name = 'S';
	}
}
