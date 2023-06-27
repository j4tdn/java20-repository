package c1.inheritance.classs;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB11", "Toán 8", "NXB-VN", BookStatus.NEW, 2);
		TextBook tb2 = new TextBook("TB12", "Ly 8", "NXB-DN", BookStatus.NEW, 2);
		TextBook tb3 = new TextBook("TB13", "Hoa 8", "NXB-DN", BookStatus.OLD, 3);

		System.out.println(tb1);
		System.out.println(tb2);
		System.out.println(tb3);
		
		ReferenceBook rb1 = new ReferenceBook("RB22", "Van 8", "NXB-ND", 8);
		ReferenceBook rb2 = new ReferenceBook("RB23", "Anh 8", "NXB-ND", 10);
		ReferenceBook rb3 = new ReferenceBook("RB24", "Su 8", "NXB-DN", 10);
		
		System.out.println(rb1);
		System.out.println(rb2);
		System.out.println(rb3);
		
		//tạo danh sách những cuốn sách
		Book[] books = {tb1, tb2, tb3, rb1, rb2, rb3};
		
		//Tìm những cuốn sách thuộc nhà xuất bản ĐN và có discount < 3%
		for (Book book: books) {
			if(book.getPublisher().equals("NXB-DN") && (book instanceof TextBook)) {
				TextBook tb = (TextBook)book;
				if (tb.getDiscount() <3) {
					System.out.println("tb dn ---> " + tb);
				}
			}
		}
	}
}
