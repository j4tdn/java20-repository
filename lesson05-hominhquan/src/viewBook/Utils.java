package viewBook;

public class Utils {
	private Utils() {
	}
	
	public static void FindAuthor(Book[] books){
		for(Book book: books) {
			if(book.getAuthor() == "NXB-ND") {
				System.out.println(book);
			}
		}
	}
	public static void FindPrice(Book[] books) {
		for(Book book: books) {
			if(book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}
	public static void FindPrice100To200(Book[] books) {
		for(Book book: books) {
			if(book.getPrice() > 100 && book.getPrice() < 200) {
				System.out.println(book);
			}
		}
	}
	
	
	public static double order( TextBook textBook, ReferenceBook referenceBook) {
		double result;
		double priceTextBook = 0;
		if(textBook.getStatus() == Status.OLD) {
			priceTextBook = textBook.getPrice() * 0.3;
		}
		double referenBook = referenceBook.getPrice() * (1 + referenceBook.getTax()/100);
		result = priceTextBook + referenBook;
		return result;
	}
}
