package datastructure.object.custom;

public class Ex03ObjectPassingFunction {
	public static void main(String[] args) {
		//Phạm vi sử dụng block scope {}
		Item itX = new Item(7,'T',77f);
		itX.name  = 'X';
		System.out.println("itX address --> " +System.identityHashCode(itX));
		System.out.println("itX --> " + itX);
		
		System.out.println("\n----------Update values-------------");
		modify(itX);
		System.out.println("itX address --> " +System.identityHashCode(itX));
		System.out.println("itX address --> " +System.identityHashCode(itX));
		System.out.println("itX --> " + itX);
		
	}
	//Toán tử = 100% thực hiện ở STACK
	//Java --> passing by value at STACK
	
	
	//modify(null) 						--> Item item = null;
	//modify(new Item(111,'SS',100f)) 	--> Item item = new Item(111,'SS',100f);
	//modify(itX); 						--> Item item = itX
	private static void modify(Item item) {
		item.id = 111;
		item = new Item(2222,'S',111f);
		item.id = 9999;
		item.name = 'R';
		item.salesPrice = 100f;
	}
}
