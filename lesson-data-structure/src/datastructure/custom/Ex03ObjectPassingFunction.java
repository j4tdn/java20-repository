
package datastructure.custom;

public class Ex03ObjectPassingFunction {
	
	public static void main(String[] args) {
		Item itX = new Item(8, 't', 88f);
		itX.name= 'X';
		System.out.println("itX address --> " + System.identityHashCode(itX));
		
		modify(itX);
		System.out.println();
		System.out.println();
		
		System.out.println("\n ----update values ----\n");
		
		
		
		}
	 private static void modify(Item it) {
		 it.id=11;
		 it = new Item(3,'B', 33f);
		 it.id=6;
		 it.name='S';
		 
	 }

}
