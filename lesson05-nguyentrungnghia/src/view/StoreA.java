package view;

import java.sql.Ref;

import bean.Book;
import bean.BookStatus;
import bean.ReferenceBook;
import bean.TextBook;

public class StoreA {

	public static void main(String[] args) {
		Book[] books = dataOfBooks();
		findBooksByPublisher(books);
		findBooksBysalePrices(books);
		findBooksBysalePrices1(books);
	}

	private static Book[] dataOfBooks() {
		return new Book[] { 
				new TextBook("SGK1", 100, "NXB Nhi Đồng", BookStatus.NEW),
				new TextBook("SGK2", 30, "NXB Đà Nẵng", BookStatus.OLD),
				new TextBook("SGK3", 130, "NXB Nhi Đồng", BookStatus.NEW),
				new ReferenceBook("STK1", 100, "NXB Kim Đồng", 10),
				new ReferenceBook("SGK3", 200000, "NXB Kim Đồng", 5) 
		};
	}

	private static void findBooksByPublisher(Book[] books) {
		for (Book book : books) 
			if (book.getPublisher().equals("NXB Nhi Đồng")) {
				if (book instanceof TextBook) {
					TextBook tb = (TextBook) book;
					System.out.println(tb);
				}
				else {
					ReferenceBook rb = (ReferenceBook) book;
					System.out.println(rb);
				}
			}
	}
	
	private static void findBooksBysalePrices(Book[] books) {
		for (Book book : books) 
			if (book.getSalePrices() < 50 ) {
				if (book instanceof TextBook) {
					TextBook tb = (TextBook) book;
					System.out.println(tb);
				}
				else {
					ReferenceBook rb = (ReferenceBook) book;
					System.out.println(rb);
				}
			}
	}
	
	private static void findBooksBysalePrices1(Book[] books) {
		for (Book book : books) 
			if (book.getSalePrices() >= 100 && book.getSalePrices() <= 200) {
				if (book instanceof TextBook) {
					TextBook tb = (TextBook) book;
					System.out.println(tb);
				}
				else {
					ReferenceBook rb = (ReferenceBook) book;
					System.out.println(rb);
				}
			}
	}
	
}
