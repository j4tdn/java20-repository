package datastructure.object;

public class Ex03ObjectPassingFunction {
	public static void main(String[] args) {
		// H1(7, 'T', 77f)
		Item itX = new Item(7, 'T', 77f); // H1 
		itX.name = 'X';
		
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX);
		
		System.out.println("\n-----------Update Values------------\n");
		modify(itX);
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX);
	}
	
	//modify(null) --> Item it = null;
	//modify(new Item(2, 'T', 22f)) --> Item it = new Item(2, 'T', 22f);
	//modify(itX) --> Item it = itX;
	private static void modify(Item it) {
		it.id = 111;
		it = new Item(3, 'B', 33f);
		it.id = 6;
		it.name = 'S';
	}
}
