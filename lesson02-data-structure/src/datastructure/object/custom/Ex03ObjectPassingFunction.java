package datastructure.object.custom;

public class Ex03ObjectPassingFunction {
	// phạm vi sử dụng --> block scope{}
	public static void main(String[] args) {
		// H1(111, 'X', 77)
		// H2(6, 'S', 33)
		
		Item itX = new Item(7, 'T', 77f); 
		itX.name = 'X';
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX); 
		
		System.out.println("\n----------------Update Values-----------------\n");
		modify(itX);
		System.out.println("itX address --> " + System.identityHashCode(itX)); //ko, có
		System.out.println("itX --> " + itX); // id có.
	}
	
	// = --> gán ở STACK
	// JAVA --> passing by value at STACK
	
	// modify(null); --> Item it = null;
	// modify(new Item(2, 'T', 22f)); --> Item it = new Item(2, 'T', 22f)
	
	private static void modify(Item it) {
		it.id = 111;
		it = new Item(3, 'B', 33f); // H2
		it.id = 6;
		it.name = 'S';
	}
}
