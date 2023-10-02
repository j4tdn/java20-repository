package c1.inheritance.classs;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB1", "Toan 8", "NXB-VN", BookStatus.NEW, 2);
		TextBook tb2 = new TextBook("TB2", "Ly 8", "NXB-ĐN", BookStatus.NEW, 2);
		TextBook tb3 = new TextBook("TB3", "Hoa 8", "NXB-ĐN", BookStatus.OLD, 3);
		System.out.println("tb1 ==> " + tb1);
		System.out.println("tb2 ==> " + tb2);
		System.out.println("tb3 ==> " + tb3);
		
		System.out.println("\n==========================\n");
		ReferenceBook rb1 = new ReferenceBook("RF1", "Van 8", "NXB-ND", 8);
		ReferenceBook rb2 = new ReferenceBook("RF2", "Anh 8", "NXB-ND", 10);
		ReferenceBook rb3 = new ReferenceBook("RF3", "Su 8", "NXB-ND", 10);
		System.out.println("rb1 ==> " + rb1);
		System.out.println("rb2 ==> " + rb2);
		System.out.println("rb3 ==> " + rb3);
		
		System.out.println("\n==========================\n");
		//Tạo danh sách những cuốn sách
		Book[] books = {tb1, tb2, tb3, rb1, rb2, rb3};
		
		//Tìm những cuốn sách có nhần xuất bản ĐN và có discount < 3%
		for(Book book : books) {
			if(book.getPublisher().equals("NXB-ĐN") && (book instanceof TextBook)) {
				TextBook tb = (TextBook) book;
				if(tb.getDiscount() < 3) {
					System.out.println("tb dn ==> " + tb);
				}
			}
		}
	}
	
	
}
