package c1.intheritance.classs;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB11","Toan","NXB-NV",BookStatus.NEW,2);
		TextBook tb2 = new TextBook("TB2","Ly 8","NXB-DN", BookStatus.NEW, 2);
		TextBook tb3 = new TextBook("TB3","Hoa 8","NXB-DN", BookStatus.OLD, 3);
		
		System.out.println("tb1==>\n"+tb1);
		
		System.out.println("\n==============\n");
	
		
	
		RefrenceBook rb1 = new RefrenceBook("RF23","Van 8", "NXB-DN", 8);
		RefrenceBook rb2 = new RefrenceBook("RF23","Anh 8", "NXB-HN", 8);
		RefrenceBook rb3 = new RefrenceBook("RF23","Su 8", "NXB-DN", 8);
		System.out.println("rb1=>  "+rb1);
		
		//Tạo ds những cuốn sách có NXB-DN và dis < 3 %
		Book[] books = {tb1,tb2,tb3,rb1,rb2,rb3};
		
		for(Book book:books) {
			if(book.getPublisher().equals("NXB-DN") && (book instanceof TextBook)) {
				TextBook tb = (TextBook)book;
				if(tb.getDiscount() < 3) {
					System.out.println("tb dn---> "+ tb);
				}
			}
		}
		
	}
}
