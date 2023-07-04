package bai5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BookUtils {
	static Scanner sc = new Scanner(System.in);

	public static TextBook inputTextBook() {
		System.out.println("\n------------------------\n");
		System.out.println("Nhập mã sách: ");
		String id = sc.nextLine();
		System.out.println("Nhập đơn giá: ");
		float price = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập nhà xuất bản: ");
		String publisher = sc.nextLine();
		System.out.println("Chọn tình trạng: 1. Mới, 2 cũ");
		BookStatus bookStatus;
		int status = Integer.parseInt(sc.nextLine());
		if (status == 1) {
			bookStatus = BookStatus.NEW;
		} else {
			bookStatus = BookStatus.OLD;
		}
		TextBook textBook = new TextBook(id, price, publisher, bookStatus);
		return textBook;
	}

	public static ReferenceBook inputReferenceBook() {
		System.out.println("\n------------------------\n");
		System.out.println("Nhập mã sách: ");
		String id = sc.nextLine();
		System.out.println("Nhập đơn giá: ");
		float price = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập nhà xuất bản: ");
		String publisher = sc.nextLine();
		System.out.println("Nhập thuế: ");
		int tax = Integer.parseInt(sc.nextLine());
		ReferenceBook referenceBook = new ReferenceBook(id,price, publisher, tax);
		return referenceBook;
	}
	
	public static Book[] findBooksOfNhiDongPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book : books) {
			if(book.getPublisher().equals("Nhi Đồng")) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	public static Book[] findBooksHavePriceLessThan50(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book : books) {
			if(book.getPrice() < 50.0f) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	public static Book[] findBooksHavePriceBetWeen100And200(Book[] books) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book : books) {
			if(book instanceof TextBook && book.getPrice() > 100.0f && book.getPrice() < 200.0f) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	public static float getTotalPrice(Book[] books) {
		float sum = 0.0f;
		for(Book book : books) {
			//Nếu là sách giáo khoa
			if(book instanceof TextBook) {
				//Nếu là sách cũ
				if(((TextBook) book).getBookStatus().equals(BookStatus.OLD)) {
					sum += book.getPrice() - (book.getPrice() * 0.3f);
				//Sách mới
				} else {
					sum += book.getPrice();
				}
			//Sách tham khảo
			} else {
				sum += book.getPrice() * ( 1 + ((ReferenceBook) book).getTax());
			}
		}
		return sum;
	}
}
