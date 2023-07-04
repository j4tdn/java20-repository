package exercises5;
public class BookApp {
	public static void main(String[] args) {
		TextBook SGK1 = new TextBook("1", 55d, "Nhi Đồng", Status.New);
		TextBook SGK2 = new TextBook("2", 45d, "Nhân Dân", Status.OLD);
		TextBook SGK3 = new TextBook("3", 30d, "Nhi Đồng", Status.OLD);
		ReferenceBook STK4 = new ReferenceBook("4", 49d, "Nhân Dân", 20d);
		ReferenceBook STK5 = new ReferenceBook("5", 98d, "Nhi Đồng", 10d);
		ReferenceBook STK6 = new ReferenceBook("6", 120d, "Nhân Dân", 15d);
		
		Books [] books = {SGK1, SGK2, SGK3, STK4, STK5, STK6};
		
		System.out.println("Books of pulisher Nhi Đồng: ");
		BookUtils.findPublisher(books);
		System.out.println("========================");
		System.out.println("Books have price less than 50: ");
		BookUtils.findPriceLessThan50(books);
		System.out.println("========================");
		System.out.println("Books have price from 100 to 200: ");
		BookUtils.findPrice(books);
	}
}
