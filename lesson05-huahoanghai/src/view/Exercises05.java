package view;

import bean.Book;
import bean.BookStatus;
import bean.RefrenceBook;
import bean.TextBook;

public class Exercises05 {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK-01", 180, "NXB-ND", BookStatus.NEW);
		TextBook tb2 = new TextBook("SGK-02", 40, "NXB-NV", BookStatus.OLD);
		TextBook tb3 = new TextBook("SGK-03", 120, "NXB-SG", BookStatus.NEW);
	
		
		System.out.println("\n==============\n");
		RefrenceBook rb1 = new RefrenceBook("STK-01",90,"NXB-ND" , 5);
		RefrenceBook rb2 = new RefrenceBook("STK-02",45,"NXB-SG" , 9);
		
		Book[] books = {tb1,tb2,tb3,rb1,rb2};
		
		for(Book book:books) {
			if(book.getPublisher().equals("NXB-ND") ) {
					System.out.println("Số sách thuộc nhà xuất bản Nhi Đồng:\n"+ book);
			}	
		}
		for(Book book:books) {
			if(book.getPrice() < 50) {
				System.out.println("Sách có đơn giá nhỏ hơn 50:\n" +book);
			}
		}
		for(Book book:books) {
			if(book.getPrice() > 100 && book.getPrice() <200) {
				System.out.println("Sách giáo khoa có đơn giá từ 100 đến 200\n" +book);
			}
		}
		for (Book book : books) {
		    if (book instanceof RefrenceBook) {
		        RefrenceBook refBook = (RefrenceBook) book;
		        float totalPrice = refBook.getPrice() * (1 + (refBook.getTax() / 100));
		        System.out.println("Thành tiền của sách tham khảo " + refBook.getId() + ": " + totalPrice);
		    }
		}
		 for (Book book : books) {
	            if (book instanceof TextBook && ((TextBook) book).getStatus() == BookStatus.OLD) {
	                TextBook tb = (TextBook) book;
	                float discountedPrice = tb.getPrice() * 0.7f;
	                System.out.println("Sách giáo khoa (cũ) - " + tb.getId() + ": Giá sau giảm giá: " + discountedPrice);
	            }
	        }
	}
	
}

