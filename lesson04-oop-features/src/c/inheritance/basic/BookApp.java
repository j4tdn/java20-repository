package c.inheritance.basic;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB11", "toan8", "NXB VN", BookStatus.NEW, 2);
		System.out.println(tb1);
		
		System.out.println("==========");
		ReferenceBook rb1 = new ReferenceBook("RF22", "VAN 8", "NXB ND", 5);
		System.out.println(rb1);
	}
}
