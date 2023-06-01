package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Khai báo và gán giá trị cho biến kdl nguyên thuỷ
		int digit = 10;
		char letter = 'W';
		System.out.println("digit --> " + digit);
		System.out.println("letter --> " + letter);

		System.out.println("\n***___ --- ___***\n");

		// Khai báo và gán giá trị cho biến kdl đối tượng
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'X';
		i1.salesPrice = 11d;
		System.out.println("item i1 --> " + i1);
		System.out.println("item i1 toString --> " + i1.toString());
		System.out.println("item i1 info --> id = " + i1.id + ", name = " + i1.name + ", salesPrice = " + i1.salesPrice);

		System.out.println("\n***___ --- ___***\n");

		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22d;
		System.out.println("item i2 --> " + i2);
		System.out.println("item i2 toString --> " + i2.toString());
		System.out.println("item i2 info --> id = " + i2.id + ", name = " + i2.name + ", salesPrice = " + i2.salesPrice);
		
		System.out.println("\n***___ --- ___***\n");
		
		Item i3 = null;
		System.out.println("item i3 --> " + i3);
		// System.out.println("item i3 toString --> " + i3.toString()); // NPE --> JVM throws NullPointerException
																		 // --> Ko tìm thấy vị trí trỏ đến tại vùng nhớ HEAP 
																		 // --> Dừng luôn chương trình
		
		System.out.println("\n***___ --- ___***\n");
		
		Item i4 = new Item(4, 'B', 44d);
		System.out.println("item i4 --> " + i4);
	}
}
