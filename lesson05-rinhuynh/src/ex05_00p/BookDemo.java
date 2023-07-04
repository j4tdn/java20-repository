package ex05_00p;

public class BookDemo {

	public static void main(String[] args) {
		TextBook t1 = new TextBook("SGK1", 65d, "Kim Đồng", true);
		TextBook t2 = new TextBook("SGK2", 20d, "Nhi Đồng", false);
		TextBook t3 = new TextBook("SGK3", 55d, "Lao Động", true);

		ReferBook r1 = new ReferBook("STK1", 100d, "Nhi Đồng", 30);
		ReferBook r2 = new ReferBook("STK2", 200d, "Trẻ", 20);

		Book[] books = { t1, t2, t3, r1, r2 };

		printBook(books);
		System.out.println("\n=====================\n");
		
		findBook(books);
		System.out.println("\n=====================\n");
		
		findBook2(books);
		System.out.println("\n=====================\n");

	}

	private static void printBook(Book[] books) {
		for (Book book : books) {
			if (book.getPublisher() == "Nhi Đồng")
				System.out.println(book);
		}
	}
	
	private static void findBook(Book[] books) {
		for(Book book : books)
		{
			if(book.getSalePrices() < 50)
			System.out.println(book);
		}
	}
	
	private static void findBook2(Book[] books) {
		for(Book book : books)
		{
			if(book.getId().contains("SGK")==true && book.getSalePrices()>=100 && book.getSalePrices() <= 200 )
			System.out.println(book);
		}
	}
	
	

}
