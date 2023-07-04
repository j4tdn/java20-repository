package viewBook;

public class BuyingBook {
	public static void main(String[] args) {
		Book[] bookStore = BookStore();
		System.out.println("NXB-ND:");
		Utils.FindAuthor(bookStore);
		
		System.out.println("Gia nho hon 50d");
		Utils.FindPrice(bookStore);
		
		System.out.println("gia tu 100 den 200");
		Utils.FindPrice100To200(bookStore);
		TextBook tb1 = new TextBook("SGK 12", 110d, "NXB-ND", Status.NEW);
		ReferenceBook rfb1 = new ReferenceBook("STK12", 40d, "NXB-ND", 10d);
		System.out.println("so tien phai tra: " + Utils.order(tb1, rfb1));
	}
	
	private static Book[] BookStore() {
		return new Book[] {
				new TextBook("SGK 12", 110d, "NXB-ND", Status.NEW),
				new TextBook("SGK 11", 20d, "NXB-ND", Status.OLD),
				new TextBook("SGK 10", 40d, "NXB-DN", Status.NEW),
				
				new ReferenceBook("STK12", 40d, "NXB-ND", 10d),
				new ReferenceBook("STK11", 150d, "NXB-VN", 10d),
		};
	}
	
}
