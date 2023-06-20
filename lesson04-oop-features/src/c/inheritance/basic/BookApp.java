package c.inheritance.basic;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB11", "Toán 8", "NXB-VN", BookStatus.NEW, 2);
		System.out.println("tb1 ==>\n" + tb1);
		
		System.out.println("\n===============\n");
		
		ReferenceBook rb1 = new ReferenceBook("RF22", "Văn 8", "NXB-ND", 8);
		System.out.println("rb1 ==>\n" + rb1);
	}
}
