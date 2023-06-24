package c1.inheritance.classs;

public class BookApp {
	public static void main(String[] args) {

		TextBook tb1 = new TextBook("tb11", "Toán 8", "NXB-VN", BookStatus.NEW, 2);
		TextBook tb2 = new TextBook("tb12", "lý 8", "NXB-ĐN", BookStatus.NEW, 2);
		TextBook tb3 = new TextBook("tb13", "hóa 8", "NXB-ĐN", BookStatus.OLD, 3);

		ReferenceBook rb1 = new ReferenceBook("rf22", "văn 8", "NXB-ND", 8);
		ReferenceBook rb2 = new ReferenceBook("rf23", "anh 8", "NXB-ND", 10);
		ReferenceBook rb3 = new ReferenceBook("rf24", "sử 8", "NXB-ĐN", 10);

		// tạo ds những sách
		Book[] books = { tb1, tb2, tb3, rb1, rb2, rb3 };

		// tìm những sách thuộc nxb ĐN và có discount < 3%
		for (Book book : books) {
			if (book.getPublisher().equals("NXB-ĐN") && (book instanceof TextBook)) {
				TextBook tb = (TextBook) book;
				if (tb.getDiscount() < 3) {
					System.out.println("tb đn --> " + tb);
				}
			}
		}

	}
}
