package c.inheritance.basic;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB11", "Toán 8", "NXB-VN", BookStatus.NEW, 2);
		TextBook tb2 = new TextBook("TB2", "Lý 8", "NXB-ĐN", BookStatus.NEW, 2);
		TextBook tb3 = new TextBook("TB3", "Hóa 8", "NXB-ĐN", BookStatus.OLD, 3);
		System.out.println("tb1 --> " + tb1);
		
		System.out.println("\n========================================================\n");
		
		ReferenceBook rb1 = new ReferenceBook("RF22", "Văn 8", "NXB-NĐ", 8);
		ReferenceBook rb2 = new ReferenceBook("RF23", "Anh 8", "NXB-NĐ", 10);
		ReferenceBook rb3 = new ReferenceBook("RF24", "Sử 8", "NXB-HN", 10);
		System.out.println("rb1 --> " + rb1);
		
		// tạo danh sách những cuốn sách
		Book[] books = {tb1, tb2, tb3, rb1, rb2, rb3};
		
		// tìm những cuốn sách thuộc nhà xuất bản ĐN và có discount < 3%
		for (Book book : books) {
			if ((book instanceof TextBook) && book.getPublisher().equals("NXB-ĐN")) {
				TextBook tb = (TextBook)book;
				if (tb.getDiscount() < 3) {
					System.out.println("tb ĐN --> " + book);
				}
			}
		}
	}
}
