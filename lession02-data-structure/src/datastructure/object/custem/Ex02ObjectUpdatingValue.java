package datastructure.object.custem;

public class Ex02ObjectUpdatingValue {
	public static void main(String[] args) {
		//primitive type
		int a =5;
		int b =10;
		a =b;
		a = 15;
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
		
		System.out.println("----*------");
		//Object type
		Item itA = new Item(1,'A',25f); //H1 --> thực tế hashing value (dãy số)
		Item itB = new Item(2,'B',35f); //H2
		System.out.println("itA address --> "+ System.identityHashCode(itA));
		System.out.println("itB address --> "+ System.identityHashCode(itB));
		
		System.out.println("itA --> "+itA);
		System.out.println("itB --> "+itB);
		
		//Toán tử bằng (=) 100% toán tử gán hoạt động ở STACK
		itA.salesPrice =33f;
		itB.salesPrice =66f;
		itA = new Item(3,'Z',99f);
		itA = itB;
		itB.salesPrice =55f;  
		
		System.out.println("\n -------UPDATE VALUE-------");
		System.out.println("itA address --> "+ System.identityHashCode(itA));
		System.out.println("itB address --> "+ System.identityHashCode(itB));
		
		System.out.println("itA --> "+itA);
		System.out.println("itB --> "+itB); 
		
	//Địa chỉ mà íA,itB trỏ đến có thay đổi hay k
		//--> A có, B ko
	//Nếu có hoặc không thay đổi  -->ô nhớ, giá trị mà itA, itB đang trỏ đến là bao nhiêu
	}
}
/*
 * Kết quả
  	a-->15
	b-->10
	----*------
	itA address --> 1365202186
	itB address --> 1651191114
	itA --> id = 1, pname = A, Price = 25.0
	itB --> id = 2, pname = B, Price = 35.0
	
		-------UPDATE VALUE-------
	itA address --> 1365202186
	itB address --> 1651191114
	itA --> id = 1, pname = A, Price = 33.0
	itB --> id = 2, pname = B, Price = 66.0
	
		 -------UPDATE VALUE-------
	itA address --> 1651191114
	itB address --> 1651191114
	itA --> id = 2, pname = B, Price = 55.0
	itB --> id = 2, pname = B, Price = 55.0
 */
