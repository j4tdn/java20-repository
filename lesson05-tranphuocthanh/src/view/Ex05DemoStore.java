package view;

import java.util.Arrays;

import bean.Book;
import bean.Customer;
import bean.ReferenceBook;
import bean.Status;
import bean.TextBook;

public class Ex05DemoStore {
	public static void main(String[] args) {
		Customer c1 = new Customer("c123", "tom", 12344, "Đà Nẵng");
		Book[] books = createTextBook();
		double price = calSumOfMoney(new Book[] {books[1], books[3]});
		
		
		System.out.println("c1 --> " + c1 + "\nsố tiền phải trả: " + price);
		
	}

	private static Book[] createTextBook() {
		return new Book[] { 
				new TextBook("SGK", 110, "Nhi Đồng", Status.NEW),
				new TextBook("SGK", 100, "Hà Nội", Status.OLD),
				new TextBook("SGK", 40, "GDVN", Status.NEW),
				new ReferenceBook("STK", 170, "GDVN", 0.5d), 
				new ReferenceBook("STK", 30, "Nhi Đồng", 0.3d) };
	}

	private static Book[] findBook(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPublisher().equals("Nhi Đồng")) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Book[] findBookByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPrice() < 50) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Book[] findTextBookByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook tb = (TextBook) book;
				if (tb.getPrice() > 100 && tb.getPrice() < 200) {
					result[count++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static double calSumOfMoney(Book[] books) {
		double price = 0;
		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook tb = (TextBook) book;
				if (tb.getStatus().equals(Status.OLD)) {
					price += tb.getPrice() * 0.3;
				}
			} else {
				ReferenceBook rb = (ReferenceBook) book;
				price += (double) rb.getPrice() * (1 + rb.getTax());
			}
		}
		return price;
	}

}
