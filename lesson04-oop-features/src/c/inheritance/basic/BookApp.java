package c.inheritance.basic;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("tb11", "Toán 8", "NXB-VN", BookStatus.NEW, 2);
		System.out.println(tb1);
	}
}
