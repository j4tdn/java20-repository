package view;

import java.util.Arrays;

import bean.Book;
import bean.BookStatus;
import bean.ReferBook;
import bean.TextBook;

public class Ex05 {
	public static void main(String[] args) {
		Book[] books = createBookData();
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("\n==============================\n");

		System.out.println("findPublishName(books, \"NXB Nhi Dong\")");
		Book[] b1 = findPublishName(books, "NXB Nhi Dong");
		for (Book book : b1) {
			System.out.println(book);
		}

		System.out.println("\n==============================\n");

		System.out.println("getBooksPricedBelow50(books)");
		Book[] b2 = getBooksPricedBelow50(books);
		for (Book book : b2) {
			System.out.println(book);
		}

		System.out.println("\n==============================\n");

		System.out.println("getTextBooksInRange(books, 100, 200)");
		Book[] b3 = getTextBooksInRange(books, 100, 200);
		for (Book book : b3) {
			System.out.println(book);
		}
		
		System.out.println("\n==============================\n");
		Book[] books1 = new Book[2];
		books1[0] = new TextBook("SGKToan", 20, "NXB Giao duc", BookStatus.OLD);
		books1[1] = new ReferBook("STKVan", 50, "NXB Kim Dong", 0.3f);
		for (Book book : books1) {
			System.out.println(book);
		}
		System.out.println("getTotalSalesPrices ==> " + getTotalSalesPrices(books1));
	}

	// Viết hàm tạo dữ liệu sách cho cửa hàng.
	private static Book[] createBookData() {
		Book[] books = new Book[5];
		books[0] = new TextBook("SGKToan", 20, "NXB Giao duc", BookStatus.NEW);
		books[1] = new TextBook("SGKLy", 195, "NXB Nhi Dong", BookStatus.OLD);
		books[2] = new TextBook("SGKHoa", 175, "NXB Giao duc", BookStatus.OLD);

		books[3] = new ReferBook("STKVan", 50, "NXB Kim Dong", 0.3f);
		books[4] = new ReferBook("STKAnh", 10, "NXB Nhi Dong", 0.5f);

		return books;
	}

	// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
	private static Book[] findPublishName(Book[] books, String value) {
		Book[] result = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if (book.getPublisher().equals(value))
				result[i++] = book;
		}
		result = Arrays.copyOfRange(result, 0, i);
		return result;
	}

	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	private static Book[] getBooksPricedBelow50(Book[] books) {
		Book[] result = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if (book.getSalesPrices() < 50)
				result[i++] = book;
		}
		result = Arrays.copyOfRange(result, 0, i);
		return result;
	}

	// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
	private static Book[] getTextBooksInRange(Book[] books, float min, float max) {
		Book[] result = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if (book instanceof TextBook && book.getSalesPrices() < max && book.getSalesPrices() > min)
				result[i++] = book;
		}
		result = Arrays.copyOfRange(result, 0, i);
		return result;
	}

	/*
	 * Thực hiện giải lập. Khách hàng mua 1 cuốn sách giáo khoa, 1 cuốn sách tham
	 * khảo. Viết hàm tính tổng tiền mà khách hàng phải thanh toán. Biết rằng: -
	 * Sách giáo khoa - TextBook: Giảm 30% với sách cũ - Sách tham khảo - ReferBook:
	 * Thành tiền = đơn giá * (1 + %thuế)
	 */

	private static int getTotalSalesPrices(Book[] books) {
		int result = 0;
		for (Book book : books) {
			if (book instanceof TextBook) {
				if (((TextBook) book).getStatus() == BookStatus.OLD)
					result += book.getSalesPrices() * 0.7;
				else
					result += book.getSalesPrices();
			}
			else {
				result += book.getSalesPrices()*(1 + ((ReferBook)book).getTax());
			}
		}
		return result;
	}
}
