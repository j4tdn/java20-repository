package datastructure.object.custom;

public class Ex03ObjectPassingFunction {

	public static void main(String[] args) {
		Item itX = new Item(7, 'T', 77f);
		itX.name = 'X';
		System.out.println("itX address --> " + System.identityHashCode(itX));
		
		System.out.println("-----------");
		modify(itX);
	}
	private static void modify(Item it) {
		it.id = 111;
		it = new Item(3, 'B', 33f);
		it.id = 6;
		it.name = 'S';
	}
}
