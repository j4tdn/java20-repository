package c.inheritance.basic;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB11", "Toán 8", "NXB-VN", BookStatus.NEW, 2);
		System.out.println("tb1 --> " + tb1.toString());
		
		System.out.println("\n========================================================\n");
		
		ReferenceBook rb1 = new ReferenceBook("RF22", "Văn 8", "NXB-NĐ", 0.1f);
		System.out.println("rb1 --> " + rb1.toString());
	}
}
