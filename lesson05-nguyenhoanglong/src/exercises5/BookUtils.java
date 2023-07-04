package exercises5;

public class BookUtils {
	public static void findPublisher(Books [] books) {
		for (Books book : books) {
			if (book.getPublisher() == "Nhi Đồng") {
				System.out.println(book);
			}
		}
	}
	
	public static void findPriceLessThan50(Books[] books) {
		for (Books book : books) {
			if (book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}
	
	public static void findPrice(Books[] books) {
		for (Books book : books) {
			if (book.getPrice() < 200 && book.getPrice() > 100) {
				System.out.println(book);
			}
		}
	}
}
