package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		//primitive
		int a = 10;
		System.out.println(" a --> " + a);
		
		System.out.println("\n-------------\n");
		
		
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(7);
		Integer iE = new Integer(6);
		Item itA = new Item(1, 'A', 11f);
		
		System.out.println("iA --> " + iA);
		System.out.println("iB --> " + iB);
		System.out.println("iC --> " + System.identityHashCode(iC));
		System.out.println("iD --> " + iD);
		System.out.println("iE --> " + System.identityHashCode(iE));
		
		System.out.println("-----------");
		Integer oB = 55;
		Integer oC = 66;
		Integer oD = 77;
		Integer oE = 66;
		
		System.out.println("oB --> " + oB); //H4
		System.out.println("oB --> " + oC); //H5
		System.out.println("oB --> " + oD); //H6
		System.out.println("oB --> " + oE); //H5
		
		
		System.out.println("oB --> " + System.identityHashCode(oB));
		System.out.println("oC --> " + System.identityHashCode(oC));
		System.out.println("oD --> " + System.identityHashCode(oD));
		System.out.println("oE --> " + System.identityHashCode(oE));
		
	}

}
