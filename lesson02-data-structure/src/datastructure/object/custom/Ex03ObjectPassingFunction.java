package datastructure.object.custom;

public class Ex03ObjectPassingFunction {
	
	//phạm vi sử dụng --> Block Scope {}
	public static void main(String[] args) {
		Item itX = new Item(7, 'T', 77f); //H1(7, 'T', 77)
		itX.name = 'X'; //H1(7, 'X', 77)
		
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX);
		System.out.println("\n-----------Update value----------\n");
		
		modify(itX);
		System.out.println("itX address --> " + System.identityHashCode(itX));
		System.out.println("itX --> " + itX);
	}
	
	//Item it = itX; //H1
	private static void modify(Item it) {
		it.id = 111; //it và itX dùng chung ô nhớ H1
		it = new Item(3, 'B', 33f); //H2(3, 'B', 33) --> it(H2) -->itX(H1)
		it.id = 6;
		it.name = 'S';
	}
}
