package datastructure.custom;

public class Ex02ObiectUpdatingValue {
  public static void main(String[] args) {
	// primative type
	  int a = 5;
	  int b = 10;
	  
	  a = b;
	  a = 15;
	  System.out.println("a--> " + a);
	  System.out.println("b--> " + b);
	  
	  System.out.println("\n ============\n");
	  
	  
	  
	 // object type
	  
	  Item itA = new Item(1, 'A',22f);
	  Item itB = new Item(2, 'B',35f);
	  
	  System.out.println("itA address --> " + System.identityHashCode(itA));
	  System.out.println("itA address --> " + System.identityHashCode(itB));
	  System.out.println("itA -- > " + itA);
	  System.out.println("itA -- > " + itB);
	  
	  System.out.println("\n ----update values----\n");
	  
	  itA.salesPrice = 33f;
	  itB.salesPrice = 66f;
	  itA= new Item(9, 'z', 99f);
	  System.out.println("ita address 34 ==>  "+System.identityHashCode(itA) );
	  itA=itB;
	  itB.salesPrice=55f;
	  
	  System.out.println("itA address --> " + System.identityHashCode(itA));
	  System.out.println("itA address --> " + System.identityHashCode(itB));
	  System.out.println("itA -- > " + itA);
	  System.out.println("itA -- > " + itB);
  }
}
