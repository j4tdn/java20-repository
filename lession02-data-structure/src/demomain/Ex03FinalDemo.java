package demomain;

import datastructure.object.custem.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		//final -->final ở STACK 
		//biến --> lưu trữ ở STACK
		//giá trị của KDL NT --> stack
		int N =88;
		//double PI = 3.14;
		final double PI = 3.14d;
		//PI = 4.31d; compile error
		
		//giá trị của KDL DT --> HEAP
			Item i1 = new Item(1, 'A',20d);
			Item i2 = new Item(1, 'A',20d);
			
			i1 = i2;//toán tử bẳng xử lý ở STACK; compile error
			//có final : k cập nhật địa chỉ;có thể cập nhật giá trị trên HEAP
			//i1.salesPrice 88d;
	}
}
