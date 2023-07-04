package bai5;

public class Ex05DemoMain {
	public static void main(String[] args) {
		Book textBook01 = BookUtils.inputTextBook();
		Book textBook02 = BookUtils.inputTextBook();
		Book textBook03 = BookUtils.inputTextBook();
		Book referenceBook01 = BookUtils.inputReferenceBook();
		Book referenceBook02 = BookUtils.inputReferenceBook();

		Book[] books = new Book[] { textBook01, textBook02, textBook03, referenceBook01, referenceBook02 };
		
		System.out.println("\n Book of Nhi Dong");
		// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
		Book[] bookOfNhiDong = BookUtils.findBooksOfNhiDongPublisher(books);
		for(Book book : bookOfNhiDong) {
			System.out.println(book);
		}
		System.out.println("\nBook Price < 50");
		// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		Book[] bookLessThan50 = BookUtils.findBooksHavePriceLessThan50(books);
		for(Book book : bookLessThan50) {
			System.out.println(book);
		}
		
		System.out.println("\n TextBook Price 100 < p < 200");
		// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
		Book[] textBookBetween100And200 = BookUtils.findBooksHavePriceBetWeen100And200(books);
		for(Book book : textBookBetween100And200) {
			System.out.println(book);
		}
		
		//Thực hiện giải lập. Khách hàng mua 1 cuốn sách giáo khoa, 1 cuốn sách tham khảo.
		Book[] bookPurcharse = new Book[] {textBook01,referenceBook01};
		float totalMoney = BookUtils.getTotalPrice(bookPurcharse);
		System.out.println("Tổng tiền phải trả là: " + totalMoney);
	}
}
