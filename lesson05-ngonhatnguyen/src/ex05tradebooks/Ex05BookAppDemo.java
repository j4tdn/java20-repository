package ex05tradebooks;

public class Ex05BookAppDemo {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGKToán1", 25, "NXB-NĐ", BookStatus.NEW);
		TextBook tb2 = new TextBook("SGKVăn6", 100, "NXB-ĐN", BookStatus.OLD);
		TextBook tb3 = new TextBook("SGKLý12", 120, "NXB-NĐ", BookStatus.OLD);
		
		ReferenceBook rb1 = new ReferenceBook("STKToán12", 42, "NXB-VN", 10);
		ReferenceBook rb2 = new ReferenceBook("STKSinh9", 160, "NXB-NĐ", 5);
		
		Book[] books = {tb1, tb2, tb3, rb1, rb2};
		System.out.println("Books:");
		printBooks(books);
		
		System.out.println("\n==========================================\n");
		
		Strategy getBooksOfPublisher = (Object nxb, Book[] bks) -> {
			for (Book book : books) {
				if (book.getPublisher().equals(nxb)) {
					System.out.println(book.getId() + " --> " + book.getPublisher());
				}
			}
		};
		System.out.println("Sách thuộc nhà xuất bản Nhi Đồng:");
		calStrategy("NXB-NĐ", books, getBooksOfPublisher);
		
		System.out.println("\n==========================================\n");
		
		System.out.println("Sách có đơn giá nhỏ hơn 50:");
		calStrategy("", books, (a, bks) -> {
				for (Book book : books) {
					if (book.getPrice() < 50) {
						System.out.println(book.getId() + " --> " + book.getPrice());
					}
				}
		});
		
		System.out.println("\n==========================================\n");
		
		System.out.println("Sách giáo khoa có đơn giá từ 100 đến 200:");
		calStrategy("", books, (a, bks) -> {
				for (Book book : books) {
					if (book instanceof TextBook && book.getPrice() >= 100 && book.getPrice() <= 200) {
						System.out.println(book.getId() + " --> " + book.getPrice());
					}
				}
		});
		
		System.out.println("\n==========================================\n");
		
		Book[] trade = {tb2, rb1};
		System.out.println("Đơn khách mua:");
		printBooks(trade);
		System.out.println("\nTổng tiền mà khách thanh toán --> " + getTotalMoney(trade));
	}
	
	private static void calStrategy(Object a, Book[] books, Strategy strategy) {
		strategy.process(a, books);
	}
	
	private static double getTotalMoney(Book...books) {
		double totalMoney = 0;
		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook tb = (TextBook)book;
				BookStatus bstatus = tb.getStatus();
				if (bstatus == BookStatus.OLD) {
					totalMoney += tb.getPrice() * (1 - 0.3);
				}
				totalMoney += tb.getPrice();
			} else {
				ReferenceBook rb = (ReferenceBook)book;
				totalMoney += rb.getPrice() * (1 + rb.getTax() / 100);
			}
		}
		return totalMoney;
	}
	
	private static void printBooks(Book...books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
