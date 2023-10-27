package view.d1.ex05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class BookApp {
	public static void main(String[] args) {
		Book[] books = mocData();
		printf("1. sach co NXB nhi dong",
				findBooks(books,book -> "nhi dong".equals(book.getPublisher())));
		printf("2. sach co don gia nho hon 50: ", 
				findBooks(books, book -> book.getSalesPrice() < 50));
		printf("3. sach co don gia tu 50 den 100: ", 
				findBooks(books, book -> {
					if(book instanceof ClassicalBook) {
						double salsePrice = book.getSalesPrice();
						return salsePrice > 50 && salsePrice < 100;
					}
					return false;
				}));
		
	BigDecimal totalOfMoney = billing(new Book[] {books[0], books[1], books[2], books[7], books[8]});
		System.out.println("total of Money: " + totalOfMoney);
		
		
	}
	
	
	private static Book[] mocData() {
		return new Book[] {
			new ClassicalBook("SGK12A", 90, "nhi dong", true),
			new ClassicalBook("SGK12B", 28, "nhi dong", false),
			new ClassicalBook("SGK12C", 60, "da nang", true),
			new ClassicalBook("SGK12D", 26, "da nang", true),
			new ClassicalBook("SGK12E", 15, "da nang", false),
			
			new ReferenceBook("STK12M", 90, "nhi dong", 5),
			new ReferenceBook("STK12N", 77, "nhi dong", 7),
			new ReferenceBook("STK12K", 60, "tu do", 2),
			new ReferenceBook("STK120", 88, "nhi dong", 5),
		};
	}
	
	private static BigDecimal billing(Book[] books) {
		double totalOfMoney = 0;
		
		for(Book book: books) {
			double price = book.getSalesPrice();
			if( book instanceof ClassicalBook) {
				ClassicalBook cbook = (ClassicalBook)book;
				if(!cbook.isStatus()) {
				price *= 0.7;
				}
			}else {
				ReferenceBook rb = (ReferenceBook) book;
				price *= (1 + rb.getTax()/100);
			}
			totalOfMoney += price;
		}
		
		return BigDecimal.valueOf(totalOfMoney).setScale(2, RoundingMode.HALF_UP);
	}
	
	private static Book[] findBooks(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book:books) {
			if(condition.test(book)) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(books, 0, count);
	}
	
	
	public static void printf(String prefix, Book[] books) {
		System.out.println(prefix);
		System.out.println("<--");
		for(Book book:books) {
			System.out.println(book);
		}
		System.out.println("-->\n");
	}
}
