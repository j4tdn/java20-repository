package exercise5;

import java.sql.Ref;

public class BookSaleSimulator {
	public static void main(String[] args) {
		Book[] bookList = new Book[5]; 
		createBookList(bookList);
		System.out.println("\n=========================================\n");
		System.out.println("Những cuốn sách của nxb Nhi Đồng là: ");
		findPublisher(bookList);
		System.out.println("\n=========================================\n");
		System.out.println("Những cuốn sách có giá dưới 50 là: ");
		findPriceUnder50(bookList);
		System.out.println("\n=========================================\n");
		System.out.println("Những cuốn sách có giá từ 100 đến 200 là: ");
		findPricefrom100to200(bookList);
		System.out.println("\n=========================================\n");
		System.out.println("Tổng tiền thanh toán cho 2 cuốn sách: " + calcTotalPrice((TextBook)bookList[0], (ReferenceBook)bookList[4]));
	}
	
	public static void createBookList(Book[] bookList) {
		Book text1 = new TextBook("SGK120", 150, "Nhi Đồng", bookStatus.NEW);
		bookList[0] = text1;
		
		Book text2 = new TextBook("SGK118", 70, "Hội Nhà Văn", bookStatus.OLD);
		bookList[1] = text1;
		
		Book text3 = new TextBook("SGK130", 30, "Nhi Đồng", bookStatus.NEW);
		bookList[2] = text1;
		
		Book ref1 = new ReferenceBook("STK100", 200, "Sự Thật", 10);
		bookList[3] = ref1;
		
		Book ref2 = new ReferenceBook("STK107", 160, "Hồng Đức", 5);
		bookList[4] = ref2;
	}
	
	public static void findPublisher(Book[] bookList) {
		for(Book b : bookList) {
			if(b.getPublisher().equals("Nhi Đồng"))
				System.out.println(b.toString());
		}
	}
	
	public static void findPriceUnder50(Book[] bookList) {
		for(int i = 0; i < bookList.length; i++) {
			if (bookList[i].getPrice() < 50)
				System.out.println(bookList[i]);
		}
	}
	
	public static void findPricefrom100to200(Book[] bookList) {
		for(Book b : bookList) {
			if(b.getPrice() >= 50 && b.getPrice() <= 200)
				System.out.println(b.toString());
		}
	}
	
	public static double calcTotalPrice(TextBook textBook, ReferenceBook refBook) {
		double totalPrice = 0;
		if(textBook.getStatus().equals(bookStatus.OLD)) {
			totalPrice += textBook.getPrice() - 0.3 * textBook.getPrice();
		} else {
			totalPrice += textBook.getPrice();
		}
		
		totalPrice = totalPrice + refBook.getPrice()*(1 + refBook.getTax());
		
		return totalPrice;
	}
}
