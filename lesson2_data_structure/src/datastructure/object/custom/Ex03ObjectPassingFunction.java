package datastructure.object.custom;

public class Ex03ObjectPassingFunction {
	public static void main(String[] args) {
		// H1(111, 'X', 77)
		// H2(6, 'S', 33)
		
		Item itX = new Item(7, 'T', 77f); // H1
		itX.name = 'X';
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX); // H1(7, 'X', 77)
		
		System.out.println("\n----------Update Values ------------\n");
		modify(itX);
		System.out.println("itX address --> " + System.identityHashCode(itX)); // ko, có
		System.out.println("itX --> " + itX); // id, name, salesPrice có || không
	}
	
	// = --> gán ở STACK
	// JAVA --> passing by value at STACK =
	
	// modify(null); --> Item it = null;
	// modify(new Item(2, 'T', 22f)); --> Item it = new Item(2, 'T', 22f)
	// modify(itX); --> Item it = itX // H1
	private static void modify(Item it) {
		it.id = 111; // it(H1), itX(21)
		it = new Item(3, 'B', 33f); // it(H2)
		it.id = 6;
		it.name = 'S';
	}
}
