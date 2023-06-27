package c1.inheritance.classs;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1= new TextBook("TB11","Toán 8","NXB-VN",BookStatus.NEW,2);
		TextBook tb2 = new TextBook("TB12","Lý 8","NXB-ĐN",BookStatus.NEW,2);
		TextBook tb3 = new TextBook("TB13","Hóa 8","NXB-ĐN",BookStatus.OLD,3);
		System.out.println(tb1);
		
		System.out.println("\n**************");
		ReferenceBook rb1 = new ReferenceBook("RB22", "Văn 8", "NXB-ND", 8);
		ReferenceBook rb2 = new ReferenceBook("RB23", "Anh 8", "NXB-ND", 10);
		ReferenceBook rb3 = new ReferenceBook("RB24", "Sử 8", "NXB-HN", 10);
		System.out.println(rb1);
		
		//tạo sanh sách những cuốn sách 
		Book[] books = {tb1,tb2,tb3,rb1,rb2,rb3};
		//tìm những cuốn sách thuộc nhà xuất bản ĐN và có discount < 3%
		for(Book book:books)
		{
			if(book.getPublisher().equals("NXB-ĐN")&& (book instanceof TextBook))
			{
				TextBook tb =(TextBook)book;//đều trỏ lên 1 ô nhớ trên HEAP
				if(tb.getDiscount()<3)
				{
					System.out.println("tb đn ---> "+tb);
				}
			}
		}
		
		
	}
}
