package c1.iinheritance.classs;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB11", "toan8", "NXB VN", BookStatus.NEW, 2);
		TextBook tb2 = new TextBook("TB2", "Ly 8", "NXB-DN", BookStatus.NEW, 2);
		TextBook tb3 = new TextBook("TB3", "Hoa 8", "NXB-DN", BookStatus.OLD, 3);
		System.out.println("tb1: " + tb1);
		
		System.out.println("==========");
		ReferenceBook rb1 = new ReferenceBook("RF22", "VAN 8", "NXB ND", 5);
		ReferenceBook rb2 = new ReferenceBook("RF3", "Anh 8", "NXB DN", 10);
		ReferenceBook rb3 = new ReferenceBook("RF4", "Su 8", "NXB ND", 10);
		System.out.println("Rb1: " + rb1);
		
		System.out.println("======================");
		//tao nhung danh cuon sach, 
		Book[] books = {tb1, tb2, tb3, rb1, rb2, rb3};
		//tim nhung cuon sach thuoc NXB DN va co discount < 3%
		for(Book book: books) {
			if(book.getPublisher().equals("NXB-DN") && (book instanceof TextBook)) {
				TextBook tb = (TextBook)book;
				if(tb.getDiscount() < 3) {
					System.out.println("tb DN: " + tb);
				}
			}
		}
		
	}
}
