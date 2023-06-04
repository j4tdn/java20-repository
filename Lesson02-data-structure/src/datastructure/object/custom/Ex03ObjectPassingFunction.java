package datastructure.object.custom;

public class Ex03ObjectPassingFunction {
	public static void main(String[] args) {
		//phạm vi sử dụng --> block scope{}
		
		Item itemA = new Item(7, 'T', 77f);
		itemA.name = 'X';
		System.out.println("itemA address --> "+ System.identityHashCode(itemA));
		System.out.println("ItemA --> " + itemA);
		System.out.println("\n ------- update value--------");
		modify(itemA);
		System.out.println("itemA address --> "+ System.identityHashCode(itemA));
		System.out.println("ItemA --> " + itemA);
	}
	private static void modify(Item item) {
		item.id = 111;
		item = new Item(3,'B', 3f);
		item.id = 6;
		item.name = 'S';
	}
}
