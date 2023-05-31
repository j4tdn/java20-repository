package datastructure.object.custom;

public class Ex02OjectUpdatingVale {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		a=b;
		a=15;
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		Item itA = new Item(1,'A',25f);
		Item itB = new Item(2,'B',35f);
		
		System.out.println("itA address -->"+ System.identityHashCode(itA));
		System.out.println("itA address -->"+ System.identityHashCode(itB));
		
		System.out.println("itA:  "+itA);
		System.out.println("itB:  "+itB);
		
		itA.salePrice = 33f;
		itB.salePrice = 66f;
		itA = new Item(9,'Z',99f); //H3
		
		itA = itB;
		itB.salePrice = 55f;
		//Update value
		System.out.println("itA address -->"+ System.identityHashCode(itA)); //H2
		System.out.println("itA address -->"+ System.identityHashCode(itB)); //H2
		
		System.out.println("itA:  "+itA);
		System.out.println("itB:  "+itB);
	}
}
