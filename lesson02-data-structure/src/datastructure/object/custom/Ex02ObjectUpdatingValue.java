package datastructure.object.custom;

public class Ex02ObjectUpdatingValue {
		public static void main(String[] args) {
			// primitive type
			int a=5;
			int b=10;
			a=b;
			a=15;
			System.out.println("a -->" +a);
			System.out.println("b -->" +b);
			System.out.println("\n--------------------------\n");
			// object type
			Item itA = new Item(1 , 'A' ,22f);
			Item itB = new Item(2 , 'B', 35f);
			System.out.println("itA address -->"+ System.identityHashCode(itA));
			System.out.println("itB address -->"+ System.identityHashCode(itB));
			System.out.println("itA --> "+ itA);
			System.out.println("itB --> "+ itB);
			System.out.println("\n---------Update Values-------------\n");
			itA.salesPrice = 33f;
			itB.salesPrice =66f;
			itA = new Item(3, 'Z' ,99f); //H3
			System.out.println("itA address 34 -->"+ System.identityHashCode(itA));
			itA =itB; //H2
			itB.salesPrice =55f;
			System.out.println("itA address -->"+ System.identityHashCode(itA));
			System.out.println("itB address -->"+ System.identityHashCode(itB));
			System.out.println("itA --> "+ itA);
			System.out.println("itB --> "+ itB);
		}
}
