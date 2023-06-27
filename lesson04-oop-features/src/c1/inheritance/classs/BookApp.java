package c1.inheritance.classs;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("T8", "Toán 8", "NXB-ND", BookStatus.NEW, 3);
		TextBook tb2 = new TextBook("L8", "Lý 8", "NXB-ĐN", BookStatus.NEW, 1);
		TextBook tb3 = new TextBook("H8", "Hóa 8", "NXB-ĐN", BookStatus.OLD, 2);
		System.out.println("tb1 ==> " + tb1);

		System.out.println("\n===================\n");

		ReferenceBook rb1 = new ReferenceBook("V8", "Văn 8", "NXB-VN", 20);
		ReferenceBook rb2 = new ReferenceBook("S8", "Sinh 8", "NXB-ĐN", 20);
		ReferenceBook rb3 = new ReferenceBook("A8", "Anh 8", "NXB-ĐN", 10);
		System.out.println("rb2 ==> " + rb1);

		System.out.println("\n===================\n");
		Book[] books = { tb1, tb2, tb3, rb1, rb2, rb3 };
		// Tạo danh sách những cuốn sách, tìm những cuốn sách thuộc NXB-ĐN và có discount < 3%
		for(Book book : books) {
			if(book.getPulisher().equals("NXB-ĐN") && book instanceof TextBook) {
				TextBook tb = (TextBook)book;
				if(tb.getDiscount() < 3) {
					System.out.println("Text Book - ĐN --> " + tb);
				}
			}
		}
	}
}
