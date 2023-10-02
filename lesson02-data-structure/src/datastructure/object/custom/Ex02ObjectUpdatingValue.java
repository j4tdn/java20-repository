package datastructure.object.custom;

public class Ex02ObjectUpdatingValue {
	public static void main(String[] args) {
		//primative type --> STACK
		int a = 5;
		int b = 10;
		
		a = b;
		a = 15;
		
		System.out.println("a --> " + a); //15
		System.out.println("b --> " + b); //10
		
		//object type
		Item itA = new Item(1, 'A', 22f); //thực tế là hasing value (dãy số)
		Item itB = new Item(2, 'B', 35f);
		
		System.out.println("itA address --> "+System.identityHashCode(itA));
		System.out.println("itB address --> "+System.identityHashCode(itB));
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		System.out.println("\n---------Update value----------\n");
		itA.salesPrice = 33f;
		itB.salesPrice = 66f;
		
		
		//Toán tử = 100% toán tử gán hoạt động ở STACK
		itA = new Item(9, 'Z', 99f); //Tạo ô nhớ mới H3
		itA = itB; //Trỏ đến H2
		itB.salesPrice = 55f; //Cập nhật giá trị H2
		System.out.println("itA address --> "+System.identityHashCode(itA)); //H2 
		System.out.println("itB address --> "+System.identityHashCode(itB)); //H2
		System.out.println("itA --> " + itA); //Giá trị của ô nhớ H2 sau khi cập nhật
		System.out.println("itB --> " + itB);
		
	}
}
