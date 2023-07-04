package view;

import bean.Book;
import bean.ReferBook;
import bean.Status;
import bean.TextBook;

public class Ex05Apps {
	public static void main(String[] args) {
		Book[] books = mockData();
		findBookPublisher(books);
		findPrice(books);
		findTextBook(books);
		
	}
	private static Book[] mockData() {
		TextBook t1 = new TextBook("SGK01", 300, "Giáo dục", Status.NEW);
		TextBook t2 = new TextBook("SGK02", 35, "Nhi Đồng", Status.NEW);
		TextBook t3 = new TextBook("SGK03", 60, "Giáo dục", Status.OLD);
		ReferBook r1 = new ReferBook("STK01", 30, "Giáo dục", 10);
		ReferBook r2 = new ReferBook("STK02", 50, "Nhi Đồng", 10);
		return new Book[] {t1 ,t2 ,t3,r1,r2};
	}
	private static void findBookPublisher(Book[] books) {
		for (Book book : books) {
			if(book.getPublisher() == "Nhi Đồng") {	
				System.out.println(book);
			}
		}
	}
	private static void findPrice(Book[] books) {
		for (Book book : books) {
			if(book.getPrice() < 50) {	
				System.out.println(book);
			}
		}
	}
	private static void findTextBook(Book[] books) {
		for (Book book : books) {
			if(book instanceof TextBook) {
				TextBook textbook = (TextBook) book;
				if(textbook.getPrice() > 100 && textbook.getPrice() <200) {
					System.out.println(textbook);
				}
			}

		}
	}
}

