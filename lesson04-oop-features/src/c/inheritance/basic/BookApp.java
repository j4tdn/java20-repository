package c.inheritance.basic;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("T8", "Toán 8", "NXB-ND", BookStatus.NEW, 10);
		ReferenceBook rb1 = new ReferenceBook("V8", "Văn 8", "NXB-VN", 20);
		System.out.println(tb1);
		System.out.println(rb1);
		Book[] books = new Book[] {rb1,tb1};
	}
}
