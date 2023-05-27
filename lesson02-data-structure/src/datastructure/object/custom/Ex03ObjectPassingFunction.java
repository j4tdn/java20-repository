package datastructure.object.custom;

public class Ex03ObjectPassingFunction {
	// phạm vi sử dụng --> block scope {}
	public static void main(String[] args) {
		Item itX = new Item(7, 'T', 77f);
		itX.name = 'X';
		System.out.println("itx address --> " + System.identityHashCode(itX));
		
		System.out.println("\n-----------Update Values------------\n");
		modify(itX);
		System.out.println("itx address --> " + System.identityHashCode(itX));
		System.out.println("itx --> " + itX);
	}
	
	private static void modify(Item item) {
		item.id = 111;
		item = new Item(3,'B',33f);
		item.id = 6;
		item.name = 'S';
	}
}
