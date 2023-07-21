package view.d1.ex05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.channels.Pipe;
import java.util.Arrays;

public class BookApp {
	public static void main(String[] args) {
		Book[] books = mockData();
		
		printf("1. Sách thuộc NXB 'Nhi Đồng'", 
				findBooks(books, book -> "Nhi Đồng".equals(book.getPublisher())));
		
		printf("2. Sách có đơn giá nhỏ hơn 50", 
				findBooks(books, book -> book.getSalesPrice() < 50));
		
		
		printf("3. Sách giáo khoa có đơn giá từ 50 đến 100", 
				findBooks(books, book -> {
					// if (book instanceof ReferenceBook) {
					if (book.getId().startsWith("SGK")) {
						double salesPrice = book.getSalesPrice();
						return salesPrice > 50 && salesPrice < 100;
					}
					return false;
				}));
		
		
		BigDecimal totalOfMoney = billing(new Book[] {books[0], books[1], books[7], books[8]});
		System.out.println("totalOfMoney --> " + totalOfMoney);
		
	}
	
	private static BigDecimal billing(Book[] books) {
		double totalOfMoney = 0;
		for (Book book: books) {
			double price = book.getSalesPrice();
			System.out.println(">> bookId(" + book.getId() + ") --> salesPrice(" + price +")");
			if (book instanceof ClassicalBook) {
				ClassicalBook cbook = (ClassicalBook) book;
				if (!cbook.isStatus()) {
					price *= 0.7;
				}
			} else {
				ReferenceBook rbook = (ReferenceBook) book;
				price *= (1 + rbook.getTax()/100);
			}
			System.out.println("promote --> " + price);
			totalOfMoney += price;
		}
		
		return BigDecimal.valueOf(totalOfMoney).setScale(2, RoundingMode.HALF_UP);
	}
	
	public static Book[] findBooks(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			if (condition.test(book)) {
				result[count++] =  book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
	private static Book[] mockData() {
		return new Book[] {
			new ClassicalBook("SGK12A", 28, "Nhi Đồng", true),
			new ClassicalBook("SGK12B", 40, "Nhi Đồng", false),
			new ClassicalBook("SGK12C", 15, "Việt Đức", true),
			new ClassicalBook("SGK12D", 80, "Nhi Đồng", true),
			new ClassicalBook("SGK12E", 55, "Nhi Đồng", true),
			new ClassicalBook("SGK12F", 33, "Tự do", false),
			new ReferenceBook("STK12M", 90, "Nhi Đồng", 5),
			new ReferenceBook("STK12N", 77, "Nhi Đồng", 7),
			new ReferenceBook("STK12K", 60, "Tự do", 2),
			new ReferenceBook("STK12O", 88, "Nhi Đồng", 5)
		};
	}
	
	public static void printf(String prefix, Book[] books) {
		System.out.println(prefix); 
		System.out.println("<--");
		for (Book book: books) {
			System.out.println(book);
		}
		System.out.println("-->\n");
	}
}
