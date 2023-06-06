package demomain;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		//final --> final (stack)
		//biến -->lưu trữ ở Stack
		//Giá trị của KDL NT--> Stack
		int N=88;
		final double PI=3.14d;
		
		N =44 ;
		//PI= 7.14 compile error
		//Giá trị của KDL DT--> HEAP
		final Item i1 =new Item(1,'A',20d);
		final Item i2 =new Item(1,'A',20d);
		
		//i1=i2 compile error
		i1.salePrice = 88d;
	}
}
