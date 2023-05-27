package datastructure.object.custom;

public class Ex03ObjectPassingFunction {
	// phạm vi sử dụng --> block scope {}
	public static void main(String[] args) {
		Item itX = new Item(7, 'T', 77f);
		itX.name = 'X';
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX);
		
		System.out.println("\n---------update values--------\n");
		modify(itX);
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX);
		
	}
	
	// = --> gán ở STACK
	// java --> passing by value at STACK =
	
	
	private static void modify(Item it) {
		it.id = 111;
		it = new Item(3, 'B', 33f);
		it.id = 6;
		it.name = 'S';
	}
}
